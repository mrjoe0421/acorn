package ex1;

public class p3 {

	public static void main(String[] args) {
//	int i =0;
//		
//		while(i<5) {
//			System.out.println("while문이 " + (i+1) + "번째 반복 실행");
//			i++;
//		}
//		System.out.println("while문이 종료된 후 변수 i의 값은 :"+ i +"입니다");

		int i = 1, j =1;
		
		while(i<1) {
			System.out.println("while문이 " + i + "번째 반복 실행중입니다.");
			i++;
	}
		System.out.println("while문이 종료된 후 변수 i의 값은 " + i +"입니다");
		
		do {
			System.out.println("do/while문이 " + "번째 반복 실행중입니다.");
			j++;
		}while(j <1);
		System.out.println("do/while 문이 종료된 후 변수 j의 값은" + j +"입니다.");
	}


}