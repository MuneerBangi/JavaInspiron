package week1st;

import java.util.Scanner;

public class CheckedPrime {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		boolean isPrime=true;
		int num = scan.nextInt();
		scan.close();
		
		for(int i=2;i<=num/2;i++) 
		{
			if(num%i==0)
			{
				isPrime=false;
				break;
			}
		}
		if(isPrime)
			System.out.println(+num+" is Prime");
		else
			System.out.println(num+" is not Prime");
	}
}
