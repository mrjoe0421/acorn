

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOTest4 {

	public static void main(String[] args) {
		System.out.println("데이터 입력 :");
		InputStream is = System.in; //노드계열 - 파일, 콘솔 등에 붙어서 직접 입출력
		InputStreamReader reader = null; //byte
		BufferedReader buffer = null; //char
		try {
			//필터사용1: byte -> char로 변경 - 직접 in.out 안되지만 데이터 변형, 라이변 읽기/쓰기
			reader = new InputStreamReader(is);
			//필터사용2: 한 줄(line) 읽기
			buffer = new BufferedReader(reader);
			String mesg = buffer.readLine();
			System.out.println(mesg); //표준출력
			//PrintStream xxx = System.out;
			//xxx.println("asdfs")
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				buffer.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
