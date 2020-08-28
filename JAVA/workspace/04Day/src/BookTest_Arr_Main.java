
public class BookTest_Arr_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.배열선언
		Book[] bookList = new Book[3];
		
		//2. 배열에 담을 Book 객체 생성, 객체 별 값설정
		Book book1 = new Book(); //객체 생성, 초기값없음
		book1.title = "홍길동전";
		book1.price = 1000; //book1 객체 값 저장
		
		Book book2 = new Book(); //객체 생성, 초기값없음
		book2.title = "삼국지";
		book2.price = 2000; //book2 객체 값 저장
		
		Book book3 = new Book(); //객체 생성, 초기값없음
		book3.title = "해리포터";
		book3.price = 3000; //book3 객체 값 저장
		
		//3. 배열(방)에 객체(물건) 담기
		bookList[0] = book1;
		bookList[1] = book2;
		bookList[2] = book3;
		
		//4. 사용 전 배열 갯수 확인
		System.out.println(bookList.length);
		{
			
		}
	}

}
