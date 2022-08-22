package com.aurionpro.model;

public class Robot implements IWorkable {

	@Override
	public void StartWork() {
		System.out.println("Robot Starts Working");
	}

	@Override
	public void StopWork() {
		System.out.println("Robot Stops Working");

	}


}
