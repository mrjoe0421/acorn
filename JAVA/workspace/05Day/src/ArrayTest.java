
public class ArrayTest {
	
		  public void printArr(int[] num){          //void: 돌려 줄 값이 없다, ()안에 받을 인자 타입, 변수		
		  System.out.println("printArr====호출"); 
		  for(int i=0; i<num.length;i++) {
		  System.out.println(">>" + num[i]);	 
		  		}
		  }
		  
		public void printForEach(int[] x) {
			System.out.println("printForEach====호출"); 
			for(int num : x) {
			System.out.println(num);
			//System.out.println(">>" + num);	
				}
		  }
	
	public static void main(String[] args) {
		
				//1. 배열 선언
				// 데이터타입 [ ] 변수명;
				System.out.println("main 시작====");
				ArrayTest test= new ArrayTest(); //함수 호출을 위해 객체 생성, 함수호출준비완료
				int [] num;
				
				//2. 배열 생성
				// 변수명 = new 데이터타입[크기];
				num = new int[3];
				
				//3. 배열초기화
				num[0] = 10;
				num[1] = 20;
				num[2] = 30;
				
				
				//2. 배열 생성
				// 변수명 = new 데이터타입[크기];
				num = new int[3];
				
				//3. 배열초기화
				num[0] = 10;
				num[1] = 20;
				num[2] = 30;
				
				//num[3] = 40; //java.lang.ArrayIndexOutOfBoundsException
				test.printForEach(num);
				test.printArr(num); //함수 호출 및 값 전달
				test.printArr(num);
				System.out.println("main 수행====");
//				System.out.println(num[0]);
//				System.out.println(num[1]);
//				System.out.println(num[2]);
//				System.out.println("배열크기(길이)" + num.length);
//				for(int i=0; i<num.length;i++) {
//					System.out.println(">>" + num[i]);
//				}
//				//foreach문
//				for(int x : num) {
//					System.out.println(x);
//				}
				
			

		

	}

	}
