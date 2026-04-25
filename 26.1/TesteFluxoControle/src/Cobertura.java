
public class Cobertura {
	
	public void nivel1(int a, int b) {
		int x, y;
		if(a > 0) {
			x = 1;
		}
		if(b == 3) {
			y = 0;
		}
	}
	
	public void nivel3(int a, int b, int c, int d) {
		int x, y;
		if(a > 0 && c == 1) {
			x = 1;
		}
		if(b == 3 || d < 0) {
			y = 0;
		}
	}
	
	public void nivel4(int a, int c) {
		int x = 0;
		if(a > 0 && c == 1) {
			x = 1;
		}
		System.out.println(x);
	}
	
}
