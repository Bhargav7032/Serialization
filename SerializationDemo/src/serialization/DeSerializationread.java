package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationread {
public static void main(String[] args) {
	Product product=null;
	
	FileInputStream fis=null;
	ObjectInputStream ois=null;
	 
	try {
		fis=new FileInputStream("product.ser");
		ois=new ObjectInputStream(fis);
		product=(Product) ois.readObject();
		System.out.println("done"); 
		System.out.println(product);
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
			fis.close();
			ois.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
}
