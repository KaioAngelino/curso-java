package joaomcode.aula024;

import java.text.DateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Data {
	
	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		
		Date data = c.getTime();
		
		DateFormat dataFormatada = DateFormat.getDateInstance();
		System.out.println(dataFormatada.format(data));
		System.out.println(" ");
		
		DateFormat horaFormatada = DateFormat.getTimeInstance();
		System.out.println(horaFormatada.format(data));
		System.out.println(" ");
		
		Instant horaDeMaquina = Instant.now();
		System.out.println(horaDeMaquina);
		System.out.println(" ");
		
		Instant aposOAlgoritmo = horaDeMaquina.plusSeconds(10);
		System.out.println(aposOAlgoritmo);
		System.out.println(" ");
		
		Duration duracao = Duration.between(horaDeMaquina, aposOAlgoritmo);
		
		DateTimeFormatter dataFormatada2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDateTime data2 = LocalDateTime.now();
		System.out.println(dataFormatada2.format(data2));
		System.out.println(" ");
		
		System.out.println(data2);
		System.out.println(" ");
		
		
		LocalDate inicioCurso = LocalDate.of(2019,Month.OCTOBER,21);
		LocalDate finalCurso = LocalDate.of(2020, Month.JANUARY,28);
		Period tempoDeCurso = Period.between(inicioCurso, finalCurso);
		System.out.println(tempoDeCurso.getDays());
		System.out.println(" ");
		
		System.out.println("Dia: "+data2.getDayOfMonth());
		System.out.println("Mês: "+data2.getMonthValue());
		System.out.println("Ano: "+data2.getYear());
		System.out.println(" ");
		
		
		
	}
}
