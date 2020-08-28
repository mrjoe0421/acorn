
public class label_01 {
	//label
	
	public static void main(String[] args) {
		A:
		for(int i=0;i<5; i++) {
			for(int j=0; j<4;j++) {
				if(i==3)break A;
				System.out.println(i+"\t"+j);
				
			}
		}//조건 검사를 먼저 하면 2,3이 나옴
	}

}
