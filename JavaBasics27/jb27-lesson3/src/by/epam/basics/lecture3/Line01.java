package by.epam.basics.lecture3;

import java.util.Scanner;

public class Line01 { 
	  public static void main(String[] args) { 
		    int number = 0; 
		    int digit = 0;   
			number = readNumberFromConsole(); 
			calcDigit(number);
	  }
	  public static int readNumberFromConsole(){ 
		    Scanner sc = new Scanner(System.in); 
		    int number = 0; 
		    System.out.print("Введите число: "); 
		    while(!sc.hasNextInt()){ 
			      sc.next(); 
			      System.out.print("Введите число: "); 
			    } 
		    number = sc.nextInt(); 
			 return number;
		  }
	  public static void calcDigit(int number){
		int digit = 0;
	    while (number != 0) { 
	      digit = number % 10; 
	      number = number / 10; 
	      if (digit % 2 == 0) { 
	        System.out.println("В числе есть четная цифра."); 
	        return; 
	      } 
	    }
	    System.out.println("В числе нет четных цифр."); 
	    } 
}