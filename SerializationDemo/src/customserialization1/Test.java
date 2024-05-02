package customserialization1;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class Test {
	
	public static void main(String[] args) {
//		Encoder encoder = Base64.getEncoder();  
//		String pwd = "bhargav2311";
//		
//		String str = encoder.encodeToString(pwd.getBytes());
//		System.out.println(str);
//		
//		Decoder decoder = Base64.getDecoder();
//		
//		String decodeStr =  new String(decoder.decode(str));
//		System.out.println(decodeStr);
		
		
		
		Encoder encoder=Base64.getEncoder();
		String pwd="bhargav2311";
		
		String str=encoder.encodeToString(pwd.getBytes());
		System.out.println(str);
		
		Decoder decoder =Base64.getDecoder();
		String decodersrt=new String(decoder.decode(str));
		System.out.println(decodersrt);
	}

}