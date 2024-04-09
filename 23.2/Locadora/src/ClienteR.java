import java.util.Enumeration;
import java.util.Vector;

public class ClienteR {

	private String nome;
	private Vector<AluguelR> alugueis = new Vector<AluguelR>();

	public ClienteR(String name) {
		this.nome = name;
	};

	public void adicionaAluguel(AluguelR arg) {
		this.alugueis.addElement(arg);
	}

	public String getName() {
		return this.nome;
	};

	public String statement() {
		Enumeration<AluguelR> rentals = alugueis.elements();
		String result = "Registro de Locação de " + getName() + "\n";
		while (rentals.hasMoreElements()) {
			AluguelR each = (AluguelR) rentals.nextElement();
			// mostrar valores para esta locacao
			result += "\t" + each.getFilme().getTitulo() + "\t" + String.valueOf(each.getPreco()) + "\n";
		}
		// adiciona linhas de rodape
		result += "O valor devido e: " + String.valueOf(getPrecoTotal()) + "\n";
		result += "Voce ganhou " + String.valueOf(getTotalPontosLocadorFrequente()) + " pontos de locador frequente";
		return result;
	}

	private double getPrecoTotal() {
		double resultado = 0;
		Enumeration<AluguelR> rentals = alugueis.elements();
		while (rentals.hasMoreElements()) {
			AluguelR each = (AluguelR) rentals.nextElement();
			resultado += each.getPreco();
		}
		return resultado;
	}

	private int getTotalPontosLocadorFrequente() {
		int resultado = 0;
		Enumeration<AluguelR> rentals = alugueis.elements();
		while (rentals.hasMoreElements()) {
			AluguelR each = (AluguelR) rentals.nextElement();
			resultado += each.getPontosLocadorFrequente();
		}
		return resultado;
	}

	public String htmlStatement() {
		Enumeration<AluguelR> rentals = alugueis.elements();
		String result = "<H1>Aluguels for <EM>" + getName() + "</EM></H1><P>\n";
		while (rentals.hasMoreElements()) {
			AluguelR each = (AluguelR) rentals.nextElement();
			result += each.getFilme().getTitulo() + ": " + String.valueOf(each.getPreco()) + "<BR>\n";
		}
		result += "<P>You owe <EM>" + String.valueOf(getPrecoTotal()) + "</EM><P>\n";
		result += "On this rental you earned <EM>" + String.valueOf(getTotalPontosLocadorFrequente())
				+ "</EM> frequent renter points<P>";
		return result;
	}

}
