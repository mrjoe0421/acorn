import java.util.List;
import java.util.Map;

import com.dto.Product;
import com.service.OracleMyBatisService;

public class OracleMyBatisMain {

	public static void main(String[] args) {

		OracleMyBatisService service = new OracleMyBatisService();
		List<Product> list = service.selectpd(Product);
		for(Product pd : list) {
			System.out.println(pd);
		}
		
	}

}
