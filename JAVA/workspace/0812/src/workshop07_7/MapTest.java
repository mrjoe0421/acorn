package workshop07_7;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		
		double sum = 0.0;
		
		Mobile m1 = new Mobile("LU6800", "Optimus 2X", 800000);
		Mobile m2 = new Mobile("SU6600", "Optimus Black", 900000);
		Mobile m3 = new Mobile("KU5700", "Optimus Big", 700000);
		Mobile m4 = new Mobile("SU7600", "Optimus Mach", 950000);
		
		Map<String, Mobile> map = new HashMap<String, Mobile>(); //map 객체 생성
		map.put(m1.getCode(), m1);
		map.put(m2.getCode(), m2);
		map.put(m3.getCode(), m3);
		map.put(m4.getCode(), m4);
		
		
		//Mobile 정보를 출력하고 합계를 계산
		Set<String> keys = map.keySet(); //keySet()메서드를 사용해 모든 key값을  Set타입(중복키값 제거)으로 리턴
		for(String key : keys) {
			Mobile b= map.get(key);
			b.printInfo();
			sum += b.getPrice();
			System.out.println();
		}
		
		System.out.println(sum);
		
		System.out.println();
		sum=0;
		//총액 10%증가 : price + (price*0.1)
		System.out.println("가격 변경 후");
		for(String key : keys) {
			Mobile b= map.get(key);
			b.setPrice(b.getPrice()*110/100);
			b.printInfo();
			sum += b.getPrice();
			System.out.println();
		}
		System.out.println();
		System.out.println(sum);
		// 변경된 정보를 출력하고 합계를 계산
		

	}

}
