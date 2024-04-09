
public class Aluguel {
	
	private Filme filme;
	private int diasAlugados;
	
	public Aluguel(Filme filme, int diasAlugados) {
		this.filme = filme;
		this.diasAlugados = diasAlugados;
	}

	public Filme getFilme() {
		return filme;
	}

	public int getDiasAlugados() {
		return diasAlugados;
	}	

}
