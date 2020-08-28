package exam1;

import java.util.Scanner;

public class exam4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("키의 최댓값을 구합니다.");
		System.out.println("사람 수:");
		int num = scan.nextInt();
		
		
		int max = 0;
		for(int i=0; i<num; i++) {
			System.out.println("사람" + (i+1) + ":");
			int max= scan.nextInt();
		}
		
		System.out.println("최댓값은" + max + "입니다.");
	}
	
}
