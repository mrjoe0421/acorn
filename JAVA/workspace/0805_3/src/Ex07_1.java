
	
abstract class MyClass {
	int num = 3;
	public MyClass() {}
	public MyClass(int num) {
		this.num =num;
	}
	public void methodA() {
		System.out.println("methodA");
	}
	public abstract void methodB();
}
class MyClassImp1 extends MyClass {
	public void print() {
		System.out.println(num);
	}

	@Override
	public void methodB() {
		System.out.println("methodB");
		
	}
	
}
public class Ex07_1 {
	public static void main(String[] args) {
		MyClassImp1 imp = new MyClassImp1();
		imp.print();
		imp.methodB();
		

	}

}
