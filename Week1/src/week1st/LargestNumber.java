package week1st;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first Number");
		int firstNumber = scan.nextInt();
		
		System.out.println("Enter second Number");
		int secondNumber = scan.nextInt();
		
		System.out.println("Enter third Number");
		int thirdNumber = scan.nextInt();
		
		if(firstNumber>=secondNumber && firstNumber>=thirdNumber)
			System.out.println(firstNumber+" is the Largest");
		
		else if(secondNumber>=firstNumber && secondNumber>=thirdNumber)
			System.out.println(secondNumber+" is the Largest");
		
		else
			System.out.println(thirdNumber+" is the Largest");

	}

}
