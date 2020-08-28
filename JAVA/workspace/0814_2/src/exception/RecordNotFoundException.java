package exception;

public class RecordNotFoundException extends Exception {
	//Exception 발생시 메세지 받을 수 있도록 작성
	public	RecordNotFoundException(){
		System.out.println("업데이트할 자료가 없습니다.");
	}
}
