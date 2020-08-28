
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

import javax.print.attribute.standard.PrinterState;

public class IOTest5 {

	public static void main(String[] args) {
		
		
		// 파일입력/출력
		// 파일의 메타데이터 살펴보기
		// new File("디렉토리");
		// new File("파일명");
		// new File("디렉토리/파일명");
		// new File("디렉토리","파일명");
		
		//File f = new File("C:\\Users\\acorn\\IOTest.java");
		//File f = new File("c:\\Test","IOTest.java");
	
		
		File f = new File("C:\\");
		
		String [] s = f.list();
		for(String string : s) {
			System.out.println(string);
		}
		
		//새로운 디렉토리
		File f2 =new File("C:\\bbb");
		f2.mkdir();
		f2.delete();
		//f2.delete(); // 파일 및 디렉토리 삭제
		
		
        
	}//end main
}//end class
