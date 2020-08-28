
public class break_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n=1;
			while(n<=10) {
				System.out.println(n+"Hello World");
				n++;
				if( n== 8) break;
			}
			System.out.println(n);
			
			for (int i=0;i<5;i++) {
				System.out.println("hello1 "+ i);
				System.out.println("hello2 "+ i);
				if(i==3)continue;
				System.out.println("hello3 "+ i);
				System.out.println("hello4 "+ i);
			}
			
	}
	

}
