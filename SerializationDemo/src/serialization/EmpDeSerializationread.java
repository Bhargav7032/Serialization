package serialization;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EmpDeSerializationread {
public static void main(String[] args) {
	Employee employee=null;
	
	FileInputStream fis=null;
	ObjectInputStream ois=null;
	 
	try {
		fis=new FileInputStream("emps.text");
		ois=new ObjectInputStream(fis);
		employee=(Employee) ois.readObject();
		System.out.println(employee);
		System.out.println("done"); 
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