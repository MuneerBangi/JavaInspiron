package week1st;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first");
		float firstNumber = scan.nextFloat();
		
		System.out.println("Enter second");
		float secondNumber = scan.nextFloat();
		
		System.out.println("==BEFORE SWAP VALUES==");
		System.out.println("First num = " +firstNumber);
		System.out.println("second num = " +secondNumber);
		
		float temp = firstNumber;
		firstNumber = secondNumber;
		secondNumber = temp;
		
		System.out.println("==after SWAP VALUES==");
		System.out.println("First num = " +firstNumber);
		System.out.println("second num = " +secondNumber);
	}

}
