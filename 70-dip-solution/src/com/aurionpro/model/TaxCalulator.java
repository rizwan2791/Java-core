package com.aurionpro.model;

public class TaxCalulator {

	ILogger logger;

	public TaxCalulator(ILogger logger) {
		super();
		this.logger = logger;
	}

	public double calculateTax(int amount, int taxRate) {
		try {
			double tax = 0;
			tax = amount / taxRate;
			logger.logs("hello");
		} catch (Exception e) {
			logger.logs("error" + e.getMessage());

		}

		return taxRate;

	}

}