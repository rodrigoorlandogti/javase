package modulo9;

import java.text.DateFormat;
import java.util.Date;

public class Principal {

	public static void main(String[] args) {


		Date dataAtual = new Date();
	System.out.println(dataAtual + " : " + dataAtual.getTime());
	
	DateFormat df  = DateFormat.getDateInstance();

	df = DateFormat.getDateInstance(DateFormat.FULL);
	System.out.println("Fotmato padrão: " + df.format(dataAtual));

	df = DateFormat.getDateInstance(DateFormat.SHORT);
	System.out.println("Fotmato padrão: " + df.format(dataAtual));

	df = DateFormat.getDateInstance(DateFormat.MEDIUM);
	System.out.println("Fotmato padrão: " + df.format(dataAtual));

	df = DateFormat.getDateInstance(DateFormat.LONG);
	System.out.println("Fotmato padrão: " + df.format(dataAtual));

	}

}

