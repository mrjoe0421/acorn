package exam1;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하시오");
		int num = scan.nextInt();
		int result = num/100 * 100;
		System.out.println(result);

	}

}
