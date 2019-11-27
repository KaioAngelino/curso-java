package joaomcode.aula025;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class Exe02 {
	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		Date data = c.getTime();
		
		LocalDate agora = LocalDate.now();
		Instant i = agora.atStartOfDay(ZoneId.of("America/Sao_Paulo")).toInstant();
		
		data.from(i);
		System.out.println(i);
		System.out.println(data);

	}
}
