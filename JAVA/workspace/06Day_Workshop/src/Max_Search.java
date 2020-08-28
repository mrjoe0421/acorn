
public class Max_Search {
	public int max_search(int []score) {
		int max=0;
		for(int i=0;i<score.length;i++) {
			if(max< score[i]) {
				max = score[i];

			}
		}
			
	}
}
