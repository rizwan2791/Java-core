import java.util.*;;
public class PigDiceGame {
	private int totalGameScore;
	private int turnScore;
	private int turn;
	
	public int getTotalScore() {
		return totalGameScore;
	}
	
	public int getTurnScore() {
		return turnScore;
	}
	public int getTurn() {
		return turn;
	}

	public int play() {
		int dice=getrollDiceNumber();
		updateTurnScore(dice);
		return dice;
		
	}

	private void updateTurnScore(int diceNumber) {
		if(diceNumber==1) 
			this.turnScore=0;
		else
		this.turnScore+=diceNumber;
		
	}

	private int getrollDiceNumber() {   
		int random = (int)(Math.random()*7);
		return random;
	}

	public void incrementTurn() {
		turn++;
	}

	public void updateTurnScoreToZero() {
		turnScore=0;
		
	}

	public void updateTotalScore() {
		totalGameScore+=turnScore;
	}
	
}
