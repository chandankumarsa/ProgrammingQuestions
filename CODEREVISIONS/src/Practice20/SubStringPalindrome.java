package Practice20;

public class SubStringPalindrome {
	public static void main(String[] args) {
		String s = "malayalam";
		for(int i =0;i<s.length();i++) {
			for(int j =i+1;j<s.length();j++) {
				String substring =s.substring(i,j+1);
				if(isPalindrome(substring)) {
					System.out.println(substring);
				}
			}
		}
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
