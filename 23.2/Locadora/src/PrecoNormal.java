
public class PrecoNormal extends Preco {

	int getCodigoPreco() {
		return Filme.NORMAL;
	}

	public double getPreco(int diasAluguel) {
		double resultado = 2;
		if (diasAluguel > 2)
			resultado += (diasAluguel - 2) * 1.5;
		return resultado;
	}

}
