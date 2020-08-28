
public class Ex04_5 {

	public static void main(String[] args) {
		
		int score = 88;
		
		switch (score / 10) {
		
		case 10: System.out.println("10이다");
		case 9: System.out.println("9이다");
		case 8: System.out.println("8이다");
		case 7: System.out.println("7이다");
		case 6: System.out.println("6이다");
		default: System.out.println("default이다");
		} //end switch
		System.out.println("점수는 "+ score);

	}

}
