package Customserilazation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) {
		Facebook facebook=null;
	FileInputStream fis=null;
	ObjectInputStream ois=null;
	try {
		fis=new FileInputStream("fb.ser");
		ois=new ObjectInputStream(fis);
		facebook=(Facebook) ois.readObject();
		System.out.println(facebook);
		System.out.println("Successfully...");
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
