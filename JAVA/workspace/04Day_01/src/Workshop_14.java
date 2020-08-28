import java.util.Scanner;

public class Workshop_14 {

	public static void main(String[] args) {
		
		int i = 0;
		int j = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("-----곱셈표-----" );
		for(i=1;i<10;i++) {
			for(j=1;j<10;j++) {
				System.out.print((i * j)+" \t");
			}
			System.out.println((i * j));
		}
		
	}

}
