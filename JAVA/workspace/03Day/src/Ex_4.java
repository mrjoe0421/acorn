
public class Ex_4 {

	public static void main(String[] args) {

		// 1. new 사용
		String s = new String("hello");
		String s2 = new String("hello");
		System.out.println(s == s2); // false
		boolean result = s.equals(s2); // 내용비교
		System.out.println(result); // true

		// 2.
		String n = "hello";
		String n2 = "hello";
		System.out.println(n == n2); // true
		System.out.println(n.equals(n2)); // 내용비교

		// 3. switch

		System.out.println("점수 입력하시오");
		int num = 90;
		switch (num) {
		case 10:
			System.out.println("10");
			break;
		case 20:
			System.out.println("20");
			break;
		case 30:
			System.out.println("30");
			break;
		case 40:
			System.out.println("40");
			break;
		default:
			System.out.println("default");
		}
		System.out.println("프로그램 종료");

		char xxx2 = 'A';
		switch (xxx2) {
		case 'A':
			System.out.println("A");
			break;
		case 'B':
			System.out.println("A2");
			break;
		case 'C':
			System.out.println("A3");
			break;
		case 'D':
			System.out.println("A4");
			break;
		default:
			System.out.println("default");
		}
		System.out.println("문장3");
	
		if (xxx2 == 'A') {
			System.out.println("A");
		} else if (xxx2 == 'B') {
			System.out.println("B");
		} else if (xxx2 == 'C') {
			System.out.println("C");
		} else if (xxx2 == 'D') {
			System.out.println("D");
		} else {
			System.out.println("F");
		}

		
	}
}
