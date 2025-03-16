package StringProgram;

public class Panagram {
public static void main(String[] args) {
	System.out.println(isPanagram("abcdefghijklmnopqrstuvwxyz"));
}
static boolean isPanagram(String s) {
	if(s.length()<26)return false;
	for(char ch='a';ch<='z';ch++) {
		if(!s.contains(ch+""))return false;
	}
	return true;
}
}
