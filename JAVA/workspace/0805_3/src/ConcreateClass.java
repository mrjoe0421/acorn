
public class ConcreateClass extends AbstractClass{
	
	public ConcreateClass() {
		super();
	}
	public ConcreateClass(int num) {
		super(num);
	}
	@Override
	public void a() {
		System.out.println("ConcreateClass   	===a()");
		
	}
	@Override
	public int b() {
		System.out.println("ConcreateClass   	===b()");
		return 0;
	}
	@Override
	public void c(int x) {
		System.out.println("ConcreateClass   	===c()");
		
	}
	
}
