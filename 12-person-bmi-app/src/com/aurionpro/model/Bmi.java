package com.aurionpro.model;

import com.aurionpro.test.*;

public class Bmi {
	Person person;
	private double bmi;

	public Bmi(Person person) {
		this.person = person;
		this.bmi = CalculateBmi();
	}

	public double getBmi() {
		return bmi;
	}

	public Person getPerson() {
		return person;
	}

	private double CalculateBmi() {
		double heightInMeters = person.getHeight() / 100;
		bmi = person.getWeight() / (heightInMeters * heightInMeters);
		return bmi;

	}

	public String getBodyType() {
		if (bmi < 18)
			return "under Weight";
		if (bmi > 18 && bmi < 25)
			return "Normal";
		if (bmi > 25)
			return "Obese";
		return null;

	}

}
