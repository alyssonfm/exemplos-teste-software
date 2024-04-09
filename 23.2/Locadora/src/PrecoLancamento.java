
public class PrecoLancamento extends Preco {

	int getCodigoPreco() {
		return Filme.LANCAMENTO;
	}
	
	public double getPreco(int diasAluguel) {
		return diasAluguel * 3;
	}
	
	public int getPontosLocadorFrequente(int diasAluguel) {
		return (diasAluguel > 1)? 2: 1;
	}

}
