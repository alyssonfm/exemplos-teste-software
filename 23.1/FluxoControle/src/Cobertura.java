public class Cobertura {
	private int x, y;
	
	public void nivel1(int a, int b) {
		if(a > 0) {
			x = x + 1;
		}
		if(b == 3) {
			y = 0;
		}
	}
	
	public static void main(String[] args) {
		Cobertura c = new Cobertura();
		// Cobertura de instrucoes
		// 1o e 2o ifs verdadeiros
		c.nivel1(-2, 2);
		// 1o e 2o ifs falsos
		c.nivel1(4, 3);
		// 1o V e 2o F
		//c.nivel1(1, 0);
		// 1o F e 2o V
		//c.nivel1(0, 3);
	}
}
