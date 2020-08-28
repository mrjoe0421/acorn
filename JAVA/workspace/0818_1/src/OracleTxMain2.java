import java.sql.SQLException;
import java.util.ArrayList;

import com.dto.Dept;
import com.exception.RecordNotFoundException;
import com.service.OracleTxService;

public class OracleTxMain2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		OracleTxService service = new OracleTxService();
		//insert
		//service.insert(new Dept(99,"개발", "제주"));
		service.insertDelete(new Dept(75,"개발","제주"), 99);
		
//		try {
//			ArrayList<Dept> list = service.select();
//			for(Dept dept : list) {
//				System.out.println(dept);
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//		
		
		//delete
		//service.delete(88);
		
		
	}
}
