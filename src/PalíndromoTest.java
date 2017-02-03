import static org.junit.Assert.*;

import org.junit.Test;

public class PalíndromoTest {

		private static final String Vacaciones = null;
		private Palíndromo Palind;
	@Test
	public void testVacío() {
		Palind = new Palíndromo(Vacaciones);
		String Line=this.Palind.palín();
		assertTrue(Line=="");
	}
	
	@Test
	public void testBlancoInicio(){
		String Line=this.Palind.palín();
		assertTrue(Line=="");
	}
	
	@Test
	public void testBlancoFin(){
		String Line=this.Palind.palín();
		assertTrue(Line==" VacacionessenoicacaV");
	}
	
	@Test
	public void testUno(){
		String Line=this.Palind.palín();
		assertTrue(Line=="VacacionessenoicacaV ");
	}
	
	@Test
	public void testTamaños4(){
		String Line=this.Palind.palín();
		assertTrue(Line=="VacaacaV");
	}
	
	@Test
	public void testTamaños10(){
		String Line=this.Palind.palín();
		assertTrue(Line=="VacacionessenoicacaV");
	}
	
	@Test
	public void testTamaños50(){
		String Line=this.Palind.palín();
		assertTrue(Line=="Vacaciones1234567890ABCEFFECBA0987654321senoicacaV");
	}
	
	@Test
	public void testMayus(){
		String Line=this.Palind.palín();
		assertTrue(Line=="VACACIONESSENOICACAV");
	}
}
