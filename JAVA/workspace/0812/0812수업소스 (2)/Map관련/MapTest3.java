import java.util.Hashtable;

public class MapTest3 {

	public static void main(String[] args) {
		
		Hashtable<String,String> map = new Hashtable<>();
		map.put("one","홍길동");
		map.put("two","이순신");
		map.put("three","유관순");
		map.put("one","강감찬");
		//map.put("one",null);
		//map.put(null,null);

		System.out.println(map.get("one")); //null
		System.out.println(map.get("two"));
		System.out.println(map.get("three"));
		System.out.println(map.get("four")); // null
		
	}

}
