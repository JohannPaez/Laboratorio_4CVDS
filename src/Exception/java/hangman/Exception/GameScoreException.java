package hangman.Exception;

public class GameScoreException extends Exception{
	public final static String CORRECTCOUNT_NEGATIVO="los puntos correctos no pueden ser negativos";
	public final static String INCORRECTCOUNT_NEGATIVO="los puntos incorrectos no pueden ser negativos";
	
	public GameScoreException(String message) {
		super(message);
	}
}
