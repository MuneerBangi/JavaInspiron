package week1st;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter an integer less than 10");
		int num=scan.nextInt();
		
		while(num<10) {
			sum+=num;
			num++;
		}
		System.out.println("Sum of the numbers from the loop is "+sum);

	}

}
