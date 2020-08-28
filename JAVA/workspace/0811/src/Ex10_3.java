
public class Ex10_3 {

class Pet{}
class Cat extends Pet{}
class Dog extends Pet{}

class Box2<T extends Pet>{
	T obj;
	public void setValue(T obj) {
		this.obj = obj;
	}
	public T getValue() {
		return obj;
	}
}
	public static void main(String[] args) {
		
		Box2<Pet> b = new Box2<Pet>();
		Box2<Cat> b2 = new Box2<Cat>();
		Box2<Dog> b3 = new Box2<>();
		
		Box2<Object> b21 = new Box2<>();
		
	}

}
