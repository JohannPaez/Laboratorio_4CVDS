package hangman.model;

import hangman.Exception.GameScoreException;

public class BonusScore implements GameScore {


	public int calculateScore(int correctCount, int incorrectCount) throws GameScoreException {
		int resultado=0;
		if (correctCount<0) {
			throw new GameScoreException(GameScoreException.CORRECTCOUNT_NEGATIVO);
		}else if(incorrectCount<0) {
			throw new GameScoreException(GameScoreException.INCORRECTCOUNT_NEGATIVO);
		}
		resultado=correctCount*10-incorrectCount*5;
		if (resultado < 0) {
			resultado = 0;
		}
		return resultado;
	}

}


