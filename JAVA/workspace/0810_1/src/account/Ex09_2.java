package account;

public class Ex09_2 {

	public static void main(String[] args) {
		System.out.println("시작");
		try {
			int value = 0;
			int num= 3/ value;
			int result = num +100;
			System.out.println("연산된 값: " + result);
		}catch(ArithmeticException e) {
			System.out.println(e.printStackTrace());
		}
		System.out.println("프로그램 정상 종료");
	}

}
