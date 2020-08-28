
public class Student {	
	
	//인스턴스변수, 멤버변수 class 범위(메소드 밖에서 선언)
	//-메서드 밖에서 static(x)
	//new 사용시 변수 생성
	//-생성시점?
	//객체 생성~객체소멸(참조변수가 못가리킬때)
	// -자동으로 초기화(각 타입별 default 값)
	
	//1. Instance variable 멤버변수
	private String name; //변수     
	private int age;
	private String address;
	private Book writtenBook;
	
	//2. Method 함수
	public void setBook(Book writtenBook) {
		this.writtenBook= writtenBook;
	}
	public Book getBook() {
		return writtenBook;
	}
	
	//생성자 수정 - 생성과 동시에 받아온 값으로 초기화
	//기본(default) 생성자 묵시적 삽입
	//3.constructor 생성자
	public Student() {}//기본생성자를 명시적으로 꼭 기재할 것
	public Student (String name, int age, String address) {//접근제한자, !리턴타입 없음!, 클래스이름()
		System.out.println("Student 생성자 호출");
		this.name = name;
		this.age = age;
		this.address= address;
	}
	public String printInfo() {
	//	return name +":"+ age + ":"+address;
		return getName() +":"+ getAge() + ":"+getAddress();
	}
	
	

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


