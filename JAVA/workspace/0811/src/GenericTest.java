import java.sql.Date;



public class GenericTest {

	class Box{
		Object obj;

		public void setValue(Object obj) {
			this.obj = obj;
		}
		public void getValue(Object obj) {
			return obj;
		}
	}
	public static void main(String[] args) {
		
		Box b = new Box();
		b.setValue("Hello");
		String str = (String)b.getValue();
		System.out.println(str);
		
		Box b2 = new Box();
		b2.setValue(new Date());
		Date d = (Date)b2.getValue();
		System.out.println(d);
	}

}
