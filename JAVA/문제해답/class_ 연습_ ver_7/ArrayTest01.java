class ArrayTest01 {
	
	public static void main(String[] args) {
		int[] arr= new Create_Arr().arr_Create();		
		int sum = 0;
		PrintArr test= new PrintArr();//기본생성자 호출객체 생성
		sum=test.print(arr);  //함수 호출, 합 계산 반환 
		Arr_Avg avgTest= new Arr_Avg();
		double avg= avgTest.calc_Avg(sum, arr.length);//평균계산
		System.out.println("총합=" + sum);
		System.out.println("평균="+ avg);
		Search_Arr search= new Search_Arr(arr, 20);
		String mesg = search.arr_Search();
		System.out.println(mesg);
//		String mesg= search.arr_Search(arr, 30);
//		System.out.println("avg=" + sum / arr.length);
	}
}
