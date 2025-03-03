package Sorting;

import java.util.Scanner;

public class NumberToString {
	public static void main(String[] args) {
		System.out.println("Enter a NUmber");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		pw(n/10000000,"Crore ");
		pw((n/100000 )%100,"Lakhs");
		pw((n/1000 )%100,"Thousand ");
		pw((n/100 )%10,"Hundred ");
		pw((n%100 ),"");
	}

	public static void pw(int num, String s) {
		String[] one = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
				"tweleve", "thirteen", "fourteen", "fiveteen", "sixteen", "seventeen", "eighteen", "nineteen",
				"twenty" };
		String[] two = { "", "", "Twenty", "Thirty", "Fourty", "Fivety", "sixty", "Seventy", "Eighty", "Ninety" };
		if (num <= 19)
			System.out.print(one[num]);
		else
			System.out.print(two[num / 10] + " " + one[num % 10]);
		if (num != 0)
			System.out.print(s);
	}
}
