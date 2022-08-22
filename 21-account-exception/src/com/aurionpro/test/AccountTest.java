package com.aurionpro.test;

import com.aurionpro.model.*;

public class AccountTest {

	public static void main(String[] args) {
		Account acc = new Account(101, "riz", 2000);
		try {
			acc.withdraw(4000000);
		} catch (InsufficeintFundsException e) {
			System.out.println(e.getMessage());
		}

	}
}
