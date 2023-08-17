public class Calculadora{
	private double valorA;
	private double valorB;
	
	public Calculadora(double valorA, double valorB){
		super();
		this.valorA = valorA;
		this.valorB = valorB;
	}
	
	public double somar(){
		return this.valorA + this.valorB;
	}
	
	public double dividir(){
		if(this.valorB != 0) return this.valorA/this.valorB;
		return Double.NaN;
	}
	
	public static void main(String[] args) {
		Calculadora c = new Calculadora(1, 0);
		c.somar();
		c.dividir();
		c = new Calculadora(1, 1);
		c.dividir();
	}
}