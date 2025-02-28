import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Three {
public static void main(String[] args) {
	String s ="abcABcD123";
	String exp="[0-9]";
	Pattern p = Pattern.compile(exp);
	Matcher m = p.matcher(exp);
	int sum =0;
	while(m.find()) {
		sum+=Integer.parseInt(m.group());
	}
	System.out.println(sum);
}
}
