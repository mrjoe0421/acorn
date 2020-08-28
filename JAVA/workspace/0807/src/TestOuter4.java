
public class TestOuter4 {

	public static void main(String[] args) {
		
		//익명클래스(anonymous class) ==>인터페이스 사용시 많이 사용.
		
		//1. 일반적인 방법==> 이름있는 클래스로 처리
//		Flyer b = new Bird();
//		b.takeOff(100);
		
		//2. 익명클래스 ==> SuperMan 기능을하는 클래스
//		인터페이스명 변수명  = new 인터페이스명() {
//			//메서드 오버라이딩
//			
//		};
		Flyer b2 = new Flyer(){ //구현부 직접 작성
			@Override
			public void takeOff() {
				System.out.println("SuperMan.takeOff" );
			}
		};
		b2.takeOff();
		
		
		Flyer b3 = new Flyer() {
			@Override
			public void takeOff() {
				System.out.println("Airplane.takeOff" );
			}
		};
		b3.takeOff();
	}//end main

}
