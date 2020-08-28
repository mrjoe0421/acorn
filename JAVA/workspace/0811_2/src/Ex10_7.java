import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Ex10_7 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("이순신");
		list.add("유관순");
		list.add("홍길동");
		list.add("세종"); //append
		
		System.out.println("0 위치값: " + list.get(0));
		System.out.println("toString() 전체 출력 :" + list);
		
		for(String data : list) {
			System.out.println("foreach 전체 출력 :" +data);
		}
		
		Iterator<String> ite = list.iterator();
		while(ite.hasNext()) {
			String data = ite.next();
			System.out.println("Iterator:+data");
		}
		
		System.out.println("Set의 데이터 개수" + list.size());
		System.out.println("Set이 비어있나? " + list.isEmpty());
		System.out.println("Set에 이순신 포함 여부" + list.contains("이순신"));
		System.out.println("특정값 위치" + list.indexOf("홍길동"));
		
		System.out.println(list);
		List<String> sub = list.subList(0, 3);
		System.out.println("sub>>"+sub);
		for(String x: list) {
			System.out.println(x);
		}
		
		Object[] arr = list.toArray();
		System.out.println("배열로 변환후 출력: " + Arrays.toString(arr));
		
		System.out.println("전체 삭제 실행");
		list.clear();
		System.out.println("toString() 전체출력:" + list );
	}

}
