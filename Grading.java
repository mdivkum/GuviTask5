package task05.GuviTask5;

import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the mark");
		int marks=sc.nextInt();
		//int marks=60;
		char grade=calgarde(marks);
		System.out.println("The grade is "+grade);
sc.close();
	}
	
	public static char calgarde(int marks)
	{
		if (marks>=100)
		{
			return'S';
		}else
			
			if(marks>=90) {
			return 'A';
		}
	else if(marks>=80) {
		return 'B';
	}else if(marks>=70) {
		return'C';
	}else if(marks>=60) {
		return'D';
	}else if(marks>=50) {
		return'E';
	}else {
		System.out.println("Invalid mark");
		return 'F';
	}
	
}
	
}
