package com.aurionpro.test;

import com.aurionpro.model.*;

public class WokingTest {

	public static void main(String[] args) {
		IWorkable manager = new Manager();
		atTheWorkStation(manager);
		IEatable man = new Manager();
		atTheCanteen(man);
		IWorkable robo = new Robot();
		atTheWorkStation(robo);

	}

	private static void atTheWorkStation(IWorkable work) {
		work.StartWork();
		work.StopWork();

	}

	private static void atTheCanteen(IEatable eat) {
		eat.StartEat();
		eat.StopEat();

	}

}
