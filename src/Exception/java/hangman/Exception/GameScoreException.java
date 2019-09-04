package hangman.Exception;

public class GameScoreException extends Exception{
	public final static String PUNTAJE_NEGATIVO="Los puntajes no pueden ser negativos";
	public GameScoreException(String message) {
		super(message);
	}
}
