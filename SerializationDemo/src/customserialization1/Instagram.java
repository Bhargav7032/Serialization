package customserialization1;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class Instagram  implements Externalizable{
	
	private String Username;
	private String Password;
	
	
	
	public Instagram(String username, String password) {
		Username = username;
		Password = password;
		
	}
	public Instagram() {
	
	}
	
	
	@Override
	public String toString() {
		return "Instagram [Username=" + Username + ", Password=" + Password + "]";
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(Username);
		Encoder encoder=Base64.getEncoder();
		String str=encoder.encodeToString(Password.getBytes());
		out.writeObject(str);
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		this.Username=(String) in.readObject();
		Decoder decoder=Base64.getDecoder();
		String decoderstr=(String) in.readObject();
		String decoderpwd =  new String(decoder.decode(decoderstr));
		this.Password=decoderpwd;
		
		
		
	}
	
	
	
	

}
