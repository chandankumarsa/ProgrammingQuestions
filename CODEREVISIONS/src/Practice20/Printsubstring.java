package Practice20;

public class Printsubstring {
public static void main(String[] args) {
	String s ="malayalam";
	for(int i =0;i<s.length();i++) {
		for(int j =i+1;j<s.length();j++) {
			String substr =s.substring(i,j);
			System.out.println(substr);
		}
	}
}
}
