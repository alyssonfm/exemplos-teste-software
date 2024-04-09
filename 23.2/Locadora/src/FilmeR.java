public class FilmeR {
	public static final int INFANTIL = 2;
	public static final int NORMAL = 0;
	public static final int LANCAMENTO = 1;
	private String titulo;
	private Preco preco;

	public FilmeR(String titulo, int codigoPreco) {
		this.titulo = titulo;
		setCodigoPreco(codigoPreco);
	}

	public int getCodigoPreco() {
		return this.preco.getCodigoPreco();
	}

	public void setCodigoPreco(int code) {
		switch (code) {
		case NORMAL:
			preco = new PrecoNormal();
			break;
		case INFANTIL:
			preco = new PrecoInfantil();
			break;
		case LANCAMENTO:
			preco = new PrecoLancamento();
			break;
		default:
			throw new IllegalArgumentException("Código de Preço Incorreto");
		}		
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
		
	public int getPontosLocadorFrequente(int diasAluguel) {
		return preco.getPontosLocadorFrequente(diasAluguel);
	}
	
	public double getPreco(int diasAluguel) {
		return preco.getPreco(diasAluguel);
	}

}