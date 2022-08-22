package com.aurionpro.model;

public class Infant extends Man {
	@Override
	public void read() {
		System.out.println("Infant is Reading");
	}
	@Override
	public void play() {
		System.out.println("Infant is playing");
	}
}
