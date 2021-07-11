package week1st;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a number");
		int number = scan.nextInt(); //User input is stored in number
		
		if(number % 2==0)
			System.out.println("The number is even");
		else
			System.out.println("The number is odd");

	}

}
