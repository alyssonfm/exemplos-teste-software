import java.util.Enumeration;
import java.util.Vector;

public class Cliente {

	private String nome;
	private Vector<Aluguel> alugueis = new Vector<Aluguel>();

	public Cliente(String name) {
		this.nome = name;
	};

	public void adicionaAluguel(Aluguel arg) {
		this.alugueis.addElement(arg);
	}

	public String getName() {
		return this.nome;
	};

	public String statement() {
		double quantiaTotal = 0;
		int pontosLocadorFrequente = 0;
		Enumeration<Aluguel> rentals = alugueis.elements();
		String result = "Registro de Locação de " + getName() + "\n";
		while (rentals.hasMoreElements()) {
			double thisAmount = 0;
			Aluguel each = (Aluguel) rentals.nextElement();
			switch (each.getFilme().getCodigoPreco()) {
			case Filme.NORMAL:
				thisAmount += 2;
				if (each.getDiasAlugados() > 2)
					thisAmount += (each.getDiasAlugados() - 2) * 1.5;
				break;
			case Filme.LANCAMENTO:
				thisAmount += each.getDiasAlugados() * 3;
				break;
			case Filme.INFANTIL:
				thisAmount += 1.5;
				if (each.getDiasAlugados() > 3)
					thisAmount += (each.getDiasAlugados() - 3) * 1.5;
				break;
			}
			// adicionar os pontos do locador frequente
			pontosLocadorFrequente++;
			// adicionar bonus para uma locacao de lancamento por dois dias
			if ((each.getFilme().getCodigoPreco() == Filme.LANCAMENTO) && each.getDiasAlugados() > 1)
				pontosLocadorFrequente++;
			// mostrar valores para esta locacao
			result += "\t" + each.getFilme().getTitulo() + "\t" + String.valueOf(thisAmount) + "\n";
			quantiaTotal += thisAmount;
		}
		// adiciona linhas de rodape
		result += "O valor devido e: " + String.valueOf(quantiaTotal) + "\n";
		result += "Voce ganhou " + String.valueOf(pontosLocadorFrequente) + " pontos de locador frequente";
		return result;
	}

}
