package com.aurionpro.test;
import com.aurionpro.model.*;
public class FixedDepositTest {

	public static void main(String[] args) {
		FixedDeposit fix=new FixedDeposit("Rizwan", 10000, 2, new Diwali());
		FixedDeposit fix1=new FixedDeposit("Rizwan", 10000, 2, new Eid());
		fix.CalculateSimpleInterest();
		fix1.CalculateSimpleInterest();
	}

}
