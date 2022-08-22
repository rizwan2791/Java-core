package com.aurionpro.test;
import com.aurionpro.model.*;
public class WokingTest {

	public static void main(String[] args) {
		IWorker manager = new Manager();
		atTheWorkStation(manager);
		atTheCanteen(manager);
		IWorker robo = new Robot();
		atTheWorkStation(robo);
		atTheCanteen(robo);
		
	}

	private static void atTheCanteen(IWorker worker) {
		worker.StartEat();
		worker.StopEat();
		
		
	}

	private static void atTheWorkStation(IWorker worker) {
		worker.StartWork();
		worker.StopWork();
		
	}

}
