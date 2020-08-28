
public class Array2 {

	public static void main(String[] args) {
		
		int [] num = {1, 2,3,4};
		
		for(int x : num) {
			System.out.println("정수 배열 값 : "+ x);
		}
		
		String [] name = {"홍길동", "이순신", "유관순"};
		
		for(String s : name) {
			System.out.println("문자열 배열 값 : " + s);
		}

	}

}
