
class Group<T>{
	T obj;
	public void setValue(T obj) {
		this.obj = obj;
	}
	public T getValue() {
		return obj;
	}
}
class Person{}
class Man extends Person1{}
class Woman extends Person1{}
public class Ex10_5 {
	
	public static void method(Group<?> group) {}
	public static void method2 (Group<? extends Person1> group) {}
	public static void method3 (Group<? super Person1> group) {}

	public static void main(String[] args) {
		
		//method : 어떤 타입도 설정 가능
		method(new Group<Object>());
		method(new Group<Person1>());
		method(new Group<Man>());
		method(new Group<Woman>());
		
		//method2 : Person 또는 Person의 자식만 가능
//		method2(new Group<Object>());
		method2(new Group<Person1>());
		method2(new Group<Man>());
		method2(new Group<Woman>());
		
		//method3 : Person 또는 Person의 부모만 가능
		method3(new Group<Object>());
		method3(new Group<Person1>());
//		method3(new Group<Man>());
//		method3(new Group<Woman>());
	}

}
