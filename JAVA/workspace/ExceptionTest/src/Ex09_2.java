import java.sql.SQLException;

public class Ex09_2 {

	public static void main(String[] args) {
		System.out.println("시작");
		try {
			int value = 3;
			int num =3 / value;
			int result = num +100;
			System.out.println("연산된 값: "+ result);
		} catch(NullPointerException e) {
			e.printStackTrace();
		//	System.out.println(e.getMessage());
			System.out.println(num); //num이 try블럭 안에서 사용됬기 때문에 에러가 난다.
		}
		System.out.println("프로그램 정상 종료");
	}

}
