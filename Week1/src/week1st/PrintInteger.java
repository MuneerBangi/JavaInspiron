package week1st;

import java.util.Scanner;

public class PrintInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: "); 
	
		// nextInt() reads the next integer from the keyboard
		int number = scan.nextInt();
		System.out.println("You entered: " + number);
	}

}
