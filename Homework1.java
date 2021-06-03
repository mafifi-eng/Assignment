package test;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char in = scan.next().charAt(0);
		question5(in);

		
	}

	public static void questionOne(int isbn, String name, String author, double price,
			int noOfCopies ) {
		System.out.println("ISBN: " + isbn + ", name: " + name + ", author: " + author
				+ ", price: " + price + ", No of copies: " + noOfCopies);
		
		
	}
	
	public static void question2(int a, int b) {
		System.out.println("The remainder of the two numbers is: " + a%b);
		System.out.println("The Quotient of the two numbers is: " + a/b);
	}
	
	public static void question5 (char input) {
		
		if (input == 'o' || input == 'a' || input == 'i' || input == 'u')
			System.out.println("Vowel!");
		else
			System.out.println("consonant");
	}
	
	public static void question6(char input) {
		switch(input) {
		case 'a':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("It's a vowel!");
			break;
		default:
			System.out.println("It's a consonent!");
		}
	}
	
	public static void question7(int year) {
		if (year % 4 == 0)
			System.out.println("This is leap year!");
	}
	
	public static void question8(int num) {
		if (num >= 0)
			System.out.println("Positive number");
		else
			System.out.println("Negative number");
	}
	
	public static void question9(int a, int b) {
		for (int i = b; i < a; i++) {
			if (i%i == 0 || i%1 == 0)
				System.out.println(i + " is a prime number!");
		}
	}
	
	public static void question10() {
		
	}
}
