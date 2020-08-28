package workshop06.calc;

public class CalcTest {
	public static void main(String[] args) {
		int data1 = Integer.parseInt(args[0]);
		String arg = args[1];
		char operator = arg.charAt(0);
		int data2 = Integer.parseInt(args[2]);
		Calculator calc = new Calculator();
		try {
			if (operator == '+') {
				System.out.println(calc.plus(data1, data2));

			} else if (operator == '-') {
				System.out.println(calc.minus(data1, data2));

			} else if (operator == 'x') {
				System.out.println(calc.multiplication(data1, data2));

			} else if (operator == '/') {
				System.out.println(calc.devide(data1, data2));

			}
		} catch (ArithmeticException e) {
			System.out.println("Exception 이 발생 하였습니다. 다시 입력해 주세요");
		}
	}

}
