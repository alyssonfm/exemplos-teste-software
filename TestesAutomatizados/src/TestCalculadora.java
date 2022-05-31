import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class TestCalculadora extends TestCase {
    Calculadora c;

    @Before
    protected void setUp() throws Exception {
	super.setUp();
	c = new Calculadora(10.0, 0.0);
    }
    
    @After
    protected void tearCalculadora() throws Exception {
	super.tearDown();
	c = null;
    }

    @Test
    public void testSomar() {
	assertEquals(10.0, c.somar(), 0);
    }

    @Test
    public void testDividir() {
	assertEquals(Double.POSITIVE_INFINITY, c.dividir(), 0);
    }
}