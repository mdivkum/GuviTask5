package task05.GuviTask5;

import java.util.Scanner;

public class ReverseStr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		String str=sc.nextLine();
		String reversedStr = "";

		for (int i = 0; i < str.length(); i++) {
		  reversedStr = str.charAt(i) + reversedStr;
		}

		System.out.println("Reversed string: "+ reversedStr);
		sc.close();

	}

}
