package com.aurionpro.model;

public class TaxCalculator {
	LogType logger;

	public TaxCalculator(LogType logger) {
		super();
		this.logger = logger;
	}
	public double CalculateTax(int amount,int rate) {
		double tax=0;
		try {
			tax=amount/rate;
		}catch(Exception e)
		{
			if (logger == LogType.DB)
				new DBLogger().log("An err has been occured "+e.getMessage());
			else if (logger == LogType.FILE)
				new DBLogger().log("An err has been occured "+e.getMessage());
		}
		return tax;
	}

}
