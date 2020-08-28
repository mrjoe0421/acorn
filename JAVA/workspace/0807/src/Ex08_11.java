import java.sql.Date;
import java.util.Calendar;

public class Ex08_11 {

	public static void main(String[] args) {
		Calendar cal2 = Calendar.getInstance();
		cal2.set(2014, 11,24);
		Date now = cal2.getTime();
		System.out.println(now);
				

	}

}
