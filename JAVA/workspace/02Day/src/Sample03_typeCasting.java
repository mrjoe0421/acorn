
public class Sample03_typeCasting {

	public static void main(String[] args) {
		//데이터 타입 변경(자동으로 변경된다0
		//1. byte - > short - > int ->long->float->double (작은 -->큰)
		byte b = 10;
		short b2 = b;
		int b3 = b2;
		long b4 = b3;
		float b5 = b4;
		double b6 = b5;
		
		//2. char --> int
		char n = 'A'; //A는 65다
		int n2 = n+1;
		System.out.println(n2);
		
		//3. int보다 작은 타입의 연산결과는 int로
		short x = 10;
		short x2 = 20;
		int x3 = x + x2;
		
		//4. 문자열과 + 문자열이 아닌 데이터 => 연결된 문자열로 변환
		System.out.println("10" + 1+2+3); //
		System.out.println(1+2+3+"10"); //
		//System.out.println("10" - 1);
		
		// "10" -----> 10
		// 자바스크립트 : Number.parseInt("10")==>10
		// 자바: Integer.parseInt("10") ==> 10 문자를 숫자로 변환
		String k = "10";
		System.out.println(k+20);//
		int k2 = Integer.parseInt(k);//
		System.out.println(k2+20);//
		
		//10 ==> "10"  숫자를 문자로 변환
		// 자바스크립트 : toString()
		// 자바 : String.valueOf(10) ==> "10"
		// 자바 : String.valueOf(3.14) ==> "3.14"
		// 자바 : String.valueOf(true) ==> "true"
		System.out.println(String.valueOf(10)+10);
		
		//5. 작은타입과 큰타입이 연산 ==> 큰타입
		int p = 100;
		double p2 = 3.14;
		double p3 = p + p2;
		
		
	}

}
