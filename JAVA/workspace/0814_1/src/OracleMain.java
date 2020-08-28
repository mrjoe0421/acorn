import java.util.ArrayList;

import com.dto.Dept;

import service.OracleService;

public class OracleMain {

	public static void main(String[] args) {

		OracleService service = new OracleService();
		try {
			ArrayList<Dept>list =  service.select(); 
			for(Dept d:list) {
				System.out.println(d);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		 //전체데이터 출력
		
	}

}
