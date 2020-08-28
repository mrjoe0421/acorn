
public class Array_01 {

	public static void main(String[] args) {
		//1. 배열 선언
		// 데이터타입 [ ] 변수명;
		int [] num;
		
		//2. 배열 생성
		// 변수명 = new 데이터타입[크기];
		num = new int[3];
		
		//3. 배열초기화
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		//num[3] = 40; //java.lang.ArrayIndexOutOfBoundsException
//		System.out.println(num[0]);
//		System.out.println(num[1]);
//		System.out.println(num[2]);
//		System.out.println("배열크기(길이)" + num.length);
//		for(int i=0; i<num.length;i++) {
//			System.out.println(">>" + num[i]);
//		}
//		//foreach문
//		for(int x : num) {
//			System.out.println(x);
		}
		
	}

}
