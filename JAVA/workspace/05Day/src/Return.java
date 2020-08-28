
public class Return {

	public void sum(int a, int b) {
		System.out.println("sum()함수호출====");
		a = 100;
		b = 200;
		System.out.println("sum num======" + a + ":" + b);

	}

	public int sub(int num1, int num2) {
		System.out.println("sub()함수호출====");
		int result = num2 - num1;
		System.out.println("sub()결과===" + result);
		return result;
	}

	public int mux(String num1, int num2) {
		System.out.println("mux()호출=======");
		int result = Integer.parseInt(num1) * num2;
		System.out.println("mux()결과===" + result);
		return result;
	}

	public double div(int num1, int num2) {
		System.out.println("div()함수호출===");
		int result = num2 / num1;
		System.out.println("div()함수결과===" + result);
		return result;
	}

	public String[] printArr(String arr[]) {
		System.out.println("pringArr()호출===");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("pringArr()>>" + arr[i]);
		}
		return arr;
	}

	public int[][]
	  printMuxArr(int[][]arr){ 2차원 배열 return arr; } ;
	public Book printBook(Book oneBook) { return oneBook; }

	public static void main(String[] args) {
		System.out.println("main시작========");
		int a = 10;
		int b = 20;
		Return test = new Return(); // 객체생성
		test.sum(a, b);
		System.out.println("main a======" + a);

		test.sum(a, b); // 호출 10, 20
		/*
		 * test.sub(a,b); test.mux("10",b); test.div(b,a); StringArr[0]="홍길동";
		 * StringArr[1]="이순신"; test.printArr(StringArr);String [] StringArr = new
		 * String[2];
		 */
		System.out.println("main종료========");

	}
}
