import java.util.List;

import com.dto.Dept;
import com.service.OracleMyBatisService;

public class OracleMyBatisMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OracleMyBatisService service = new OracleMyBatisService();
		List<Dept>list = service.select();
		for(Dept dept : list) {
			System.out.println(dept); //list가 배열형태이기 때문에 foreach문으로 출력한거다
		}
//		System.out.println(service.selectByDeptno()); // == Dept [deptno=10, dname=ACCOUNTING, loc=AAA]
//		System.out.println("사원번호가 10인 사람의 데이터:" + service.selectByDeptno(10));
//		Dept dept = new Dept(16,"운영", "춘천");
//		service.deptInsert(dept);
	}

}
