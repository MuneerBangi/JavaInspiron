package week1st;

import java.util.Scanner;

public class MultiplyTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int firstNumber=scan.nextInt();
		
		System.out.println("Enter the second number");
		int secondNumber=scan.nextInt();
		
		int product= firstNumber*secondNumber;
		
		System.out.println("The product of the two numbers is "+product);

	}

}
