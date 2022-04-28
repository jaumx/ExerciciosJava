package Aula08;

import java.util.Calendar;
import java.util.Date;

public class Data {

	public static void main(String[] args) { 
	
		Date data = new Date();
		System.out.println("Data agora:" + data);
		
		
		Calendar c = Calendar.getInstance();
		System.out.println("Data e hora atual:" + c.getTime());
		
		System.out.println("Ano: " + c.get(Calendar.YEAR));
		System.out.println("Mes: " + (c.get(Calendar.MONTH)+1));
		System.out.println("Dia do mes: " + c.get(Calendar.DAY_OF_MONTH));
		System.out.println("Dia da semana: " + c.get(Calendar.DAY_OF_WEEK));
	
		System.out.println("Hora: " + c.get(Calendar.HOUR_OF_DAY));
		System.out.println("Minutos: " + c.get(Calendar.MINUTE));
		System.out.println("Segundos: " + c.get(Calendar.SECOND));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
