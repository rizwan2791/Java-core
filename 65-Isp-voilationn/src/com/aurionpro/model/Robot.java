package com.aurionpro.model;

public class Robot implements IWorker {

	@Override
	public void StartWork() {
		System.out.println("Robot Starts Working");
	}

	@Override
	public void StopWork() {
		System.out.println("Robot Stops Working");

	}

	@Override
	public void StartEat() {
		throw new RuntimeException("Robot cant Eat");

	}

	@Override
	public void StopEat() {
		throw new RuntimeException("Robot cant Eat");

	}

}
