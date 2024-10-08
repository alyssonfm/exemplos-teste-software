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

  public double subtrair(){
    return this.valorA - this.valorB;
  }

	public double dividir(){
    if(this.valorB == 0) return Double.NaN;
		return this.valorA/this.valorB;
	}

	public double getValorA() {
		return valorA;
	}

	public void setValorA(double valorA) {
		this.valorA = valorA;
	}

	public double getValorB() {
		return valorB;
	}

	public void setValorB(double valorB) {
		this.valorB = valorB;
	}
}