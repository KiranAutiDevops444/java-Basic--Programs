package com.bridepath.area;

import java.util.Scanner;

public class squser {
	public static void main(String[] args) {
		double side;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the side of the Square:");
		side=sc.nextDouble();
		
		double Area=side*side;
		System.out.println("Area of the Square is:"+Area);
		
	}

}
