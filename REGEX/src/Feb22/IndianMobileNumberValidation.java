package Feb22;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IndianMobileNumberValidation {
public static void main(String[] args) {
	String s ="7848999723";
	String exp ="[9876][0-9]{9}";
	Pattern p= Pattern.compile(exp);
	Matcher m = p.matcher(s);
	if(m.matches()) {
		System.out.println("Valid Mobile Number");
	}else {
		System.out.println("Invalid Mobile Number");
	}
}
}
