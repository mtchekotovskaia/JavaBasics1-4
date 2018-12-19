package by.epam.basics.lecture3;

import java.util.Scanner;

public class FunctionTaskThree {
	  public static void main(String[] args) {
		    double x=0;
		    double Fx=0;
		    x = readXFromConsole(); 
		    Fx = calcF(x); 
		    printResult(x, Fx); 
	  }
	  
	  public static double readXFromConsole(){ 
		    Scanner sc = new Scanner(System.in); 
		    double x = 0; 
		     
		    System.out.print("Введите x: "); 
		    while(!sc.hasNextDouble()){ 
		      sc.next(); 
		      System.out.print("Введите x: "); 
		    } 
		    x = sc.nextDouble(); 
		    return x;     
		  } 
	  
	  public static double calcF(double x){
		    double Fx = 0;
		    if (x <= -3) {
		      Fx = 9;
		    }
		    if (x > 3) {
		      Fx = 1/(x * x + 1);
		    }
		   return Fx; 
		  } 
		    public static void printResult(double x, double Fx){ 
		        System.out.println("F(" + x + ")=" + Fx + ";");     
		      } 
		    } 