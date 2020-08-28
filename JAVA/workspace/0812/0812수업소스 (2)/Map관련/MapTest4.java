import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest4 {

	public static void main(String[] args) {
		
		HashMap<String,String> map = new HashMap<>();
		map.put("one","홍길동");
		map.put("two","이순신");
		map.put("three","유관순");


		System.out.println(map.get("one")); //null
		System.out.println(map.get("two"));
		System.out.println(map.get("three"));

		//메서드
		System.out.println("크기:" +map.size());
		System.out.println("키 포함 여부:"
		    +map.containsKey("one"));
		System.out.println("값 포함 여부:"
		    +map.containsValue("유관순"));
		
		map.replace("three", "강감찬");
		map.remove("two");
		map.clear();
		System.out.println(map); //toString()
		
		//key값만 얻기
		Set<String> keys = map.keySet();
		System.out.println(keys);
		for (String key : keys) {
			System.out.println(key+"\t"+map.get(key));
		}
		Iterator<String> ite = keys.iterator();
		while(ite.hasNext()) {
			String key=ite.next();
			System.out.println(key+"\t"+map.get(key));
		}
		
	}//end main

}
