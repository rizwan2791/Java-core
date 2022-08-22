package com.aurionpro.test;

import com.aurionpro.model.*;
public class TaxCalculatorTest {
	public static void main(String[] args) {
		TaxCalulator tax=new TaxCalulator(new FileLogger());
		tax.calculateTax(1000, 4);
		
	
	}
}

