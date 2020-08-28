
public class Ex03_9 {

	public static void main(String[] args) {
		
		int a = 12;
		int b = 4;
		int c = 10;
		
		int max = (a >b) ? a: b;
		max = (max>c) ? max : c;
		System.out.println("최대값은" + max);

	}

}
