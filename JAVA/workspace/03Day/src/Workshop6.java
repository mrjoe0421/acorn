
public class Workshop6 {

	public static void main(String[] args) {
		int i = 5;
		String result = (i %3 == 0) && (i%5 == 0) ? "짝수" : "홀수";
		System.out.println("선언 변수" + i + " 일때 결과:\n" 
				+ "숫자 " + i + " 는"+ result + "입니다");

	}

}
