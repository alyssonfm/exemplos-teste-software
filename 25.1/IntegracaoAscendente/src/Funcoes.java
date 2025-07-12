import java.util.Date;

public class Funcoes {

	public static Date stringToDate(String dataStr) {
		return null;
	}

	public static double periodoEmMeses(Date ini, Date fim) {
		double meses;
		long i = ini.getTime();
		long f = fim.getTime();
		int dias = (int) ((f - i) / 1000 / 60 / 60 / 24);
		meses = (double) dias / 30;
		return meses;
	}

}
