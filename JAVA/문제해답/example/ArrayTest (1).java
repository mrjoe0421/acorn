
public class ArrayTest {
	public void printArr(int[] recieve) {// ()안에 받을 인자 타입, 변수
		System.out.println("printArr====호출");
		for (int i = 0; i < recieve.length; i++) {
			System.out.println(">>" + recieve[i]);
		}
	}
	public void printForEach(int[] recieve) {// ()안에 받을 인자 타입, 변수
		System.out.println("printForEach====호출");
		for (int x : recieve) {
			System.out.println(x);
		}
	}
	public static void main(String[] args) {	
		System.out.println("main 시작 ====================");
		ArrayTest test = new ArrayTest();//함수 호출을 위해 객체 생성,함수호출준비완료
		int[] num;	
		num = new int[3];	
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		test.printArr(num);// 함수 호출 및 값 전달
		test.printForEach(num);// 함수 호출 및 값 전달
		System.out.println("main 수행 ====================");


	}

}
