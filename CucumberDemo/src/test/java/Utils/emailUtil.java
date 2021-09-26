package Utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class emailUtil {

	public static String getNewEmail() {
		
		Date date = new Date();
		DateFormat format = new SimpleDateFormat("HHmm");
		System.out.println(format.format(date).toString());
		String newEmail= "myNewEmail".concat(format.format(date).toString()).concat("@gmail.com");  
		return newEmail;
	}
	
	
}
