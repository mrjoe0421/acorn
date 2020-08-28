
public class ArrayTest01 {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		int sum = 0;
		for (int i =0; i< arr.length;i++) {
			sum += arr[i];
		}
		Print_Arr test = new Print_Arr();
		sum=test.printArr(arr);
		System.out.println("총합="+sum);
		System.out.println("평균="+test.getAvg());
		System.out.println("avg="+sum/arr.length);

	}

}
