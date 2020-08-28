
public class Ex05_5 {

	public static void main(String[] args) {
		
		int [][] num = new int[3][];
		
		num[0] = new int[3];
		num[1] = new int[2];
		num[2] = new int[1]; //선언 및 생성
		
		num[0][0] = 1;
		num[0][1] = 1;
		num[0][2] = 1;
		num[1][0] = 1;
		num[1][1] = 1;
		num[2][0] = 1; //초기화
		
		for (int i =0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				System.out.println("num["+i+"]["+j+"]=" + num[i][j]);
			}
		}
	}

}
