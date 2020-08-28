
public class Ex03_8 {

	public static void main(String[] args) {

		String name = null;
		System.out.println( (4 < 2) || ( name.length() == 4));
		System.out.println( (4 > 2) || ( name.length() == 4));
		
		
		int a = 10;
		int b = 20;
		int c = 30;
		int Max = (b < c)?c:a;
		System.out.println(Max);
	}

}
