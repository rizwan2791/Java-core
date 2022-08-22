package com.aurionpro.model;

public class Boy extends Man {
	@Override
	public void read() {
		System.out.println("Boy is Reading");
	}

	@Override
	public void play() {
		System.out.println("Boy is playing");
	}

	public void laugh() {
		System.out.println("Hahahhah");
	}

}
