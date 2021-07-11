package week1st;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a char");
		char ch = scan.next().charAt(0);
		
		if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'||ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U')
			System.out.println(ch+ " is a Vowel");
		else 
			System.out.println(ch+ " is a Consonant");

	}

}
