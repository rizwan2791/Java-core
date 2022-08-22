package com.aurionpro.test;
import java.util.ArrayList;
import com.aurionpro.model.Player;
import com.aurionpro.model.PlayerInfo;

public class PlayerTest {
	public static void main(String[] args) {
		ArrayList<Player> players = new ArrayList<Player>();
				players.add(new Player(101, "rizwan", 300, 120000, 80));
				players.add(new Player(102, "sarah", 500, 11000, 150));
				players.add(new Player(103, "snow", 300, 1000, 500)); 
				players.add(new Player(104, "sevenge", 70, 3500, 50));
				players.add(new Player(105, "rex", 75, 2000, 100));
				players.add(new Player(106, "horizon", 20, 500, 4));

		PlayerInfo play = new PlayerInfo(players);
		ArrayList<Player> ALister = play.getALister();
		for (Player p : ALister) {
			System.out.println(p.toString());
		}
		System.out.println("------------------------");

		ArrayList<Player> BLister = play.getBLister();
		for (Player p : BLister) {
			System.out.println(p.toString());
		}
		System.out.println("------------------------");

		ArrayList<Player> CLister = play.getCLister();
		for (Player p : CLister) {
			System.out.println(p.toString());
		}
		
	}

	
}