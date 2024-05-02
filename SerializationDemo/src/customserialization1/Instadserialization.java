package customserialization1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class Instadserialization {

	public static void main(String[] args) {
		Instagram instagram =null;
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		
		try {
			fis=new FileInputStream("instgram.ser");
			ois=new ObjectInputStream(fis);
			instagram=(Instagram) ois.readObject();
			System.out.println(instagram);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				ois.close();
				fis.close();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
