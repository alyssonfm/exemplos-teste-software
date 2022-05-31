public class FluxoControleExemplo {

    private int x, y;
    private String s;

    public void nivel1(int a, int b) { // statements e condicional
	int valor = 10;
	valor += valor;
	valor *= valor;
	if (a > 0) {
	    x = x + 1;
	}
	if (b == 3) {
	    y = 0;
	}
    }

    public void nivel3(int a, int c, int b, int d) {
	if (a > 0 && c == 1) {
	    x = x + 1;
	}
	if (b == 3 || d < 0) {
	    y = 0;
	}
    }

    public void nivel4(boolean x, boolean y) { // decisao/condicao
	if (x && y) { // (x e y) ou z -- x e (y ou z)
	    System.out.println("Deu certo! Entrou no if. \\o/");
	}
    }

    public void nivel5(int a, int c, int b, int d) { // MCC
	if (a > 0 && c == 1) {
	    x = x + 1;
	    if (b == 3 || d < 0) {
		y = 0;
	    }
	}
    }

    public void nivel7(int a) { // Todos os caminhos?
	int i;
	for (i = 0; i < 10; i++) { // [0, 10[
	    // go to l47
	}
	for (int j = i; j < a; j++) // Ciclo simples: a = 0, a = 1
		; // l47
    }

    

    /*
     * public int fluxoDados() { int z = 0; if(x > y) { z = 2; } return z; }
     * 
     * /* public void nivel1e2(int a, int b) { // Qual o valor de x e de y? if(s !=
     * null) { System.out.println(s.length()); } if (a > 0) { x = x + 1; // Tem
     * potencial de erro relacionado a definicao e uso de variaveis } if (b == 3) {
     * y = y + 1; // Tem potencial de erro relacionado a definicao e uso de
     * variaveis } // Qual o valor de x e de y aqui? System.out.println(x + " e " +
     * y); }
     */

}

/*
 * Casos de teste para o nivel 5 T1: a > 0, c = 1, b = 3, d < 0 T2: a <= 0, c =
 * 1, b = 3, d >= 0 T3: a > 0, c != 1, b != 3, d < 0 T4: a <= 0, c != 1, b != 3,
 * d >= 0
 */