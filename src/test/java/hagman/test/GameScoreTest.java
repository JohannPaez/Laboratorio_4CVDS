package hagman.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import hangman.model.BonusScore;
import hangman.model.GameScore;
import hangman.model.OriginalScore;
import hangman.model.PowerScore;

public class GameScoreTest {
	/*
	 * Clases de equivalencia (Para los 3 métodos de calcular puntaje power score, original score y bonus score)
	 *	1.	Los puntos que se calculan normalmente.
	 *	2.	Los números negativos.
	 *	3.	Los que superan los límites.
	 * 
	 * 
	 * Original Score:
	 * 	Limites de frontera:
	 * 		1. correctCount = 0, incorrectCount = 0
	 * 		1. correctCount = 1, incorrectCount = 0
	 * 		1. correctCount = 34, incorrectCount = 0
	 * 		1. correctCount = 0, incorrectCount = 1
	 * 		1. correctCount = 0, incorrectCount = 10
	 * 		1. correctCount = 0, incorrectCount = 9
	 * 
	 * 		2. correctCount = -1, incorrectCount = 0
	 * 		2. correctCount = 0, incorrectCount = -1
	 * 
	 * 		3. correctCount = 0, incorrectCount = 11
	 * 		3. correctCount = 0, incorrectCount = 34
	 * 
	 * Bonus Score:
	 * 	Limites de frontera:
	 * 		1. correctCount = 0, incorrectCount = 0
	 * 		1. correctCount = 1, incorrectCount = 2
	 * 		1. correctCount = 3, incorrectCount = 0
	 * 		1. correctCount = 3, incorrectCount = 1
	 * 
	 * 		2. correctCount = -1, incorrectCount = 0
	 * 		2. correctCount = 0, incorrectCount = -1
	 * 
	 * 		3. correctCount = 0, incorrectCount = 1
	 * 		3. correctCount = 0, incorrectCount = 34
	 * 
	 * Powe Score:
	 * 	Limites de frontera:
	 * 		1. correctCount = 0, incorrectCount = 0
	 * 		1. correctCount = 1, incorrectCount = 0
	 * 		1. correctCount = 3, incorrectCount = 0
	 * 		1. correctCount = 3, incorrectCount = 10
	 * 
	 * 		2. correctCount = -1, incorrectCount = 0
	 * 		2. correctCount = 0, incorrectCount = -1
	 * 
	 * 		3. correctCount = 4, incorrectCount = 16
	 * 		3. correctCount = 0, incorrectCount = 1
	 * 	 	3. correctCount = 4, incorrectCount = 0

	
	/*
	 * Original Score
	 */
	@Test
	public void deberiNoPerdePuntos() {
		try {
			OriginalScore score = new OriginalScore(); 
			assertTrue(score.calculateScore(0, 0)==100);
		}catch (Exception e) {
			assertTrue(false);
		}
	}
	@Test
	public void deberiNoPerdePuntos1() {
		try {
			OriginalScore score = new OriginalScore(); 
			assertTrue(score.calculateScore(1, 0)==100);
		}catch (Exception e) {
			assertTrue(false);
		}
	}
	@Test
	public void deberiNoBonifica() {
		try {
			OriginalScore score = new OriginalScore(); 
			assertTrue(score.calculateScore(34, 0)==100);
		}catch (Exception e) {
			assertTrue(false);
		}
	}
	@Test
	public void deberiPenalizar() {
		try {
			OriginalScore score = new OriginalScore(); 
			assertTrue(score.calculateScore(0, 1)==90);
		}catch (Exception e) {
			assertTrue(false);
		}
	}
	@Test
	public void deberiSerMinimo() {
		try {
			OriginalScore score = new OriginalScore(); 
			assertTrue(score.calculateScore(0, 10)==0);
		}catch (Exception e) {
			assertTrue(false);
		}
	}
	@Test
	public void deberiaSerminimo2() {
		try {
			OriginalScore score = new OriginalScore(); 
			assertTrue(score.calculateScore(0, 9)==10);
		}catch (Exception e) {
			assertTrue(false);
		}
	}
	@Test
	public void DatoIncorrecto() {
		try {
			OriginalScore score = new OriginalScore(); 
			score.calculateScore(0, -1);
		}catch (Exception e) {
			assertTrue(true);
		}
	}
	@Test
	public void DatoIncorrecto1() {
		try {
			OriginalScore score = new OriginalScore(); 
			score.calculateScore(-1, 0);
		}catch (Exception e) {
			assertTrue(true);
		}
	}
	@Test
	public void deberiaSerminimo1() {
		try {
			OriginalScore score = new OriginalScore(); 
			assertTrue(score.calculateScore(0, 11)==0);
		}catch (Exception e) {
			assertTrue(false);
		}
	}
	@Test
	public void deberiaSerminimo3() {
		try {
			OriginalScore score = new OriginalScore(); 
			assertTrue(score.calculateScore(0, 34)==0);
		}catch (Exception e) {
			assertTrue(false);
		}
	}
	/*
	 * BonusScore
	 */
	@Test
	public void NoGanaPunto() {
		try {
			BonusScore score = new BonusScore(); 
			assertTrue(score.calculateScore(0, 0)==0);
		}catch (Exception e) {
			assertTrue(false);
		}
	}
	@Test
	public void NoGanaPunto1() {
		try {
			BonusScore score = new BonusScore();  
			assertTrue(score.calculateScore(1, 2)==0);
		}catch (Exception e) {
			assertTrue(false);
		}
	}
	@Test
	public void bonifica() {
		try {
			BonusScore score = new BonusScore();  
			assertTrue(score.calculateScore(1, 0)==10);
		}catch (Exception e) {
			assertTrue(false);
		}
	}
	@Test
	public void penaliza() {
		try {
			BonusScore score = new BonusScore();  
			assertTrue(score.calculateScore(1, 1)==5);
		}catch (Exception e) {
			assertTrue(false);
		}
	}
	@Test
	public void noGanaNingunPunto() {
		try {
			BonusScore score = new BonusScore();  
			assertTrue(score.calculateScore(-1, 0)==0);
		}catch (Exception e) {
			assertTrue(true);
		}
	}
	@Test
	public void noGanaNingunPunto1() {
		try {
			BonusScore score = new BonusScore();  
			assertTrue(score.calculateScore(0, -1)==0);
		}catch (Exception e) {
			assertTrue(true);
		}
	}
	@Test
	public void puntajeMinimo() {
		try {
			BonusScore score = new BonusScore();  
			assertTrue(score.calculateScore(0, 1)==0);
		}catch (Exception e) {
			assertTrue(false);
		}
	}
	@Test
	public void puntajeMinimo1() {
		try {
			BonusScore score = new BonusScore();  
			assertTrue(score.calculateScore(0, 34)==0);
		}catch (Exception e) {
			assertTrue(false);
		}
	}
	/*
	 * powerScore
	 */
	@Test
	public void noGanaNingunPunto2() {
		try {
			PowerScore score = new PowerScore(); 
			assertTrue(score.calculateScore(0, 0)==0);
		}catch (Exception e) {
			assertTrue(false);
		}
	}
	@Test
	public void bonifica1() {
		try {
			PowerScore score = new PowerScore(); 
			assertTrue(score.calculateScore(1, 0)==5);
		}catch (Exception e) {
			assertTrue(false);
		}
	}
	@Test
	public void bonifica2() {
		try {
			PowerScore score = new PowerScore(); 
			assertTrue(score.calculateScore(3, 0)==125);
		}catch (Exception e) {
			assertTrue(false);
		}
	}
	
	@Test
	public void bonifica3() {
		try {
			PowerScore score = new PowerScore(); 
			assertTrue(score.calculateScore(3, 10)==45);
		}catch (Exception e) {
			assertTrue(false);
		}
	}
	
	
	@Test
	public void noGanaNingunPunto3() {
		try {
			PowerScore score = new PowerScore(); 
			assertTrue(score.calculateScore(0, -1)==0);
		}catch (Exception e) {
			assertTrue(true);
		}
	}
	@Test
	public void noGanaNingunPunto4() {
		try {
			PowerScore score = new PowerScore(); 
			assertTrue(score.calculateScore(-1, 0)==0);
		}catch (Exception e) {
			assertTrue(true);
		}
	}
	@Test
	public void bonifica4() {
		try {
			PowerScore score = new PowerScore(); 
			assertTrue(score.calculateScore(4, 16)==497);
		}catch (Exception e) {
			assertTrue(false);
		}
	}
	@Test
	public void bonifica5() {
		try {
			PowerScore score = new PowerScore(); 
			assertTrue(score.calculateScore(0, 1)==0);
		}catch (Exception e) {
			assertTrue(false);
		}
	}
	@Test
	public void bonifica6() {
		try {
			PowerScore score = new PowerScore(); 
			assertTrue(score.calculateScore(4, 0)==500);
		}catch (Exception e) {
			assertTrue(false);
		}
	}
	
}
