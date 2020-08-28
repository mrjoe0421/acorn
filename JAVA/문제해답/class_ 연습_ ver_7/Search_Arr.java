
public class Search_Arr {
	private int[] arr;
	private int search;
	public Search_Arr() {}//기본생성자 주의!!꼭 넣을 것
	public Search_Arr(int[] arr, int search) {
		this.arr= arr;
		this.search= search;
	}//생성자를 통한 멤버 변수 초기화
	public String arr_Search() {
		String mesg="검색값이 없습니다.";
		for (int i = 0; i < arr.length; i++) {
			if(search== arr[i]) {
				mesg=search+"는   "+ i+"번째 방에 있습니다.";
			}
		}
		return mesg;
	}
	
	
	
	
	
//	public String arr_Search(int[] arr, int search) {
//		String mesg="검색값이 없습니다.";
//		for (int i = 0; i < arr.length; i++) {
//			if(search== arr[i]) {
//				mesg=search+"는   "+ i+"번째 방에 있습니다.";
//			}
//		}
//		return mesg;
//	}
}
