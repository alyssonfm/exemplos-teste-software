package tdd.calculadora;

public class Calculadora {

	public int soma(int valorA, int valorB) {
		return valorA + valorB;
	}

	public int subtrai(int valorA, int valorB) {
		return valorA - valorB;
	}

	public int divide(int valorA, int valorB) {
		//if (valorB != 0)
			return valorA / valorB;
		//return Double.NaN;
	}

	public int multiplica(int valorA, int valorB) {
		return valorA * valorB;
	}

}
