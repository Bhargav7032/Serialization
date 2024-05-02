package customserialization1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Instaserializtion {
public static void main(String[] args) {
	Instagram insta=new Instagram("BhargavBhagi","bhargav2020");
	
	FileOutputStream fis=null;
	ObjectOutputStream oos=null;
	
	
	try {
		fis=new FileOutputStream("instgram.ser");
		oos=new ObjectOutputStream(fis);
		oos.writeObject(insta);
		System.out.println("sucessfully......");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		
		try {
			oos.close();
			fis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
}
