package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializationwrite {
	public static void main(String[] args) {
	
		Product product=new Product(1002, "Sony tv", 200000,"Qtest success");
		
		FileOutputStream fos= null;
		ObjectOutputStream oos=null;
	   
		try {
			fos=new FileOutputStream("Product.ser");
			oos=new ObjectOutputStream(fos);
			oos.writeObject(product);
			System.out.println("successfully.........");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fos.close();
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}
	 
	}

