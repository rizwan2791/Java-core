package com.aurionpro.test;
import com.aurionpro.model.*;
public class AccountTest {

	public static void main(String[] args) {
		SavingAccount sav=new SavingAccount(102,"Sahil",9000);
		printAddAmount(sav.deposit(500));
		printWithDrawTransacton(sav.withdraw(500));
		printAccountDetails(sav);
		CurrentAccount cur=new CurrentAccount(103,"Rahil",1000);
		printAddAmount(cur.deposit(500));
		printWithDrawTransacton(cur.withdraw(40000));
		printAccountDetails(cur);
	}

	private static void printWithDrawTransacton(boolean withdraw) {
		if (withdraw) {
			System.out.println("Withdraw Sucessfully");
		}
		else {
			System.out.println("Transaction failed : Could not withdraw");
		}
		
	}
		private static void printAccountDetails(Account acc) {
			System.out.println("Account number :"+acc.getId());
			System.out.println("Account Holder Name :"+acc.getName());
			System.out.println("Account balance : "+acc.getBalance());
		}
		private static void printAddAmount(boolean deposit) {
			if (deposit) {
				System.out.println("Balance negative cannot be Added");
			}
			else {
				System.out.println("Balance Added");
			}
		}
		
}


	
	
