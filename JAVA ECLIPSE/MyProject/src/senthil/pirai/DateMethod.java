package senthil.pirai;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		System.out.println(time.getHour()+" "+time.getMinute()+" "+time.getSecond());
		System.out.println(date.getDayOfYear());
		System.out.println(time);

	}

}
