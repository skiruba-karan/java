package com.wipro.java.game;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {
	private static final String DB_URL = "jdbc:mysql://localhost:3306/game_db";
	private static final String DB_USER = "root";  
    private static final String DB_PASSWORD = "root"; 
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        // Check if the user already exists in the database
        int previousAttempts = getPreviousAttempts(username);
        
        int targetNumber = random.nextInt(100) + 1;
        int attempts = 0;
        boolean isCorrect = false;

        System.out.println("Guess a number between 1 and 100:");

        while (!isCorrect) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess > targetNumber) {
                System.out.println("Too high! Try again.");
            } else if (guess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("🎉 Correct! You guessed the number in " + attempts + " attempts.");
                isCorrect = true;
            }
        }

        // Update database
        updateDatabase(username, previousAttempts + attempts);
        System.out.println("Your score has been saved!");
        System.out.println();
        displayLeaderboard();
        scanner.close();
    }
    private static int getPreviousAttempts(String username) {
        int attempts = 0;
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement stmt = conn.prepareStatement("SELECT attempts FROM player_scores WHERE username = ?")) {
            
            stmt.setString(1, username);
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                attempts = rs.getInt("attempts");
                System.out.println("Welcome back, " + username + "! Previous attempts: " + attempts);
            } else {
                System.out.println("New player detected. Good luck!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return attempts;
    }
    private static void displayLeaderboard() {
        String query = "SELECT username, attempts, score FROM player_scores ORDER BY score DESC LIMIT 10"; // Top 10 players
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
             
             System.out.println("Leaderboard:");
             int rank = 1;
             while (rs.next()) {
                 String username = rs.getString("username");
                 int attempts = rs.getInt("attempts");
                 int score = rs.getInt("score");
                 System.out.println(rank + ". " + username + " - Score: " + score + ", Attempts: " + attempts);
                 rank++;
             }
         } catch (SQLException e) {
             e.printStackTrace();
         }
    }


    // Update player attempts in the database
    private static void updateDatabase(String username, int newAttempts) {
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String query = "INSERT INTO player_scores (username, attempts, score) VALUES (?, ?, ?) " +
                           "ON DUPLICATE KEY UPDATE attempts = ?, score = ?";
            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                int score = 100 - newAttempts; // Basic scoring (less attempts = higher score)
                stmt.setString(1, username);
                stmt.setInt(2, newAttempts);
                stmt.setInt(3, score);
                stmt.setInt(4, newAttempts);
                stmt.setInt(5, score);

                stmt.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
  
    
}
