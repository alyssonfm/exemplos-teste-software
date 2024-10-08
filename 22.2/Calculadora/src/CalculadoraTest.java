import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

    Calculadora calculadora;

    @BeforeEach
    void setUp() {
        calculadora = new Calculadora(10, 2);
    }

    @AfterEach
    void tearDown(){
        calculadora = null;
    }
    
    @Test
    void sum() {
        assertEquals(12, calculadora.somar());
    }

    @Test
    void subtract() {
        assertEquals(8, calculadora.subtrair());
    }

    @Test
    void divide() {
        assertEquals(5, calculadora.dividir());
    }
}