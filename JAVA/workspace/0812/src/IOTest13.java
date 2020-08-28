import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOTest13 {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Test\\IOTest5.java");
			//파일읽기: fileReader , FileInputStream
		BufferedReader buffer = null;
		try {
			FileReader reader = new FileReader(f);
			buffer = new BufferedReader(reader);
			String data = buffer.readLine();
			while(data != null) {
				System.out.println(data);
				data = buffer.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				buffer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
