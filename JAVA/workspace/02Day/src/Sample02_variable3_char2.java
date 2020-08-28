
public class Sample02_variable3_char2 {

	public static void main(String[] args) {
		
		
		// char는 수치형이다.
		char c = 'A'; // 65(아스키코드값)
		char c1 = 'a'; // 97(아스키코드값)
		char c2 = '1'; //49
		int c3 = 'A' + 'a';
		
		System.out.println(c+1);
		System.out.println(c1+1);
		System.out.println(c2+1);
		System.out.println(c2+2);
		System.out.println(c3);
		
		//자바는 블럭 scope (자바스크립트는 함수scope_
		{
			int num = 10;
			System.out.println(num);
		}
 //A블럭
		//System.out.println(num); //블럭밖에서 인식불가
		{
			//B블럭
			int num = 20;
			System.out.println(num);
		}//B블럭
	}//main 블럭

}
