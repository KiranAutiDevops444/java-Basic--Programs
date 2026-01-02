package com.bridepath.area;

import java.util.Scanner;

public class triuser {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		double height;
		System.out.println("Enter the Hieght of the Triangle:");
		height=sc.nextDouble();
		
		double base;
		System.out.println("Enter the base of the Triangle:");
		base=sc.nextDouble();
		
		double Area=0.5*base*height;
		System.out.println("Area of the Triangle is:"+Area);
		
	}

}
