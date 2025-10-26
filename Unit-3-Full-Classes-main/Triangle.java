//(c) A+ Computer Science
//www.apluscompsci.com
//Name - paschal
//Date - 9/17/2025

import java.util.Scanner; 
import java.lang.Math.*; 

public class Triangle
{
	private int sideA, sideB, sideC;
	private double perimeter;

	public Triangle(int a, int b, int c) //constructor
	{
		sideA = a;
		sideB = b;
		sideC = c;
	}

	public void calcPerimeter() //mutator method
	{
		perimeter = sideA + sideB + sideC;
	}

	public double getArea( ) //accessor method
	{
		double s = perimeter / 2;
		return Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));
	}
}