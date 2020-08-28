
public class OperaterTest_01 {

	public static void main(String[] args) {
		
		int a = 3;
		++a ;
		System.out.println(a);
		a--;
		System.out.println(a);
		
		int x = 5;
		int y = ++x;
		System.out.println(x + " " + y);
		
		int x2 = 5;
		int y2 = x2++;
		System.out.println(x2 + " " + y2);
		
		int q = 10;
		int q2 = ++q;
		System.out.println(q + "\t"+q2);
		int q3 = q++;
		System.out.println(q+"\t"+q3);
		
		//2. 비교연산자
		int xyz = 5;
		int xyz2=3;
		boolean result = xyz == xyz2;
		System.out.println(result);
		System.out.println(xyz == xyz2);
		System.out.println(xyz != xyz2);
		System.out.println(xyz > xyz2);
		System.out.println(xyz >= xyz2);
		System.out.println(xyz < xyz2);
		System.out.println(xyz <= xyz2);
		
		//3.논리연산자
		
		System.out.println(3==4 && 4>3);
		System.out.println(! true);
		System.out.println(! false);
		System.out.println(true || true);
		System.out.println(false || false);
		System.out.println(true || false);
		System.out.println(false || true);

		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		//예제
		
		int x1 =10;
		int y1 = 15;
		System.out.println(x1 > 5 && x1< 25);
		System.out.println(x1 > 8 && y1< 10);
	
		System.out.println(x1 > 15 || x1 < 25);
		System.out.println(x1 > 8 || y1 < 25);
		
		int xxx = (3==4)?100:200;
		String xxx2 = (3!=4)?"A":"B";
		System.out.println(xxx);
		System.out.println(xxx2);
		
		int A = 10;
		int B = 20;
		int Max = (A > B)?A:B;
		System.out.println(Max);
		
		
	}

}
