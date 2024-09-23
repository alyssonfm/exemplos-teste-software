public class Calculadora {
	private int valorA;
	private int valorB;

	public Calculadora(int valorA, int valorB) {
		super();
		this.valorA = valorA;
		this.valorB = valorB;
	}

	public int somar() {
		return this.valorA + this.valorB;
	}

	public int dividir() {
		return this.valorA / this.valorB;
	}
}