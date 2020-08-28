import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IOTest15 {

	public static void main(String[] args) {
		
		File f = new File("c:\\Test", "xyz.xtx");
		Scanner scan = null;
		try {
			scan = new Scanner(f);
			while(scan.hasNext()) {
				System.out.println(scan.nextLine());
			}
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			if(scan !=null)scan.close();
		}

	}

}
