import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Four {
public static void main(String[] args) {
	String s ="abcabcDac";
	String exp ="[ab]c";
	Pattern p =Pattern.compile(exp);
	Matcher m = p.matcher(s);
	while(m.find()) {
		System.out.println(m.start());
		System.out.println(m.end());
		System.out.println(m.group());
	}
}
}
