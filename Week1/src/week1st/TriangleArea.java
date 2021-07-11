package week1st;

import java.util.Scanner;

public class TriangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter base and height, respectively");
		double base = scan.nextDouble();
		double height = scan.nextDouble();
		double area = (base*height)/2;
		System.out.println("The area of your traingle is "+area);

	}

}
