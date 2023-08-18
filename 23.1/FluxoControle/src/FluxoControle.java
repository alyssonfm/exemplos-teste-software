
public class FluxoControle {

	private int x;
	private int y;

	public void fluxo(int a, int b) {
		if (a > 0) {
			x = x + 1;
		}
		if (b == 3) {
			y = 0;
		}
	}
	
	public void fluxo2(int a, int b, int c, int d) {
		if (a > 0 && c == 1) {
			x = x + 1;
		}
		if (b == 3 || d < 0) {
			y = 0;
		}
	}

	public static void main(String[] args) {
		FluxoControle f = new FluxoControle();
		f.fluxo(-2, 2);
		f.fluxo(4, 3);
		// Fluxo 2 -- Nivel de cobertura 5
		f.fluxo2(0, 3, 1, 0);
		f.fluxo2(1, -3, 1, -1);
		f.fluxo2(1, 3, 5, -2);
		f.fluxo2(0, 0, 1, 1);
		// Nivel 3
		f.fluxo2(1, 3, 1, -1);
		f.fluxo2(0, -3, -1, 1);
	}

}
