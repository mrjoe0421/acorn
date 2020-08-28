
public class Sample03_typeCasting2 {

	public static void main(String[] args) {
		int n = 10;
		short n2 = (short)n;
		System.out.println(n2);
		
		short x =10;
		short x2 = 20;
		short x3 = (short) (x + x2); //주의
		//short x4 = (short) x + x2;
		System.out.println(x3);
		

	}

}
