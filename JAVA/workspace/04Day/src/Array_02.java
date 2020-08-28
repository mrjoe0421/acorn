
public class Array_02 {

	public static void main(String[] args) {
		int [] num;//int로 된 num인 배열
		num = new int[5]; //배열이 3개인 int
		
		num[0] =10;
		num[1] =20;
		num[2] =30;
		num[3] =100;
		num[4] =80;
		
		int sum =0;
		System.out.println("배열의 길이" + num.length);
		for(int i=0; i<num.length;i++) {
			//System.out.println(">>" + num[i]);
			sum = sum+ num[i]; //sum+=num[i];
		}
		System.out.println("총합="+sum);
		System.out.println("평균="+sum/num.length);
		
		//foreach 문
		int sum_2=0;
		for(int x : num) {
			System.out.println(x);
			sum_2 = sum_2+x; //240
		}
		System.out.println("for_each 총합===" + sum_2);
	}

}
