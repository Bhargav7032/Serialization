package customserialization1;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class Account implements Externalizable{

	private String uname;
	private String pwd;

	public Account(String uname, String pwd) {
		super();
		this.uname = uname;
		this.pwd = pwd;
	}
	
	

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "Account [uname=" + uname + ", pwd=" + pwd + "]";
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(uname);
		Encoder encoder = Base64.getEncoder(); 
		String encodedStr = encoder.encodeToString(pwd.getBytes());
		out.writeObject(encodedStr);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		this.uname = (String) in.readObject();
		String encodedPwd = (String) in.readObject();
		Decoder decoder = Base64.getDecoder();
		String decodePwd =  new String(decoder.decode(encodedPwd));
		this.pwd = decodePwd;
	}

}
