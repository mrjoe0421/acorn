
public class Stu_Test {
	String name; //멤버변수 객체생성, 자동초기화, 객체정보 저장
	int age;
	public void printInfo() {//멤버메소드, 객체생성, 호출사용, 동작관련
		int num = 1;//로컬변수
		num = num+10;
		System.out.println("printInfo() num====="+ num);
		System.out.println(name+":" + age);
}
		
	public static void main(String[] args) {
		Stu_Test st_1= new Stu_Test(); //객체생성
		st_1.name = "홍길동";
		st_1.age = 26;
		st_1.printInfo();
		
		Stu_Test st_2= new Stu_Test(); //객체생성
		st_2.name = "소쿠리";
		st_2.age = 21;
		st_2.printInfo();
		
		//1. 산술연산자 : +, -, *, /, %
		int n =10;
		int n2 = 3;
		System.out.println("n+n2="+(n+n2));
		System.out.println("n-n2="+(n-n2));
		System.out.println("n*n2="+(n*n2));
		System.out.println("n/n2="+(n/n2));  //3
		System.out.println("n/3.0="+(n/3.0)); //3.3333
		System.out.println("n%n2="+(n%n2)); //나머지 값
		
		System.out.println(10 + 5);
		System.out.println(5-2);
		System.out.println(4*3);
		System.out.println(14 / 3);
		System.out.println(14 / 3.0);
		System.out.println(3.2 /2);
		System.out.println(5 % 3);
	}

}
