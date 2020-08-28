
public class for_05 {

	public static void main(String[] args) {
		
		
	//1. 이중 for문
		for(int i=0; i<5; i++) {
			for(int j=0; j<4; j++) {
				
				}
	}// end for
		
		//2~9까지 구구단(계산X)
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
		}
		
		//2단만 출력하기
		for(int i=2; i<10; i+=2) {
			for(int j=1; j<10; j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
		}
		
		//3행 5열 println과 print 쓰기
		for(int i=1; i<4; i++) {
			for(int j=1; j<6; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		// 별 그리기
		for(int i=1; i<=10; i++) {
			for(int j=1; j<10; j++) {
				System.out.print('*');
			}
			System.out.println('*');
		}
		
		//별 그리기2
		for(int i=1; i<10; i++) {
			for(int j=1; j<i; j++) {
				System.out.print('*');
			}
			System.out.println('*');
		}
		
	}
}
