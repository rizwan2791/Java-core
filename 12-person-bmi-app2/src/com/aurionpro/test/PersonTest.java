package com.aurionpro.test;

import com.aurionpro.model.*;

public class PersonTest {

	public static void main(String[] args) {
	Person person=new Person("Rizwan", 19, 180, 70, GenderOption.MALE);
    Bmi bmi=new Bmi(person);
    System.out.println(bmi.Bmi());
    System.out.println(bmi.getweightType());
	}

}
