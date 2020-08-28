
public class Student {
	
	
	//인스턴스변수, 멤버변수 class 범위(메소드 밖에서 선언)
	//-메서드 밖에서 static(x)
	//new 사용시 변수 생성
	//-생성시점?
	//객체 생성~객체소멸(참조변수가 못가리킬때)
	// -자동으로 초기화(각 타입별 default 값)

	private String name; //변수
	private int age;
	private String address;
	//기본(default) 생성자 묵시적 삽입
	public Student () {//접근제한자, !리턴타입 없음!, 클래스이름()
		System.out.println("Student 생성자 호출");
		name="홍길동";
		age =10;
		address="강남구";
	}
	
	
	
	public String stuInfo() {
		return name+"/"+age+"/"+address;
	}//멤버변수 한꺼번에 문자열로 변환 리턴

	public void setName(String name) {
		this.name = name;
	}//멤버변수 name 값 설정함수
	public String getName() {
		return name;
	}//멤버변수  name값을 필요한 곳으로 보내주는 함수
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	
	}


