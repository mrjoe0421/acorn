
public class while_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//while문
		int n=0;
		int sum=0;
		while(n<=10) {
			System.out.println("hello " + n);
			sum+=n;
			n++;
		}
		
		System.out.println(sum );
		// do_while문 : 조건이 일치하지않아도 적어도 한번은 수행
		int n2 =0;
		do {
			System.out.println("world");
			n2++;
		}while(n2<5);
		
		
		}
}
