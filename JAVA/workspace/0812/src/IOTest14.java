import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class IOTest14 {

	public static void main(String[] args) {
		
		File f = new File("C:\\Test\\xyz.txt"); //Test폴더에 파일생성
		//데이터 쓰기 : FileWriter, FileOutputStream
		PrintWriter out = null;
		try {
			FileWriter writer = new FileWriter(f,true);//append true는 기존의 파일에 들어있는 내용에 붙여쓰게 해준다
			//필터
			out = new PrintWriter(writer);
			out.print("happy"); //파일에 내용입력
			//out.flush();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			out.close();
		}

	}

}
