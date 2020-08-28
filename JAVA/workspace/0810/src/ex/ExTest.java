package ex;

public class ExTest {

	public int a (int num1, int num2) throws ArithmeticException {
		//throw 연습
		int result = 0;
		if(num2 == 0) {
			throw new ArithmeticException("0으로 나눌 수 없습니다. 다시 입력해 주세요");
		}else {
			result =0;
			result = num1 / num2;
		}
		
		return result;
//		2. throws 연습
//	public int a (int num1, int num2) throws ArithmeticException {
//		int result = 0;
//		result = num1 / num2;
//		return result;
//		1. try catch 연습
//		int result = 0;
//		try {
//			result = num1/ num2;
//		}catch(ArithmeticException e) {
//			System.out.println(e.getMessage());
//		}
//		
//		return result;
	}
}
