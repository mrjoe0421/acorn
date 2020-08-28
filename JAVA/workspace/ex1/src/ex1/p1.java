package ex1;

public class p1 {

	public static void main(String[] args) {
		char ch = 'j';
		if(ch>='a'&&ch<='z') {
			System.out.println("해당 문자는 영문 소문자입니다");
			
		char ch1 = 'J';
		if(ch1>='a' && ch1<='z') {
			System.out.println("해당 문자는 영문 소문자입니다.");
		}else {
			System.out.println("해당 문자는 영문 소문자가 아닙니다.");
		}
		}
		char ch2 = 'J';
		if(ch2 >='a' && ch2<='z') {
			System.out.println("해당 문자는 영문 소문자입니다.");
		}else if(ch2 >='A' && ch2<='Z') {
			System.out.println("해당 문자는 영문 대문자입니다.");
		}else {
			System.out.println("해당 문자는 영문자가 아닙니다.");
		}
		
		
	}

}
