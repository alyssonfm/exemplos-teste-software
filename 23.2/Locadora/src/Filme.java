public class Filme {
	public static final int INFANTIL = 2;
	public static final int NORMAL = 0;
	public static final int LANCAMENTO = 1;
	private String titulo;
	private int codigoPreco;

	public Filme(String titulo, int codigoPreco) {
		this.titulo = titulo;
		this.codigoPreco = codigoPreco;
	}

	public int getCodigoPreco() {
		return this.codigoPreco;
	}

	public void setCodigoPreco(int code) {
		this.codigoPreco = code;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

}