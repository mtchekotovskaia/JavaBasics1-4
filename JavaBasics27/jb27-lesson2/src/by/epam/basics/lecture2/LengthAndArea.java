package by.epam.basics.lecture2;

import java.util.Scanner;

public class LengthAndArea {
	  public static void main(String[] args) { 
		    double R, CircleLength, CircleArea; 
		    Scanner input = new Scanner(System.in); 
		    System.out.println("Введите радиус: "); 
		    while(!input.hasNextDouble())    { 
		    	input.next(); 
		    } 
		    R = input.nextDouble(); 
		    CircleLength = 2 * Math.PI * R; 
		    CircleArea = Math.PI * R * R; 
		    System.out.println("Длина окружности = " + CircleLength + "; площадь круга = " +  CircleArea); 
		  } 
}
