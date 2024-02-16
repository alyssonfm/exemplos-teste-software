public class Cobertura {
	private int x, y;
	
	public Cobertura() {
		x = 0;
		y = 0;
	}
	
	public void nivel1(int a, int b) { //1
		if(a > 0) { //1
			x = x + 1; //2
		} //2 
		if(b == 3) { //3
			y = 0; //4
		} //4
	} //5
	
	public static void main(String[] args) {
		Cobertura c = new Cobertura();
		c.nivel1(1, 3); // 1 - 2 - 3 - 4 - 5
		c.nivel1(0, 3); // 1 - 3 - 4 - 5
		c.nivel1(0, 0); // 1 - 3 - 5		
	}
}
