
public abstract class Preco {
	
	abstract int getCodigoPreco();
	
	public abstract double getPreco(int diasAluguel);
	
	public int getPontosLocadorFrequente(int diasAluguel) {
		return 1;
	}

}
