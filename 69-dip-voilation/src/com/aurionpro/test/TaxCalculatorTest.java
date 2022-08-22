package com.aurionpro.test;
import java.util.Locale;

import com.aurionpro.model.DBLogger;
import com.aurionpro.model.LogType;
import com.aurionpro.model.TaxCalculator;
import com.aurionpro.test.*;
public class TaxCalculatorTest {
	public static void main(String[] args) {
		DBLogger db=new DBLogger();
		TaxCalculator tax=new TaxCalculator(LogType.DB);
		tax.CalculateTax(10000, 0);
	}
}

