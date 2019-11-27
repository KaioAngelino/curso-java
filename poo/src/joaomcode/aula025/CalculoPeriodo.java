package joaomcode.aula025;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class CalculoPeriodo {

	public static void main(String[] args) {

		LocalDate dataCarnaval = LocalDate.of(2020, Month.FEBRUARY, 25);
		LocalDate dataNatal = LocalDate.of(2020, Month.DECEMBER, 25);
		Period tCarnaNatal = Period.between(dataCarnaval, dataNatal);
		DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("O carnaval será dia " + dataFormatada.format(dataCarnaval));
		System.out.println("O carnaval será dia " + dataFormatada.format(dataNatal));
		System.out.println("Entre o natal e o carnaval de 2020 teremos " + tCarnaNatal.getMonths() + " meses e "
				+ tCarnaNatal.getDays() + " dias.");

		System.out.println(" ");

		LocalDate inicioFeriasJulho = LocalDate.of(2020, Month.JULY, 1);
		LocalDate inicioFeriasDezembro = LocalDate.of(2020, Month.DECEMBER, 1);
		Period pFerias = Period.between(inicioFeriasJulho, inicioFeriasDezembro);

		System.out.println("O inicio das férias de Julho será dia " + dataFormatada.format(inicioFeriasJulho));
		System.out.println("As férias de Dezembro iniciam dia " + dataFormatada.format(inicioFeriasDezembro));
		System.out.println("Entre as férias de Julho e Dezembro teremos " + pFerias.getMonths() + " meses e "
				+ pFerias.getDays() + " dias.");

		System.out.println(" ");

		LocalDate comecoDoAno = LocalDate.of(2020, Month.JANUARY, 1);
		LocalDate dPascoa = LocalDate.of(2020, Month.APRIL, 12);
		Period pComecoPascoa = Period.between(comecoDoAno, dPascoa);

		System.out.println("O inicio do ano é dia " + dataFormatada.format(comecoDoAno));
		System.out.println("A Páscoa desse ano será dia " + dataFormatada.format(dPascoa));
		System.out.println("O período entre a Páscoa e o começo do ano é de " + pComecoPascoa.getMonths() + " meses e "
				+ pComecoPascoa.getDays() + " dias.");

		System.out.println(" ");

		// Site com os fusos horários mkyong.com
		LocalDateTime saidaBrasil = LocalDateTime.of(2019, Month.NOVEMBER, 28, 07, 00);

		LocalDateTime chegadaSuica = saidaBrasil.plusMinutes(622);

		ZonedDateTime saidaBrasilComFuso = ZonedDateTime.of(saidaBrasil, ZoneId.of("America/Sao_Paulo"));
		ZonedDateTime chegadaSuicaComFuso = ZonedDateTime.of(chegadaSuica, ZoneId.of("Europe/Zurich"));

		Duration pChegadaSuica = Duration.between(saidaBrasilComFuso, chegadaSuicaComFuso);

		System.out.println(chegadaSuica);
		System.out.println(pChegadaSuica);
		System.out.println(chegadaSuicaComFuso);

		System.out.println(" ");

		Instant i = comecoDoAno.atStartOfDay(ZoneId.of("America/Sao_Paulo")).toInstant();
		System.out.println(i);
	}

}
