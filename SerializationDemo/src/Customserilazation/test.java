package Customserilazation;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;


public class test {
	
	public static void main(String[] args) {
		
//		Encoder encoder= Base64.getEncoder();
//		String pwd="Bhargav2000";
//		
//		
//		String str=encoder.encodeToString(pwd.getBytes());
//	    System.out.println(str);
//		
//	    
//	    Decoder decoder=Base64.getDecoder();
//	    
//	 String decoderstr = new String(decoder.decode(str));
//	 System.out.println(decoderstr);
		
		
		
		Encoder encoder =Base64.getEncoder();
		String pwd="bhargav2000";
		
		String encoderstr=encoder.encodeToString(pwd.getBytes());
		System.out.println(encoderstr);
		
		
		
		Decoder decoder =Base64.getDecoder();
		
		String decoderstr=new String(decoder.decode(encoderstr));
		System.out.println(decoderstr);
		
		
		
		
		
		
		
		
		
		
	}

}
