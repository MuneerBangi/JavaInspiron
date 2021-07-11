package week1st;

import java.util.Scanner;

public class RectangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length and width, respectively");
		double length = scan.nextDouble();
		double width = scan.nextDouble();
		double area = length*width;
		System.out.println("The area of your rectangle is "+area);

	}

}
