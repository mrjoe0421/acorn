import java.math.BigDecimal;
import java.security.Provider.Service;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.dto.Dept;
import com.exception.RecordNotFoundException;
import com.service.OracleMyBatisService;

public class OralceMyBatisMain {

	public static void main(String[] args) {
		OracleMyBatisService service= new OracleMyBatisService();
		
		
//		Dept dept = new Dept();
//		dept.setDname("영업");
//		dept.setLoc("제주");
//		List<Dept> list = service.selectByDeptNameAndLoc(Dept);
//		for(Dept dept2 : list) {
//			System.out.println(dept2);
//		}
//		service.insert(new Dept(99, "개발","강남"));
//		service.update(new Dept(91,"영업", "서울"));
//		Dept dept= service.selectByDeptno(99);
		//service.delete(99);
		
//		System.out.println(dept);
//		List<Dept> list= service.selectAll();
//		for (Dept dept : list) {
//			System.out.println(dept);
//		System.out.println(service.deptRecordCount());
//		}
//		HashMap<String, Integer> map = new HashMap<>();
//		map.put("key1", 10);
//		map.put("key2", 20);
//		List<Dept> list = service.selectByHashMap(map);
//		for (Dept dept : list) {
//			System.out.println(dept);
//		}
//		HashMap<String, Integer> map = new HashMap<>();
//		map.put("A", 11);
//		map.put("B", 12);
//		map.put("C", 40);
//		List<Dept>list = service.selectBydeptNoIn(map);
//		for(Dept dept :list) {
//			System.out.println(dept);
//		}
//		HashMap map = service.selectByDeptnoHashMap(10);
//		Set<String> keys = map.keySet();
//		System.out.println(keys);
//		System.out.println(map.get("DNAME"));
		List<Map<String, Object>> list = service.selectAllHash();
		System.out.println(list.size()); //전체 레코드 갯수
		for(Map<String, Object> m : list) {
			String no = (BigDecimal)m.get("DEPTNO")+""; //key값 대문자 주의
			int intno = ((BigDecimal)m.get("DEPTNO")).intValue(); //int로 형변환
			String dname = (String)m.get("DNAME");
			String loc = (String)m.get("LOC");
			System.out.println(no+"\t"+dname+"\t"+loc);
		}
		
	}
}


