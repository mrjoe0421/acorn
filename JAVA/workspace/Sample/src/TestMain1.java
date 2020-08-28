
public class TestMain1 {
	
	public void a(int ... n) {
		for(int x : n) {
			System.out.println(x);
		}
	}
	public void c(String ...n) {
		for(String x : n) {
			System.out.println(x);
		}
	}
	public static void b() {System.out.println("static 메소드");}
	// static 메서드
	public static void main(String[] args) {
		TestMain1 m = new TestMain1();
		m.a(10);
		m.a(10,20);
		m.a(9,8,7,6,5);
		m.c("홍길동","이순신");
		b(); //static 메소드, 객체 생성 없이 사용
	}// end main
//end class
}
