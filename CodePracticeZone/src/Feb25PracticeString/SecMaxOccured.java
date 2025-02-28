package Feb25PracticeString;

import java.util.Scanner;

public class SecMaxOccured {
public static void main(String[] args) {
	System.out.println("ENter a String");
	Scanner sc = new Scanner(System.in);
    String s = sc.next();     
    char maxChar = '\0', secondMaxChar = '\0';
    int maxCount = 0, secondMaxCount = 0;
    for(int i =0;i<s.length();i++) {
    	int count =0;
    	char ch =s.charAt(i);
    	for(int j =0;j<s.length();j++) {
    		if(s.charAt(j)==ch)count++;
    	}
    	if(count>maxCount) {
    		secondMaxCount=maxCount;
    		secondMaxChar=maxChar;
    		maxCount=count;
    		maxChar=ch;
    	}else if(count>secondMaxCount && ch!=maxChar) {
    		secondMaxCount=count;
    		secondMaxChar=ch;
    	}
    	
    }
    
    System.out.println(secondMaxChar+ " :"+secondMaxCount);
}
}
