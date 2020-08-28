import java.sql.Date;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

public class Ex08_12 {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss (a)");
		String date = sdf.format(Date());
		System.out.println(date);
		

	}
	
	

}
