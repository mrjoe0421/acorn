import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       Random  ran  = new Random();  
	       int n = ran.nextInt();
	       int m = ran.nextInt();
	       int z= ran.nextInt(100)+1; //1부터 100까지의 결과 값
	       System.out.println(n);
	       System.out.println(m);
	       System.out.println(z);
	       
	      
	       

	}

}
