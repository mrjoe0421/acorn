import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		
		Map map = new HashMap(); // 다형성
		map.put("one", "홍길동");
		map.put("two", new Date());
		map.put(1, "강감찬");
		map.put( 3.14, 10);
		
		System.out.println(map.get("one"));
		System.out.println(map.get("two"));
		System.out.println(map.get(1));
		System.out.println(map.get(3.14));

	}

}
