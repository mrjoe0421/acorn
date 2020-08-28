import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class IOTest18_Serial_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectInputStream ois = null;
		try {
			File f = new File("c:\\Test", "serial.dat");
			FileInputStream fis = new FileInputStream(f);
			ois = new ObjectInputStream(fis);
			Person p = (Person)ois.readObject();
			System.out.println(p.getName()+"\t" + p.getAge());
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
