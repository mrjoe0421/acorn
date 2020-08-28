
public class TestStudent {


	public static void main(String[] args) {
		
		TestStudent stu = new TestStudent();
		
		stu.name = "홍길동";
		stu.age = 20;
		
		String n = stu.name;
		int a = stu.age;
		
		System.out.println("이름 : "+ n);
		System.out.println("나이 : "+ a);
		
		
		stu.setName("이순신");
		stu.setAge(30);
		
		System.out.println("이름 : "+ stu.getName());
		System.out.println("나이 : "+ stu.getAge());
	}

}
