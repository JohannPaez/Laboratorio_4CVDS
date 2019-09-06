package hangman.model;

import hangman.Exception.GameScoreException;

public class PowerScore implements GameScore {

	
	public int calculateScore(int correctCount, int incorrectCount) throws GameScoreException {
		int resultado=0;
		if (correctCount<0) {
			throw new GameScoreException(GameScoreException.CORRECTCOUNT_NEGATIVO);
		}else if(incorrectCount<0) {
			throw new GameScoreException(GameScoreException.INCORRECTCOUNT_NEGATIVO);
		}else if (correctCount>4) {
			resultado=500-incorrectCount*8;
		}else if(correctCount>0 && correctCount<3) {
			resultado=(int)Math.pow(5, incorrectCount)-correctCount*8;
		}
		return resultado;
	}

}
