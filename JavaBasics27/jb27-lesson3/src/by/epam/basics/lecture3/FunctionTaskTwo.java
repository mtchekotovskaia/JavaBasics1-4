package by.epam.basics.lecture3;

import java.util.Scanner;

public class FunctionTaskTwo {
	public static void main(String[] args) {
		double Fx, x, h, a, b;
	    a = readAFromConsole(); 
	    b = readBFromConsole(); 
	    h = readHFromConsole();
	    calcF(a, b, h); 

	}
	  public static double readAFromConsole(){ 
		    Scanner sc = new Scanner(System.in); 
		    double a = 0; 
		     
		    System.out.print("Введите a: "); 
		    while(!sc.hasNextDouble()){ 
		      sc.next(); 
		      System.out.print("Введите a: "); 
		    } 
		    a = sc.nextDouble(); 
		    return a;     
		  } 
	  
	  public static double readBFromConsole(){ 
		    Scanner sc = new Scanner(System.in); 
		    double b = 0; 
		     
		    System.out.print("Введите b: "); 
		    while(!sc.hasNextDouble()){ 
		      sc.next(); 
		      System.out.print("Введите b: "); 
		    } 
		    b = sc.nextDouble(); 
		    return b;     
		  } 	  
	  
	  public static double readHFromConsole(){ 
		    Scanner sc = new Scanner(System.in); 
		    double h = 0; 
		     
		    System.out.print("Введите h: "); 
		    while(!sc.hasNextDouble()){ 
		      sc.next(); 
		      System.out.print("Введите h: "); 
		    } 
		    h = sc.nextDouble(); 
		    return h;     
		  } 	
	  
	  public static void calcF(double a, double b, double h){
		    double Fx = 0, x = 0; 
		    for (x = a;
					x <= b;
					x = x + h) {
				System.out.print("x= " + x + " | ");
				Fx = 2 * Math.tan(x / 2) + 1;
				System.out.println("Fx =" + Fx);
		  } 
	  }
}

