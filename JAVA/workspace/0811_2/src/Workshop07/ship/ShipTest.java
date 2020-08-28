package Workshop07.ship;

import java.util.ArrayList;

public class ShipTest {

	public static void main(String[] args) {
		Boat boat = new Boat("Boat01", 500);
		Cruise cruise = new Cruise("Cruise01", 500);
		ArrayList<Ship> list = new ArrayList<Ship> ();
		
		list.add(boat);
		list.add(cruise);
		
		for(Ship p : list) {
		//	System.out.println(p);
			if(p instanceof Boat) {
				Boat b = (Boat) p;
				b.sail(10);
				System.out.println(b);
			}else if(p instanceof Cruise) {
				Cruise c = (Cruise) p; //ship를 크루즈로 형변환
				c.sail(10);
				System.out.println(c);
			}
			
		}
		
		for(Ship p: list) {
			System.out.println(p);
			if(p instanceof Boat) {
				Boat b = (Boat) p;
				b.refuel(20);
				System.out.println(b);
			}else if(p instanceof Cruise) {
				Cruise c = (Cruise) p;
				c.refuel(30);
				System.out.println(c);
			}
			
		}
//		for(int i =0; i<list.size(); i++) {
//			if(p)
//		}
		
		

		
		//ArrayList에 두 선박 Add
		//for두 선박의 이름과 현재 연료량 출력
		//두 선박의 이름과 현재  연료량 출력
		//두 선박에 sail함수 호출 .sail(10)
		//두 선박의 이름과 현재 연료량 출력하여 서로 연료량이 달라졌는지 확인
		// for 이용 두 선박을 검사하여 boat면 .refuel(20), curse면 refuel(30)설정
		// 두 선박의 연료량 출력

	}

}
