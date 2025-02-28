import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class One {
public static void main(String[] args) {
	String s ="abababced";
	String exp ="a";
	Pattern p = Pattern.compile(exp);
	Matcher m = p.matcher(s);
	System.out.println(m.find());
	System.out.println(m.find());
	System.out.println(m.find());
	System.out.println(m.find());
	System.out.println(m.find());
}
}
