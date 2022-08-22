
import java.util.*;

public class Commandline {
	public static void main(String[] args) {
		int turn = 1;
		Scanner sc = new Scanner(System.in);
		char input;
		System.out.println("Roll or hold? (r/h) : ");
		input = sc.next().charAt(0);
		int turnScore = 0;
		int totalScore = 0;
		System.out.println("Turn " + turn);
		while (input == 'r') {
			int cp = getRandomto5();
			System.out.println("Die :" + cp);
			if (cp == 1) {
				turnScore = 0;
				System.out.println("TURN OVER NO SCORE ");
				turn++;
				totalScore = 0;
				System.out.println("TURN " + turn);
			} else {
				turnScore = turnScore + cp;
				totalScore = totalScore + cp;
			}
			System.out.print("Roll or hold? (r/h) : ");
			input = sc.next().charAt(0);
			if (input == 'h') {
				System.out.println("Score for Turn :" + turnScore);
				System.out.println("Total Score :" + totalScore);
				turn++;
				turnScore = 0;
				if (totalScore >= 20) {
					System.out.println("You finished in " + (turn - 1) + "  turns!");
					System.out.println("Game Over !");
					break;
				}
				System.out.println("TURN " + turn);
				System.out.print("Roll or hold? (r/h) : ");
				input = sc.next().charAt(0);
			}
		}

	}

	static int getRandomto5() {
		int random = (int) (Math.random() * 5) + 1;
		return random;
	}

}