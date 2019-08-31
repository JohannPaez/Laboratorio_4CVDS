package hangman.model;

public class OriginalScore implements GameScore {

	
	public int calculateScore(int correctCount, int incorrectCount) {
		return 100 - incorrectCount * 10;
	}

}
