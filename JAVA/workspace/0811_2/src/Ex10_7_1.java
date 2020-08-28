import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex10_7_1 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("이순신");
		list.add("유관순");
		
		List<String> list2 = Arrays.asList("홍길동", "이순신", "세종", "세종");
		System.out.println(list);
		System.out.println(list2);
		
	}

}
