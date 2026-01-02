package com.bridepath.area;

import java.util.Scanner;

public class rectuser {
	public static void main(String[] args) {
		double length;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Length of the Rectangle:");
		length=sc.nextDouble();
		
		double breadth;
		System.out.println("Enter the breadth if the Rectangle:");
		breadth=sc.nextDouble();
		
		double Area=length*breadth;
		System.out.println("Area of the Reactangle:"+Area);
	
		
	}

}
