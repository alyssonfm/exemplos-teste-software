
public class PrecoInfantil extends Preco {

	int getCodigoPreco() {
		return Filme.INFANTIL;
	}

	public double getPreco(int diasAluguel) {
		double resultado = 1.5;
		if (diasAluguel > 3)
			resultado += (diasAluguel - 3) * 1.5;
		return resultado;
	}

}
