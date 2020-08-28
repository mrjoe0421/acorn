import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class ex1 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("n1", 1);
		map.put("n2", 2);
		map.put("n3", 3);
		map.put("n4", 4);
		map.put("n5", 5);
		map.put("n6", 6);
		map.put("n7", 7);
		map.put("n8", 8);
		map.put("n9", 9);
		map.put("n10", 10);
		int sum =0;
		Set<String> keys = map.keySet();
		for(String key : keys) {
			Integer n = map.get(key);
			sum+= n;}
			System.out.println(sum);
		
		Iterator<String> ite = keys.iterator();
		sum=0;
		while(ite.hasNext()) {
			String key =ite.next();
			sum+=map.get(key);
		}
			System.out.println("====="+sum);
		}
		}

	


