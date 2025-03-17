package Practice17_03_2025;

public class Panagram {
public static void main(String[] args) {
	System.out.println(isPanagram("abcdeegfhijklmnopqrstuvwxyz"));
}
static boolean isPanagram(String s) {
	s=s.toLowerCase();
	if(s.length()<26)return false;
	for(char ch='a';ch<='z';ch++) {
		if(!s.contains(ch+""))return false;
	}
	return true;
}
}
