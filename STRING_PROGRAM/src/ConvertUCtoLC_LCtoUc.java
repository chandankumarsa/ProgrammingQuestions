public class ConvertUCtoLC_LCtoUc {
public static void main(String[] args) {
	String s ="JavaDeveloper";
	char[]ch=s.toCharArray();
	for(int i=0;i<ch.length;i++) {
		if(ch[i]>='A'&&ch[i]<='Z')
			ch[i]=(char)(ch[i]+32);
		else if(ch[i]>='a'&&ch[i]<='z')
			ch[i]=(char)(ch[i]-32);
	}
	System.out.println(s);
	System.out.println(ch);
}
}
