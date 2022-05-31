package aritmetica;

import junit.framework.TestCase;

public class AritmeticaTest extends TestCase{
    public void testSomar() {
	double n1 = 6.0;
	double n2 = 2.0;
	double somaEsperado = 8.0;
	double subtraiEsperado = 4.0;
	double multiplicaEsperado = 12.0;
	double divideEsperado = 2.0;
	double somaEncontrado = Aritmetica.somar(n1, n2);
	assertEquals(somaEsperado, somaEncontrado);
	double subtraiEncontrado = Aritmetica.subtrair(n1, n2);
	assertEquals(subtraiEsperado, subtraiEncontrado);
	double multiplicaEncontrado = Aritmetica.multiplicar(n1, n2);
	assertEquals(multiplicaEsperado, multiplicaEncontrado);
	double divideEncontrado = Aritmetica.dividir(n1, n2);
	assertEquals(divideEsperado, divideEncontrado);
    }

}
