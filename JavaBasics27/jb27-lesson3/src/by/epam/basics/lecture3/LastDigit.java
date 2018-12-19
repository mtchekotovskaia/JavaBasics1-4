package by.epam.basics.lecture3;

import java.util.Scanner;

public class LastDigit { 
	  public static void main(String[] args) { 
		    int number; 
		    int poslZifra; 
		    int poslZifraKv;   
			number = readNumberFromConsole(); 
			poslZifraKv = calcPoslZifraKv(number);
			printResult(number, poslZifraKv);
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

	  public static int calcPoslZifraKv(int number){
		int poslZifra; 
		int poslZifraKv = 0;   
	    poslZifra = number % 10; 
	    switch (poslZifra) { 
	    case 0: 
	      poslZifraKv = 0; 
	      break; 
	    case 1: 
	      poslZifraKv = 1; 
	      break; 
	    case 2: 
	      poslZifraKv = 4; 
	      break; 
	    case 3: 
	      poslZifraKv = 9; 
	      break; 
	    case 4: 
	      poslZifraKv = 6; 
	      break; 
	    case 5: 
	      poslZifraKv = 5; 
	      break; 
	    case 6: 
	      poslZifraKv = 6; 
	      break; 
	    case 7: 
	      poslZifraKv = 9; 
	      break; 
	    case 8: 
	      poslZifraKv = 4; 
	      break; 
	    case 9: 
	      poslZifraKv = 1; 
	      break; 
	    default: 
	      System.out.println("Что-то не то с программой."); 
	      return poslZifraKv;
	    } 
	    return poslZifraKv;
	  }
	  public static void printResult(int number, int poslZifraKv){ 
	    System.out.println("Квадрат числа " + number + " равняется " + poslZifraKv); 
	} 
} 
