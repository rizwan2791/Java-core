package com.aurionpro.test;
import com.aurionpro.model.*;
public class ShoppingMallTest {

	public static void main(String[] args) {
		IBankTransations bank = new DebitCard();
		ShoppingMall shop=new ShoppingMall(bank);
		shop.PurchansingUsingCard(50000);
		IBankTransations trans = new CreditCard();
		ShoppingMall shopee=new ShoppingMall(trans);
		shopee.PurchansingUsingCard(50000);
		
	}

}
