import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("a의 값 : ");
		int a = sc.nextInt();
		System.out.println("b의 값 : ");
		
		
		int m = b-a;
		while(b<a) {
			System.out.println("a보다 큰 값을 입력하세요!");
			m++;
			if(b>a) break;
		}
		System.out.println("b-a는 " + m + "입니다.");
		
		
	}
	
}
