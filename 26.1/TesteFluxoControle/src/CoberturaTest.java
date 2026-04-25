import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CoberturaTest {
	Cobertura c;

	@BeforeEach
	void setUp() {
		c = new Cobertura();
	}

	@AfterEach
	void tearDown() {
		c = null;
	}

	@Test
	void testNivel1() {
		c.nivel1(1, 3);
	}
	
	@Test
	void testNivel2() {
		c.nivel1(1, 3);
		c.nivel1(0, 0);
	}
	
	@Test
	void testTodosCaminhos() {
		c.nivel1(1, 3);
		c.nivel1(0, 0);
		c.nivel1(1, 0);
		c.nivel1(0, 3);	
	}
	
	@Test
	void testNivel3() {
		c.nivel3(1, 3, 1, -1);
		c.nivel3(1, 3, 0, 0);
		c.nivel3(0, 2, 1, -1);
		c.nivel3(1, 2, 1, 0);
	}
	
	@Test
	void testNivel4() {
		c.nivel4(1, 0);
		c.nivel4(0, 1);
		c.nivel4(0, 0);
		c.nivel4(1, 1);
	}

}
