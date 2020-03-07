import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimeJava8 {

	public static void main(String[] args) {
		LocalDate d = LocalDate.now();
		System.out.println("LocalDate.now()=="+d);
		LocalDateTime dt = LocalDateTime.now();
		System.out.println("LocalDateTime.now()=="+dt);
		LocalDate dp = LocalDate.of(1994, 10, 16);
		System.out.println("LocalDate.of(using everything as number input)=="+dp);
		LocalDate dm = LocalDate.of(1994, Month.OCTOBER, 16);
		System.out.println("LocalDate.of(using month as string input)=="+dm);
		LocalDate dy = LocalDate.MAX;
		LocalDate dz = LocalDate.MIN;
		System.out.println("MAX:"+dy+" MIN:"+dz);
		LocalDate dw = LocalDate.parse("2020-03-05");
		System.out.println("LocalDate.parse()=="+dw);
	//	DateTimeFormatter dft = DateTimeFormatter.
	//	LocalDate.format(dw);
	}
}
