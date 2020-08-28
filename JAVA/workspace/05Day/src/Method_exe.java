
public class Method_exe {
	
	public void sum(int num1, int num2) {
		System.out.println("sum()함수호출====");
		int result = num1 + num2;
		System.out.println("sum()결과==="+result);
	}
	public void sub(int num1, int num2) {
		System.out.println("sub()함수호출====");
		int result = num2 - num1;
		System.out.println("sub()결과==="+result);
	}
	public void mux(String num1,int num2 ) {
		System.out.println("mux()호출=======");
		int result = Integer.parseInt(num1)*num2;
		System.out.println("mux()결과==="+result);
	}
	public void div(int num1, int num2) {
		System.out.println("div()함수호출===");
		int result = num2 / num1;
		System.out.println("div()함수결과==="+result);
	}
	public void printArr(String arr []) {
		System.out.println("pringArr()호출===");
		for(int i=0;i < arr.length; i++) {
			System.out.println("pringArr()>>" + arr[i]);
		}
	}
	public void avg(int num1, int num2) {
		System.out.println("avg호출===");
		int result = num1 / num2;
		System.out.println("avg결과===");
	}

	public static void main(String[] args) {
		System.out.println("main시작========");
		int a=10;
		int b=20;
		
		Method_exe test = new Method_exe(); //객체생성
		String [] StringArr = new String[2];
		
		
		
		test.sub(a,b);
		test.sum(a, b); //호출 10, 20
		test.mux("10",b);
		test.div(b,a);
		StringArr[0]="홍길동";
		StringArr[1]="이순신";
		test.printArr(StringArr);
		test.avg(a,b);
		System.out.println("main종료========");
		
		}
	}


