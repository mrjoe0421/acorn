
public class exam2 {

	public static void main(String[] args) {
		//별 그리기 이중포문 while로 바꾸기
		int i =0;
		while(i<=10) {
			int j=0;
			while(j<=i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
