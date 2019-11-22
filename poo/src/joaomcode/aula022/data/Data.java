package joaomcode.aula022.data;

import java.util.Calendar;
import java.util.Date;

public class Data {

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();

		// Date data = new Date();
		Date data = c.getTime();

		System.out.println(data);

	}
}
