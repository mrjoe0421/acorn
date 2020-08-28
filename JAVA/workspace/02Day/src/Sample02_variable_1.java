
public class Sample02_variable_1 {//클래스 블럭

	public static void main(String[] args) {//메인 블럭
		
		//자바는 블럭 scope (자바스크립트는 함수scope)
		int test = 100;
				{//A 블럭
					int num = 10;
					System.out.println(num);
					System.out.println(test);
				}//A블럭
				//System.out.println(num); //블럭밖에서 인식불가
				{//B블럭
					int num = 20;
					System.out.println(num);
					System.out.println(test);
				}//B블럭
			}//main 블럭	
		}//클래스 블럭
