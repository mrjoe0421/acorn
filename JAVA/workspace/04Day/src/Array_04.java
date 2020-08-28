
public class Array_04 {

	public static void main(String[] args) {
		
		// kor 평균, eng 평균
		
		/*int [] kor = new int[3];
		
		kor[0] = 100;
		kor[1] = 80;
		kor[2] = 80;*/
		
		int [] kor = {100,80,80}; 
				
		int [] eng = new int[3];
		eng[0] = 90;
		eng[1] = 75;
		eng[2] = 60;
		
		
		int kor_sum =0;
		int eng_sum =0;
				
				for(int i=0; i<kor.length;i++) {
					kor_sum+= kor[i];
					eng_sum+= eng[i];
				}
				System.out.println((kor_sum/kor.length)+ "\t" + (eng_sum/eng.length));
				eng_sum=0; kor_sum=0;
				for(int x: eng) {
					eng_sum+=x;
				}
				for(int x: kor) {
					kor_sum+=x; 
				} System.out.println((kor_sum/kor.length)+ "\t" + (eng_sum/eng.length));
	}
}
