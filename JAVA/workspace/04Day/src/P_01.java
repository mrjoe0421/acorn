
public class P_01 {
		
	public static void main(String[] args) {
		
		int evensum = 0; //짝수 누적합
		int oddsum = 0; //홀수 누적합
		for(int n=1; n <=10; n++) {
			if(n % 2 == 0) {
				System.out.println(n+" = 짝수");
				evensum+=n;
			}else {
				System.out.println(n+" = 홀수");
				oddsum+=n;
			}
			}
		
		System.out.println("홀수 합" + oddsum + "짝수 합" + evensum);
		}
	
	}


