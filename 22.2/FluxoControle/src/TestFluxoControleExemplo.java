import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestFluxoControleExemplo {

    private FluxoControleExemplo f;

    @BeforeEach
    void setUp() throws Exception {
	f = new FluxoControleExemplo();
    }

    @AfterEach
    void tearDown() throws Exception {
	f = null;
    }

    @Test
    void testNivel1() {
	f.nivel1(-1, 2); // P1
	f.nivel1(1, 1); // P2
	f.nivel1(6, 3); // P3
	f.nivel1(6, 3); // P4
    }

    @Test
    void testNivel2() {
	f.nivel1(2, 2); // Nivel 2
	f.nivel1(-4, 3); // Nivel 2
    }

    @Test
    void testNivel5() {
	f.nivel5(1, 1, 3, -1); // T1
	f.nivel5(1, 1, 3, 0);
	f.nivel5(1, 1, 2, -1);
	f.nivel5(1, 1, 2, 0);
	f.nivel5(0, 1, 3, 0); // T2
	f.nivel5(1, 2, 5, -1); // T3
	f.nivel5(-5, 20, 100, 50); // T4
    }

    @Test
    void testNivel4() {
	f.nivel4(true, false);
	f.nivel4(false, true);
	f.nivel4(true, true);
    }

    @Test
    void testNivel3() {
	f.nivel3(1, 1, 3, -1); // Teste 1: a > 0, c = 1, b = 3, d < 0
	f.nivel3(0, 0, 2, 0); // Teste 2: a <= 0, c != 1, b != 3, d >= 0
	f.nivel3(1, 0, 0, -1);
	f.nivel3(0, 0, 3, 1);
    }

    @Test
    void testNivel7() {
	f.nivel7(10);
    }

}
