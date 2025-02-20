package com.wipro.java;

import java.util.Scanner;

public class Program2 {
    public static int countPairs(int N, int[] A) {
        int count = 0;
        
        // Iterate through all pairs (i, j)
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                int minHeight = Math.min(A[i], A[j]);
                boolean isValid = true;
                
                // Check heights between i and j
                for (int k = i + 1; k < j; k++) {
                    if (A[k] >= minHeight) {
                        isValid = false;
                        break;
                    }
                }

                // If the pair is valid, increment the count
                if (isValid) {
                    count++;
                }
            }
        }

        return count;
    }

    // Non-editable part starts here
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        int[] A = new int[N];
        String[] temp = scanner.nextLine().split(" ");
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(temp[i]);
        }
        System.out.println(countPairs(N, A));
        scanner.close();
    }
}
