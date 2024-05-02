package Customserilazation;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class Facebook implements Externalizable{
	
	private String uname;
	private String pwd;
	
	public Facebook(String uname, String pwd) {
		super();
		this.uname = uname;
		this.pwd = pwd;
	}
	public Facebook() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Facebook [uname=" + uname + ", pwd=" + pwd + "]";
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(uname);
		Encoder encoder= Base64.getEncoder();
		String encodedStr=encoder.encodeToString(pwd.getBytes());
	    out.writeObject(encodedStr);
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
	 this.uname=(String) in.readObject();
	 String encoderpwd=(String) in.readObject();
	 Decoder decoder=Base64.getDecoder();
	 String decoderpwd = new String(decoder.decode(encoderpwd));
	 this.pwd=decoderpwd;
	}
	
	

}
