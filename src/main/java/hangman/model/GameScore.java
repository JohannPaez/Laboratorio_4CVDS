package hangman.model;

import hangman.Exception.GameScoreException;

public interface GameScore {
	
	
	int calculateScore (int correctCount, int incorrectCount)throws GameScoreException;
	
}
