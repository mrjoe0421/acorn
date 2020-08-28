
public class Try_catch2 {

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		try {
			System.out.println("B");
			int num = 3/0;
			System.out.println("C");
		}catch(Exception e){
			System.out.println("D");
		}
		System.out.println("E");
	}
		
}
