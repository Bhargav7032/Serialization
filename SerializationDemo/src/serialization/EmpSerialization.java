package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmpSerialization {
	public static void main(String[] args) {
		
		Employee emp=new Employee("Bhargav",7032000695l,"Srikakulam","Q test","Bhargav group of complany's");
		
		FileOutputStream fis=null;
		ObjectOutputStream ois=null;
		try {
			fis=new FileOutputStream("emps.text");
			ois=new ObjectOutputStream(fis);
			ois.writeObject(emp);
			System.out.println("success....");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
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
