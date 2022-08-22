package com.aurionpro.test;
import com.aurionpro.model.*;
public class FestivalTest {
	public static void main(String[] args) {
		FixedDeposit fix=new FixedDeposit("rizwan", 10000, 2, FestivalType.DIWALI);
		FixedDeposit fix1=new FixedDeposit("rizwan", 10000, 2, FestivalType.OTHER);
		fix.calculateSimpleIntrest();
		fix1.calculateSimpleIntrest();
	}

}
