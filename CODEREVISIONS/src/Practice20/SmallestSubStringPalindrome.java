package Practice20;

public class SmallestSubStringPalindrome {
public static void main(String[] args) {
	String s ="malayalam";
	String smallest =s;
	for(int i =0;i<s.length();i++) {
		for(int j =i+1;j<s.length();j++) {
			String substring =s.substring(i,j+1);
			if(isPalindrome(substring)&& substring.length()<smallest.length()) {
				smallest=substring;
			}
		}
	}
	System.out.println(smallest);
	
}
static boolean isPalindrome(String s) {
	int i = 0;
	int j = s.length() - 1;
	while (i < j) {
		if (s.charAt(i) != s.charAt(j))
			return false;
		i++;
		j--;
	}
	return true;
}
}
