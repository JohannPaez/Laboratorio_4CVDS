package hangman.model;

import hangman.Exception.GameScoreException;

public class OriginalScore implements GameScore {

	
	public int calculateScore (int correctCount, int incorrectCount) throws GameScoreException {
		return 100 - incorrectCount * 10;
	}

}
