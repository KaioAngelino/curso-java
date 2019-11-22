package joaomcode.aula022.data;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class Data {

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();

		// Date data = new Date();
		Date data = c.getTime();

		DateFormat hora = DateFormat.getTimeInstance();

		System.out.println("hora: " + hora.format(data));
		
		DateFormat data2 = DateFormat.getDateInstance();
		
		System.out.println("Data: "+data2.format(data));

		System.out.println(data);

	}
}
