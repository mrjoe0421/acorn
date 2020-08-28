
public class TestMain {

	public static void main(String[] args) {
	
		//AbstractClass x = new AbstractClass
		ConcreateClass y= new ConcreateClass(100);
		System.out.println(y.getNum());
		y.a();
		int n = y.b();
		y.c(100);
		
		ConcreateClass2 y2= new ConcreateClass2();
		System.out.println(y2.getNum());
		y2.a();
		int n2 = y2.b();
		y2.c(100);
	}

}
