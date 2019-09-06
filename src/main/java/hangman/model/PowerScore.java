package hangman.model;

import hangman.Exception.GameScoreException;

public class PowerScore implements GameScore {

	
	public int calculateScore(int correctCount, int incorrectCount) throws GameScoreException {
		int resultado=0;
		if (correctCount<0) {
			throw new GameScoreException(GameScoreException.CORRECTCOUNT_NEGATIVO);
		}else if(incorrectCount<0) {
			throw new GameScoreException(GameScoreException.INCORRECTCOUNT_NEGATIVO);	
		}
		resultado=(int)Math.pow(5, correctCount)-incorrectCount*8;
		if(resultado>500){
			resultado=500;
		}else if(resultado<0) {
			resultado=0;
		} else if (correctCount == 0 && incorrectCount == 0) {
			resultado = 0;
		}
		return resultado;
	}

}
