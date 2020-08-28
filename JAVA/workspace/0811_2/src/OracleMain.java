

import java.util.HashSet;

public class OracleMain {

	public static void main(String[] args) {
		//DAO.select가 Person 객체를 담도록 수정해 볼것 이후 Service, main함수 수정
		OracleService service = new OracleService();
		HashSet<Person1> xxx = service.select(); //dao에서 실제 set을 받아옴
		for(Person1 s : xxx) {
			System.out.println(s);
		}

	}

}
