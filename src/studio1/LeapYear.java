package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a year:");
		int year =in.nextInt();
		int remainder0 = year%4;
		int remainder1 = year%100;
		int remainder2 = year%400;
		boolean isLeapYear =  remainder0 == 0 && remainder1 != 0 || remainder2 == 0;
		System.out.println(year + " is a leap year: " + isLeapYear);
	}

}
