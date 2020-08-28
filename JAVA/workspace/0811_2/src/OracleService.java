

import java.util.HashSet;

public class OracleService {

	OracleDAO dao;
	
	public OracleService() {
		dao = new OracleDAO(); //OracleService객체 생성시 OracleDAO를 생성 후
		//멤버변수로 지정
	}
	public HashSet<Person1> select() {
		HashSet<Person1> xxx= dao.select();
		return xxx;
	}
}
