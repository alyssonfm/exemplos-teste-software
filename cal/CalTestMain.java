/*
 * Created on 12/09/2011
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package cal;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalTestMain {
static private ByteArrayOutputStream baOut, baErr;
static private PrintStream psOut, psErr;
	
   @BeforeClass
   static public void beforeClassInit() {
		baOut = new ByteArrayOutputStream();
		psOut = new PrintStream(baOut);
		System.setOut(psOut); 
		baErr = new ByteArrayOutputStream();
		psErr = new PrintStream(baErr);
	    System.setErr(psErr);
   }

   @AfterClass
   static public void afterClassFinalize() {
	   psErr.close();
	   psOut.close();
   }
   

	@Before
	public void setUp()
	{
		baOut.reset();
		baErr.reset();
	}
	
	@Test
	public void testMain01() {
		Cal.main(new String[] {"0", "1963"});
		String s = baErr.toString();
		assertEquals("Cal: 0: mes invalido.\n", s); 
	}

	
}
