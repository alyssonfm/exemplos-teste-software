import junit.framework.TestCase;

public class TestCalculadora extends TestCase{
	Calculadora c;
	
	protected void setUp() throws Exception{
		super.setUp();
		c = new Calculadora(10.0, 10.0);
	}
	
	protected void tearCalculadora() throws Exception{
		super.tearDown();
		c = null;
	}
	
	public void testCalculadora(){
		fail("Not yet implemented");
	}
	
	public void testSomar(){
		assertEquals(20.0, c.somar(), 0);
	}
	

}