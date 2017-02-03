import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromoTest {

	Palindromo vP = new Palindromo();
	@Test
	public void test1() {
		String resultado=vP.creapalin("Brian");
		assertEquals(resultado,"BriannairB");
	}

	@Test
	public void test2() {
		String resultado=vP.creapalin("с");
		assertEquals(resultado,"сс");
	}
}
