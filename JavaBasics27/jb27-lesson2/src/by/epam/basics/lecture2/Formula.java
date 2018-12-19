package by.epam.basics.lecture2;

import java.util.Scanner;

public class Formula { 
	  public static void main(String[] args) { 
	 
	    double a = 0, b = 0, c = 0, d;
	    int a2 = 3, b2 = 2;
	    Scanner sc = new Scanner(System.in); 
	 
	    System.out.print("Введите a: "); 
	    if (sc.hasNextDouble()) { 
	      a = sc.nextDouble(); 
	    } 
	 
	    System.out.print("Введите b: "); 
	    if (sc.hasNextDouble()) { 
	      b = sc.nextDouble(); 
	    } 
	 
	    System.out.print("Введите c:"); 
	    if (sc.hasNextDouble()) { 
	      c = sc.nextDouble(); 
	    } 
	    
	    if (a != 0) { 
	    	d = (b + (Math.sqrt(Math.pow(b, b2) + 4 * a * c))) / (2 * a) - Math.pow(a, a2) * c + b; 
	    } else { 
	      System.out.println("Знаменатель равен нулю."); 
	      d = Double.NaN; 
	    } 
	 
	    System.out.println("d=" + d); 
	  } 
	} 