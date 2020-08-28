import java.util.Scanner;

public class ArrayTest06 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
			System.out.print("키의 최댓값을 구합니다."+"\n"+"사람 수: ");
		
			int i = scan.nextInt();
			int [] arr = new int[i];
			System.out.println("================");
			System.out.println(arr.length);
			System.out.println("================");
			
			int max = arr[0];
			
			for(int j=0; j<arr.length;j++) {
				arr[j] = scan.nextInt();
				if(arr[j]> max) {
					max =arr[i];
				
				}
			}
			 
			System.out.println(max);
	}

}
