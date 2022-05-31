public class Calculadora {
    private double valorA;
    private double valorB;

    public Calculadora(double valorA, double valorB) {
	super();
	this.valorA = valorA;
	this.valorB = valorB;
    }

    public double somar() {
	return this.valorA + this.valorB;
    }

    public double dividir() {
	return this.valorA / this.valorB;
    }
}