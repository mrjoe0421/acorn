
public class Ex06_9 {
	
	class Person{
		String name;
		int age;
		public Person(String name, int age) {
			this.name = name;
			this.age = age;
		}
	}
	public static void main(String[] args) {
		Person p = new Person("홍길동", 44);
		Person p2 = new Person("홍길동", 44);
		if(p.equals(p2)) {
			System.out.println("p와 p2가 같다");
		}else {
			System.out.println("p와 p2가 같지 않다");
		}
	}

}
