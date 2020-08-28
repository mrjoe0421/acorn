import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("양의 정수값의 자릿수 구하기");
		int a = sc.nextInt();
		while(a<0) {
			System.out.println("정수값 : ");
			int b = sc.nextInt();
			if(b>0) break;
			
		}
	System.out.println("그 수는 "+ +" 자리입니다.");	
	}
	
}
