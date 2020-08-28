

import java.util.HashSet;

public class OracleDAO {
	//select 호출시 데이터 저장된 set 변환
	public HashSet<Person1> select() {
		HashSet<Person1> set = new HashSet<Person1>();
		set.add(new Person1("홍길동", 20, "서울"));
		set.add(new Person1("이순신", 44, "전주"));
		set.add(new Person1("유관순", 19, "서울"));
		
		return set;
	}

}
