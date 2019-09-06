package hangman.model;

import hangman.Exception.GameScoreException;

public class OriginalScore implements GameScore {

	
	public int calculateScore (int correctCount, int incorrectCount) throws GameScoreException {
		if (correctCount<0) {
			throw new GameScoreException(GameScoreException.CORRECTCOUNT_NEGATIVO);
		}else if(incorrectCount<0) {
			throw new GameScoreException(GameScoreException.INCORRECTCOUNT_NEGATIVO);
		}else {
			return 100 - incorrectCount * 10;
		}
		
	}

}
