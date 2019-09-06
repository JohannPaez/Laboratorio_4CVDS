package hagman.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import hangman.model.GameScore;
import hangman.model.OriginalScore;

public class GameScoreTest {
	/*
	 * Original Score:
	 * 
	 * Clase 1 de Equivalencia: Esta clase comprueba que no gana ningun punto,
	 * su puntaje será igual siempre
	 * 	Limites de frontera:
	 * 		1. correctCount = 0, incorrectCount = 0
	 * 		2. correctCount = 1, incorrectCount = 0
	 * 		3. correctCount = -1, incorrectCount = 0
	 * 		4. correctCount = 0, incorrectCount = -1
	 * 
	 * Clase 2 de Equivalencia: Esta clase comprueba si bonifica o no bonifica
	 * al jugador
	 * 	Limites de frontera:
	 * 		1. correctCount = 0, incorrectCount = 0
	 * 		2. correctCount = 1, incorrectCount = 0
	 * 		3. correctCount = 34, incorrectCount = 0
	 * 		4. correctCount = -1, incorrectCount = 0
	 * 
	 * Clase 3 de Equivalencia: Esta clase prueba si penaliza o no al jugador
	 * 	Limites de frontera:
	 * 		1. correctCount > 0, incorrectCount = 0
	 * 		2. correctCount > 0, incorrectCount = 1
	 * 		3. correctCount > 0, incorrectCount = -1
	 * 
	 * Clase 4 de Equivalencia: Esta clase comprueba el puntaje mínimo que
	 * puede llegar a tener el jugador
	 * 	Limites de frontera:
	 * 		1. correctCount > 0, incorrectCount = 10
	 * 		2. correctCount > 0, incorrectCount = 11
	 * 		3. correctCount > 0, incorrectCount = 9
	 * 
	 * 
	 * 
	 * Bonus Score:
	 * 
	 * Clase 1 de Equivalencia: Esta clase comprueba que no gana ningun punto,
	 * su puntaje será igual siempre
	 * 	Limites de frontera:
	 * 		1. correctCount = 0, incorrectCount = 0
	 * 		2. correctCount = 1, incorrectCount = 2
	 * 		3. correctCount = -1, incorrectCount = 0
	 * 		4. correctCount = 0, incorrectCount = -1
	 * 
	 * Clase 2 de Equivalencia: Esta clase comprueba si bonifica o no bonifica
	 * al jugador
	 * 	Limites de frontera:
	 * 		1. correctCount = 0, incorrectCount = 0
	 * 		2. correctCount = 1, incorrectCount = 0
	 * 		3. correctCount = -1, incorrectCount = 0
	 * 
	 * Clase 3 de Equivalencia:
	 * 	Limites de frontera:
	 * 		1. correctCount = 1, incorrectCount = 2
	 * 		2. correctCount > 0, incorrectCount = -1
	 * 
	 * Clase 4 de Equivalencia:
	 * 	Limites de frontera:
	 * 		1. correctCount = 0, incorrectCount = 0
	 * 		2. correctCount = 0, incorrectCount = 1
	 * 		3. correctCount = 0, incorrectCount = -1
	 * 
	 * 
	 * 
	 * 
	 * Power Score:
	 * 
	 * Clase 1 de Equivalencia:
	 * 	Limites de frontera:
	 * 		1. correctCount = 0, incorrectCount = 0
	 * 		2. correctCount = 1, incorrectCount = 0
	 * 		3. correctCount = 0, incorrectCount = -1
	 * 
	 * Clase 2 de Equivalencia:
	 * 	Limites de frontera:
	 * 		1. correctCount = 0, incorrectCount = 0
	 * 		2. correctCount = 1, incorrectCount = 0
	 * 		3. correctCount = 3, incorrectCount = 0
	 * 		4. correctCount = 4, incorrectCount = 0
	 * 		5. correctCount = -1, incorrectCount = 0
	 * 
	 * Clase 3 de Equivalencia:
	 * 	Limites de frontera:
	 * 		1. correctCount = 1, incorrectCount = 0
	 * 		2. correctCount = 2, incorrectCount = 10
	 * 		3. correctCount = 4, incorrectCount = 10
	 * 
	 * Clase 4 de Equivalencia:
	 * 	Limites de frontera:
	 * 		1. correctCount = 0, incorrectCount = 0
	 * 		2. correctCount = 4, incorrectCount = 0
	 * 		3. correctCount = 0, incorrectCount = -1
	 * 		4. correctCount = -4, incorrectCount = 0 
	 * 
	 * 
	 * 
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
			assertTrue(score.calculateScore(0, 1)==100);
		}catch (Exception e) {
			assertTrue(false);
		}
	}
	@Test
	public void deberiSerMinimo() {
		try {
			OriginalScore score = new OriginalScore(); 
			assertTrue(score.calculateScore(0, 10)==90);
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
			assertTrue(false);
		}
	}
	@Test
	public void DatoIncorrecto1() {
		try {
			OriginalScore score = new OriginalScore(); 
			score.calculateScore(-1, 0);
		}catch (Exception e) {
			assertTrue(false);
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
			OriginalScore score = new OriginalScore(); 
			assertTrue(score.calculateScore(0, 0)==0);
		}catch (Exception e) {
			assertTrue(false);
		}
	}
	@Test
	public void NoGanaPunto1() {
		try {
			OriginalScore score = new OriginalScore(); 
			assertTrue(score.calculateScore(1, 2)==0);
		}catch (Exception e) {
			assertTrue(false);
		}
	}
	@Test
	public void bonifica() {
		try {
			OriginalScore score = new OriginalScore(); 
			assertTrue(score.calculateScore(1, 0)==10);
		}catch (Exception e) {
			assertTrue(false);
		}
	}
	@Test
	public void penaliza() {
		try {
			OriginalScore score = new OriginalScore(); 
			assertTrue(score.calculateScore(1, 1)==5);
		}catch (Exception e) {
			assertTrue(false);
		}
	}
	@Test
	public void noGanaNingunPunto() {
		try {
			OriginalScore score = new OriginalScore(); 
			assertTrue(score.calculateScore(-1, 0)==0);
		}catch (Exception e) {
			assertTrue(true);
		}
	}
	@Test
	public void noGanaNingunPunto1() {
		try {
			OriginalScore score = new OriginalScore(); 
			assertTrue(score.calculateScore(1, -1)==0);
		}catch (Exception e) {
			assertTrue(true);
		}
	}
	@Test
	public void puntajeMinimo() {
		try {
			OriginalScore score = new OriginalScore(); 
			assertTrue(score.calculateScore(0, 1)==0);
		}catch (Exception e) {
			assertTrue(false);
		}
	}
	@Test
	public void puntajeMinimo1() {
		try {
			OriginalScore score = new OriginalScore(); 
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
			OriginalScore score = new OriginalScore(); 
			assertTrue(score.calculateScore(0, 0)==0);
		}catch (Exception e) {
			assertTrue(false);
		}
	}
	@Test
	public void bonifica1() {
		try {
			OriginalScore score = new OriginalScore(); 
			assertTrue(score.calculateScore(1, 0)==5);
		}catch (Exception e) {
			assertTrue(false);
		}
	}
	@Test
	public void bonifica2() {
		try {
			OriginalScore score = new OriginalScore(); 
			assertTrue(score.calculateScore(3, 0)==125);
		}catch (Exception e) {
			assertTrue(false);
		}
	}
	
	@Test
	public void bonifica3() {
		try {
			OriginalScore score = new OriginalScore(); 
			assertTrue(score.calculateScore(4, 0)==500);
		}catch (Exception e) {
			assertTrue(false);
		}
	}
	@Test
	public void noGanaNingunPunto3() {
		try {
			OriginalScore score = new OriginalScore(); 
			assertTrue(score.calculateScore(1, -1)==0);
		}catch (Exception e) {
			assertTrue(true);
		}
	}
	@Test
	public void noGanaNingunPunto4() {
		try {
			OriginalScore score = new OriginalScore(); 
			assertTrue(score.calculateScore(-1, 1)==0);
		}catch (Exception e) {
			assertTrue(true);
		}
	}
	@Test
	public void bonifica4() {
		try {
			OriginalScore score = new OriginalScore(); 
			assertTrue(score.calculateScore(4, 16)==372);
		}catch (Exception e) {
			assertTrue(false);
		}
	}
	@Test
	public void bonifica5() {
		try {
			OriginalScore score = new OriginalScore(); 
			assertTrue(score.calculateScore(4, 10)==420);
		}catch (Exception e) {
			assertTrue(false);
		}
	}
	@Test
	public void bonifica6() {
		try {
			OriginalScore score = new OriginalScore(); 
			assertTrue(score.calculateScore(4, 0)==500);
		}catch (Exception e) {
			assertTrue(false);
		}
	}
	
}
