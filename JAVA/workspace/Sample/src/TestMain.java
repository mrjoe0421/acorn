
public class TestMain {

	static {
		System.out.println("static 초기화블럭");
	}
	public TestMain() {
		System.out.println("TestMain 생성자");
	}
	{
		System.out.println("멤버변수 초기화 블럭");
	}
	public static void main(String[] args) {
		TestMain m=new TestMain();

	}

}
