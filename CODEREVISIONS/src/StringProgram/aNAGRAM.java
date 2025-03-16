package StringProgram;

public class aNAGRAM {
public static void main(String[] args) {
	System.out.println(isAnagram("aabb", "abbb")); // This will return true, but it's wrong.

}
static boolean isAnagram(String s1,String s2) {
	
	if(s1.length()!=s2.length())return false;
	if(s1.length()==0 && s2.length()==0)return true;
	char ch =s1.charAt(0);
	s1=s1.replace(ch+"","");
	s2=s2.replace(ch+"","");
	return isAnagram(s1, s2);
	
}
}
