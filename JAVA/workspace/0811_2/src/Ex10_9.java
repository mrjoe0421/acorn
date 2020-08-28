import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class Ex10_9 {

class Person{
	String name;
	int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return name+ " " + age;
	}
}
class PersonComp implements Comparator<Person>{
	public int compare(Person o1, Person o2) {
		
		int result =1;
		if(o1.age >= o2.age) result = -1;
		return result;
		
		/*int result = -1;
		 * if(o1.age >= o2.age) result = 1;
		return result;
		 */
		
	}
}


	public static void main(String[] args) {
		
		List<Person> list = new ArrayList<Person>();
		list.add(new Person("홍길동", 20));
		list.add(new Person("이순신", 44));
		list.add(new Person("유관순", 19));
		list.add(new Person("강감찬", 66));
		
		Collections.sort(list, new PersonComp());
		for(Person person : list) {
			System.out.println(person);
		}

	}

}
