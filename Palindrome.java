package task05.GuviTask5;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		String reverseStr= "";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string value");
		String str =sc.nextLine();	    
	    int strLength = str.length();

	    for (int i = (strLength - 1); i >=0; --i) 
	    {
	      reverseStr = reverseStr + str.charAt(i);
	    }

	    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
	      System.out.println(str + " is a Palindrome String.");
	    }
	    else {
	      System.out.println(str + " is not a Palindrome String.");
	    }
sc.close();
	}

}
