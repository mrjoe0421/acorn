
public class Sample02_variable {

	public static void main(String[] args) {
		// 홍길동 2- 서울 성별(남) 결혼여부(false) 키(185.63)체중(79.25)
		//1. 변수선언( 메모리에 특정크기의 영역생성)
		String name; //변수, name변수, 문자열변수, String타입의 변수
		int age; // 변수, age변수, 정수형변수, int 타입의 변수,
		String address; //참조형변수
		char gender; //변수
		boolean isMarried; //기본형변수
		float height; //기본형변수
		double weight; //기본형변수
		
		//2. 변수초기화( 값을 맨처음 설정하는 작업)
		name = "홍길동";
		age = 20;
		address = "서울";
		gender = '남'; //주의
		isMarried = false;
		height = 185.63F; //주의
		// height = 3.14;
		weight = 78.25;
		
		System.out.println("String name=" + name);
		System.out.println("int age=" + age);
		System.out.println("String address=" + address);
		System.out.println("char gender=" + gender);
		System.out.println(isMarried);
		System.out.println(height);
		System.out.println(weight);
		
	}

}
