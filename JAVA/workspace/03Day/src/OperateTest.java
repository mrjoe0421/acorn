
public class OperateTest {

	public static void main(String[] args) {
		//2.대입연산자
		int x = 10;
		int x2 = x;
		x2 += x; // ex) x+=1, -> x = x+1
		x2 -= x;
		x2 *= x;
		x2 /= x;
		x2 %= x;
		
		System.out.println(x2 = x2+x);
		System.out.println(x2 = x2-x);
		System.out.println(x2 = x2*x);
		System.out.println(x2 = x2/x);
		System.out.println(x2 = x2%x);
		
		//3. 증감연산자
		
		int k = 10;
		int a = --k;
		 //전치 k= k+1, int a = k
		//int a = k++; 
		System.out.println(a +"  "+ k);
		int b= k--; //후치 int b = k, k=k+1
		System.out.println(b +"  "+ k);

	}

}
