import java.util.Scanner;

public class workshop3_6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("키의 최댓값을 구합니다");
		System.out.println("사람 수 :");
		int num = scan.nextInt();
		int max = 0;
		
		for(int i= 0; i<num; i++ ) {
			System.out.println("사람"+ (i+1) + ":" );
			int k = scan.nextInt();
			
			if(max <= k) {
				max = k;
			}
		}
		System.out.println("최댓값은" + max + "입니다");

	}

}
