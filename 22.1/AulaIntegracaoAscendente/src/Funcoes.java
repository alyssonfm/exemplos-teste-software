import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Funcoes {
    public static double periodoEmMeses(Date ini, Date fim) {
	double meses;
	long i = ini.getTime();
	long f = fim.getTime();
	int dias = (int) ((f - i) / 1000 / 60 / 60 / 24);
	meses = (double) dias / 30;
	return meses;
    }

    public static Date stringToDate(String dataStr) {
	Date objDate;
	SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
	try {
	    objDate = formatador.parse(dataStr);
	} catch (ParseException e) {
	    objDate = null;
	}
	return objDate;
    }

}
