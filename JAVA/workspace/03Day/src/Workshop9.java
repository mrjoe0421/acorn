import java.util.Scanner;

public class Workshop9 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1. 정수 입력하세요");
		String num_1 = scan.next();
		System.out.println("2. 정수 입력하세요");
		int intnum1 = Integer.parseInt(num_1);
		int intnum2 = scan.nextInt();
		int result = (intnum1 < intnum2) ?intnum1 :intnum2 ;
				
				System.out.println(intnum1 + "\n" + intnum2 + "\n" + result);

	}

}
