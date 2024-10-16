package tdd.calculadora.teste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import tdd.calculadora.Calculadora;

public class CalculadoraTeste {
	
	@Test
	public void deveriaSomarDoisValoresPassados() throws Exception{
		int valorA = 1;
		int valorB = 2;
		Calculadora calc = new Calculadora();
		int soma = calc.soma(valorA, valorB);
		assertEquals(3, soma);
	}
	
	@Test
	public void deveriaSubtrairDoisValoresPassados() throws Exception{
		int valorA = 1;
		int valorB = 2;
		Calculadora calc = new Calculadora();
		int subtracao = calc.subtrai(valorA, valorB);
		assertEquals(-1, subtracao);
	}
	
	@Test(expected = ArithmeticException.class)
	public void deveriaDividirDoisValoresPassados() throws Exception{
		int valorA = 6;
		int valorB = 0;
		Calculadora calc = new Calculadora();
		int divisao = calc.divide(valorA, valorB);
		assertEquals(3, divisao);
	}
	
	@Test
	public void deveriaMultiplicarDoisValoresPassados() throws Exception{
		int valorA = 5;
		int valorB = 2;
		Calculadora calc = new Calculadora();
		int multiplicacao = calc.multiplica(valorA, valorB);
		assertEquals(10, multiplicacao);
	}

}
