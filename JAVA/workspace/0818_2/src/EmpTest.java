


import java.util.ArrayList;

import com.biz.EmpBiz;
import com.entity.EmpDTO;


public class EmpTest {

	
	public static void main(String[] args) {
		
		EmpBiz empBiz = new EmpBiz();
		
		ArrayList<EmpDTO> list = empBiz.selectAllEmp();
		for(EmpDTO dto:list) {
			System.out.println(dto);
		}
	}//end main
}//end class
