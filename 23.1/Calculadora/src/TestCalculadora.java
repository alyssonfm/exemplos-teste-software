import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

public class TestCalculadora extends TestCase {
	Calculadora c;

	@BeforeEach
	protected void setUp() throws Exception {
		super.setUp();
		c = new Calculadora(10.0, 0.0);
	}

	@AfterEach
	protected void tearCalculadora() throws Exception {
		super.tearDown();
		c = null;
	}

	@Test
	public void testSomar() {
		assertEquals(20.0, c.somar(), 0);
	}

	@Test
	public void testDividir() {
		assertEquals(1.0, c.dividir());
	}

}