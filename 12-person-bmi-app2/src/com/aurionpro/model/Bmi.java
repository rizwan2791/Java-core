package com.aurionpro.model;

import com.aurionpro.test.*;

public class Bmi {
	Person person;
	double bmi;
	public Bmi(Person person) {
		this.person = person;
		this.bmi = Bmi();
	}
	public Person getPerson() {
		return person;
	}
	public double getBmi() {
		return bmi;
	}
	public double Bmi() {
		double getHeight=person.getHeight()/100;
		bmi=person.getWeight()/( getHeight* getHeight);
		return bmi;
	}
	
	public String getweightType() {
		if (bmi<18)
			return "Underweight";
		if (bmi >18 && bmi<=25)
			return "Normal";
		else
			return "Overweight";
			
	}

	}


