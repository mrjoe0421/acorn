import java.util.ArrayList;
import java.util.HashMap;

import com.dto.Dept;

import service.OracleService;

public class OracleMain {

	public static void main(String[] args) {

		OracleService service = new OracleService();
		
		
		service.insert(new Dept(93,"제조","경기"));
		try {
			ArrayList<Dept> list = service.select();
			for(Dept d : list) {
				System.out.println(d);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		try {
			service.update(new Dept(89,"영업","서울"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		 //전체데이터 출력
		HashMap<String,String> map =new HashMap <>();
		map.put("name", "영업");
		map.put("loc", "제주");
		try {
			ArrayList<Dept> list=service.selectByNameLoc(map);
			for(Dept dept : list) {
				System.out.println(dept);
			}
		} catch (Exception e) {
		e.printStackTrace();
		}
		
		
	}

}
