
public class Sample02_variable2 {

	public static void main(String[] args) {
		//홍길동 20 서울 성별(남) 결혼여부(false)
		//1. 변수선언과 초기화 동시에
		String name = "홍길동";
		int age = 20;
		String address = "서울";
		char gender = '남';
		boolean isMarried = false;
		float height = 185.63F;
		double weight = 78.25;
		long productNo = 124562643L;
		
		System.out.println("String name=" + name +
						   "int age=" + age +
						   "String address=" + address +
						   "char gender=" + gender +
						   isMarried +
						   height +
						   weight		   
				); 
		System.out.printf("이름은 %s, %n, %s, c%, %n, %n, %n", "홍길동", 20, "서울", '남', false, 185.63F, 78.25 );
		System.out.println(productNo);
	}

}
