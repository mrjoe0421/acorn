import java.util.Scanner;

public class Workshop07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("한 자리 정수값을 입력하시오");
		int numberValue = sc.nextInt();
		int resultValue = 0;
		for(int i=1;i<=100;i++) {
			if((i % numberValue)==0) {
				resultValue += i;
				if(i!=numberValue)System.out.print("+");
				System.out.print(i);
			}
			
		}
		System.out.println("="+resultValue );
	}

}
