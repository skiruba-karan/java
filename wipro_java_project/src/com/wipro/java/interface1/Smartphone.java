package com.wipro.java.interface1;

public class Smartphone implements Camera, MusicPlayer{
	public void takePhoto() {
		System.out.println("Capturing Photo");
	}
	public void playMusic() {
		System.out.println("Playing Music");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Smartphone mobile = new Smartphone();
		mobile.takePhoto();
		mobile.playMusic();
	}

}
