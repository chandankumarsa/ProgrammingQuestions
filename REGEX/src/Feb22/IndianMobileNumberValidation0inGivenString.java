package Feb22;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IndianMobileNumberValidation0inGivenString {
public static void main(String[] args) {
	String s ="abahbvdvsvjc7848999723djhcvsy684894841321654dsjchbhjd8956566655";
	String exp ="[9876][0-9]{9}";
	Pattern p =Pattern.compile(exp);
	Matcher m = p.matcher(s);
	while(m.find()) {
		System.out.println(m.group());
	}
}
}

//The given Expression matches Indian Mobile Number