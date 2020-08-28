
public class Print_Arr2 {

	private double avg;
	int sum;
	int lenght;
	public int print(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
		sum += arr[i];//총합계산
		}
		lenght= arr.length;
	//	 avg= sum/ arr.length;
		return sum;
	}
	public double getAvg() {		
		return sum/lenght;  //평균 직접 계산 
	}
	
}
