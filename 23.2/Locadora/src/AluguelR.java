
public class AluguelR {

	private FilmeR filme;
	private int diasAlugados;

	public AluguelR(FilmeR filme, int diasAlugados) {
		this.filme = filme;
		this.diasAlugados = diasAlugados;
	}

	public FilmeR getFilme() {
		return filme;
	}

	public int getDiasAlugados() {
		return diasAlugados;
	}
	
	public double getPreco() {
		return filme.getPreco(diasAlugados);
	}
	
	public int getPontosLocadorFrequente() {
		return filme.getPontosLocadorFrequente(diasAlugados);
	}
	
}
