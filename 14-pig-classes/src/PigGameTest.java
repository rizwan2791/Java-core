import java.util.Scanner;

public class PigGameTest {
	public static void main(String[] args) {
		PigDiceGame pig = new PigDiceGame();
		System.out.println("TURN " + (pig.getTurn() + 1));
		while ((pig.getTotalScore() + pig.getTurnScore()) < 20) {
			gameStart(pig);
		}
		pig.updateTotalScore();
		System.out.println("You have Won!!!");
		pig.incrementTurn();
		printScoreDetails(pig);
	}

	private static void gameStart(PigDiceGame pig) {
		Scanner sc = new Scanner(System.in);
		char input;
		System.out.print("Roll or hold? (r/h):");
		input = sc.next().charAt(0);
		if (input == 'r') {
			rollingDice(pig);
		}
		if (input == 'h') {
			holdingDice(pig);
			return;
		}
	}

	private static void resetingDice(PigDiceGame pig) {
		System.out.println("Your Turn Ends!!");
		pig.incrementTurn();
		printScoreDetails(pig);
		System.out.println("TURN " + (pig.getTurn() + 1));
	}

	private static int rollingDice(PigDiceGame pig) {
		int dice;
		dice = pig.play();
		System.out.println(dice);
		if (dice == 1) {
			resetingDice(pig);
		}
		return dice;
	}

	private static void holdingDice(PigDiceGame pig) {
		pig.updateTotalScore();
		pig.incrementTurn();
		printScoreDetails(pig);
		pig.updateTurnScoreToZero();
		System.out.println("TURN " + (pig.getTurn() + 1));
	}

	private static void printScoreDetails(PigDiceGame pig) {
		System.out.println("Turn Score : " + pig.getTurnScore());
		System.out.println("Total Score : " + pig.getTotalScore());
		System.out.println("Total Turns : " + pig.getTurn());
		System.out.println("------------------\n");
	}
}
