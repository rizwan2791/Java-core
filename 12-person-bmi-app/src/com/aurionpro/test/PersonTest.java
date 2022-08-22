package com.aurionpro.test;

import com.aurionpro.model.*;

public class PersonTest {

	public static void main(String[] args) {
		Person objOne = new Person("rizwan", 19, 180, 70, GenderOption.MALE);
		Bmi bmi = new Bmi(objOne);
		double bmis = bmi.getBmi();
		System.out.println(objOne);
		System.out.println("BMI : " + bmis);
		String weights = bmi.getBodyType();
		System.out.println("BMI Status :" + weights);

	}

}
