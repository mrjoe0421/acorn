package ex;

import org.omg.CORBA.UserException;

public class Test {

	public static void main(String[] args) {
	 ExTest test= new ExTest();
	try {
		test.a(10, 0);
	}catch(Exception e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
		UserException e1 = (UserException)e;
		e1.print();
	}

	}

}
