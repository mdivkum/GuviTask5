package task05.GuviTask5;

import java.util.Scanner;

public class HotelTariff {

public static void main(String[] args){

Scanner sc= new Scanner(System.in);
System.out.println("Enter the month");
int month=sc.nextInt();
System.out.println("Number of days stayed in the hotel");
int days=sc.nextInt();
float x=1500.50f;
float rent=x*days;
double rent1=(0.2*rent)+rent;
sc.close();

switch(month)
{
case 1: case 2: case 3:
	System.out.println("Total rent "+rent);
	break;
	
case 4: case 5: case 6:
	System.out.println("Total rent "+rent1);
	break;
	
case 7: case 8: case 9:case 10:
	System.out.println("Total rent "+rent);
	break;
	
case 11: case 12:
	System.out.println("Total rent " +rent1);
	break;
	
	default:
		System.out.println("Invalid month");
	}

	}

}
