import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class GenericTest1 {

	class Box<T>{
		T obj;
		public T setValue(T obj) {
			this.obj = obj;
		}
		public T getValue() {
			return obj;
		}
	}
	public static void main(String[] args) {
		ArrayList<E>
		
		Box<String> b = new Box<String>();
		b.setValue("Hello");
		String x = (String)b.getValue();
		b.setValue(new Date());
		System.out.println(x);
		
		Box<Date> b2 = new Box<>();
		b2.setValue(new Date());
		Date d = b2.getValue();
		System.out.println(d);
		
		
		Box<Integer> b3 = new Box<>();
		b3.setValue(100);
		int xxx = b3.getValue();
		System.out.println(xxx);
	}

}
