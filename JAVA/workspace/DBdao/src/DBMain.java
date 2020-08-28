import java.security.Provider.Service;

import com.dao.MariaDAO;
import com.dao.MySQLDAO;
import com.dao.OracleDAO;
import com.service.DBService;

public class DBMain {

	public static void main(String[] args) {
	//	DBService service = new DBService();
		DBService service = DBService.getService(); //4. 생성 객체를 받아와서 사용 
		service.setDAO(new OracleDAO());
		service.insert();
		service.setDAO(new MySQLDAO());
		service.insert();
		service.setDAO(new MariaDAO());
		service.insert();

	}

}
