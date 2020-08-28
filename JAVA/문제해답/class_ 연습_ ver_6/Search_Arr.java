
public class Search_Arr {
	public String arr_Search(int[] arr, int search) {
		String mesg="검색값이 없습니다.";
		for (int i = 0; i < arr.length; i++) {
			if(search== arr[i]) {
				mesg=search+"는   "+ i+"번째 방에 있습니다.";
			}
		}
		return mesg;
	}
}
