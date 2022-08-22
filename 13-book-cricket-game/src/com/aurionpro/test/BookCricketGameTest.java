package com.aurionpro.test;
import java.util.Scanner;
import com.aurionpro.model.*;
public class BookCricketGameTest  {
	public static void main(String args[]) {
		Player[] players=new Player[2];
		players[0]=new Player();
		players[1]=new Player();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Player 1 name :");
		players[0].setName(sc.next());
		System.out.println("Enter Player 2 name :");
		players[1].setName(sc.next());
		BookCrickets obj= new BookCrickets();
		obj.Play(players);
		obj.getResult(players);
		
		
		
	}

}
