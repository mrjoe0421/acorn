
public class Sample04_final {

	public static void main(String[] args) {

		// 상수 : 값변경불가, 전부 대문자로
		// Byte.Min_VALUE, Byte,MAX_VALUE
		final int SIZE = 100;
		//SIZE = 200; //값 변경불가
		System.out.println(SIZE); //100
		int num = 10;
		System.out.println(num); //10
		num = 20;
		System.out.println(num); //20

	}

}
