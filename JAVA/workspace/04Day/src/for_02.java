
public class for_02 {
//1~100까지의 3의 배수의 합
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 0; i<=100; i++) {
			if(i%3 ==0) {
				sum +=i;
			}
		}
		System.out.println(sum);
	}

}
