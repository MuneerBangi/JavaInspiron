package week1st;

import java.util.Scanner;

public class SquareArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter side");
		double side = scan.nextDouble();
		
		double area = side*side;
		System.out.println("The area of your square is "+area);

	}

}
