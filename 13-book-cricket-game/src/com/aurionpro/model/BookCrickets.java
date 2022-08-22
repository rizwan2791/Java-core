package com.aurionpro.model;

import java.util.Scanner;

public class BookCrickets {
	private int target=0;

	public void Play(Player[] players) {
		Scanner sc = new Scanner(System.in);
		for (Player p : players) {
			System.out.println("Welcome :  " + p.getName());
			System.out.println("=========================");
			System.out.print("Enter 1 to Start the Game 0 to Exit : ");
			int start = sc.nextInt();;
			int totalScore=0;
			while (start == 1) {
				int cp = (int) (Math.random() * 300) + 1;
				int pn= cp%7;
				p.setTurns(p.getTurns()+1);
				p.setScore(p.getScore()+(totalScore+pn));
				printTurnDetails(p,pn);
				if(pn ==0) { 
					System.out.println(p.getName()+" Out ");
					System.out.println("Target : "+(players[0].getScore()+1));
					break;
				}
				System.out.print("Enter 1 to Open Book : ");
				start= sc.nextInt();
		
			}	
		
	}
}

	private void printTurnDetails(Player p, int turnScore) {
		System.out.println("Turn Score : "+turnScore);
		System.out.println("TotalScore : "+p.getScore());
		System.out.println("Total Rounds :  "+p.getTurns());
		System.out.println("---------------------");
		
	}
	public void getResult(Player[] players) {
		System.out.println("Match ended");
		Player winner;
		if(players[0].getScore() > players[1].getScore()) {
			winner=players[0];
		}else {
			winner = players[1];
		}
		printScoreSummary(players);
		System.out.println(winner.getName()+" wins !!!");
		
	}

	private void printScoreSummary(Player[] players) {
		System.out.println("Match summary");
		System.out.println("---------------------");
		for(Player x:players) {
			System.out.println("Name : "+x.getName());
			System.out.println("Score : "+x.getScore());
			System.out.println("Turns : "+x.getTurns());
			System.out.println("-------------------------");
		}
		
		
	}

}
