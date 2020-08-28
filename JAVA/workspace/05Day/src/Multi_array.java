
public class Multi_array {

	public static void main(String[] args) {
		
		//가. 2차원 배열선언
		int num [][];
		
		//나. 배열생성
		num = new int[2][3];
		
		//다. 초기화
		num[0][0] = 10;
		num[0][1] = 20;
		num[0][2] = 30;
		num[1][0] = 40;
		num[1][1] = 50;
		num[1][2] = 60;
		
		System.out.println(num[1][1]);
		System.out.println(num[0][2]);
		
		System.out.println(num.length);//num의 크기
		System.out.println(num[0].length);//num[0]의 크기
		
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++){
				System.out.println(num[i][j]); // 방법1
			}
			}
		for(int i[] :num) {
			for(int j:i) {
				System.out.println(j); // 방법 2
			}
		}
		
		//총합과 평균 구하기
		int sum = 0;
		int avg = 0;
		int num []= {10,20,30,40,50,60};
		
	
		}
	}


