package com.aurionpro.test;
import com.aurionpro.model.*;
public class ShoppingMallTest {

	public static void main(String[] args) {
		DebitCard debit=new DebitCard();
		ShoppingMall shop=new ShoppingMall(debit);
		shop.PurchansingUsingCard(50000);
		CreditCard cred=new CreditCard();
		ShoppingMall shoper=new ShoppingMall(cred);
		shoper.PurchansingUsingCards(500000);
	}

}
