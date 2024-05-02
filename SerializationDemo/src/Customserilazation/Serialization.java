package Customserilazation;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class Serialization {

	public static void main(String[] args) {
	 Facebook facebook=new Facebook("BhargavBhagi","Bhargav2000");
	 
	 FileOutputStream fis=null;
	 ObjectOutputStream ops=null;
	 
	 try {
		fis=new FileOutputStream("fb.ser");
		ops=new ObjectOutputStream(fis);
		ops.writeObject(facebook);
		System.out.println("Success...");
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}finally {
		try {
			fis.close();
			ops.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	 
	}
}
