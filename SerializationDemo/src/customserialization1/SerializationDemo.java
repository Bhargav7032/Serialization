package customserialization1;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {

	    Account account =  new Account("Bhargav", "bhargav2311");

		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream("account.ser");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(account);
			System.out.println("Success... ");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
