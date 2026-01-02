package com.bridepath.area;

import java.util.Scanner;

public class ciruser {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		double radius;
		System.out.println("Enter the Radius of the Circle:");
		radius=sc.nextDouble();
		
		double Area=3.14*radius*radius;
		System.out.println("Area of the Circle is:"+Area);
	}

}
