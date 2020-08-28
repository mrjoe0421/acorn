class ArrayTest01 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int sum = 0;

		PrintArr test= new PrintArr();//기본생성자 호출객체 생성
		sum=test.print(arr);  //함수 호출, 합 계산 반환 
		Arr_Avg avgTest= new Arr_Avg();
		double avg= avgTest.calc_Avg(sum, arr.length);
		System.out.println("총합=" + sum);
		System.out.println("평균="+ avg);
//		System.out.println("avg=" + sum / arr.length);
	}
}
