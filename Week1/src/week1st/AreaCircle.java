package week1st;

import java.util.Scanner;

public class AreaCircle {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter radius");
		double radius = scan.nextDouble();
		double area = Math.PI*radius*radius;
		System.out.println("The area of your circle is "+area);
	}

}
