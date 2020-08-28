
public class Print_Arr {
		private double avg;
		int sum;
		int lenght;

		public int printArr(int[] arr) {
			
			for (int i = 0; i < arr.length; i++) {
				sum += arr[i];
			}
			lenght=arr.length;
			return sum;
		}
		public double getAvg() {
			return sum/lenght;
		}
}
