package Logical;

import java.util.Scanner;

public class Sample {
public static void main(String[] args) {
	System.out.println("Enter number to check: ");
	Scanner s=new Scanner(System.in);
	
	int num=s.nextInt();
	if(num>0)
		System.out.println("Positive");
	else if(num<0)
		System.out.println("Negative");
	else
		System.out.println("Zero");
}
}
