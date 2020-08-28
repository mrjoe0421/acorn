
public class ArrayTest08 {

	public static void main(String[] args) {
		int [] score= {99,34,67,22,11,9};
		
		Max_Search sch1 = new Max_Search();
		Min_Search sch2 = new Min_Search();
		
		int max = 0;
		int min = 987654321;
		for(int i=0;i<score.length;i++) {
			if(max< score[i]) { //max의 값이 score 중 i 보다 작으면 max와 score는 같다
				max =  score[i];
			}
			if(min>score[i]) { //min의 값이 score 중 i 보다 크면 max와 score는 같다
				min = score[i];
			}
		}
		
		
		System.out.println("최대값: " + max );
		System.out.println("최소값: " + min);
	}

}
