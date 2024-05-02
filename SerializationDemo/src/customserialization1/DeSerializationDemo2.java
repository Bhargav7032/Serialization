package customserialization1;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationDemo2 {

	public static void main(String[] args) {

        Account account = null;

		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream("account.ser");
			ois = new ObjectInputStream(fis);
			account = (Account) ois.readObject();
			System.out.println(account);
			System.out.println("Success... ");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
