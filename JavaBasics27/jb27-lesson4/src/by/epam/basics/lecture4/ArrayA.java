package by.epam.basics.lecture4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayA {
	  public static void main(String[] args) { 
	  int K, sum;
	  int[] A = new int[10];
	  enterArrayWithRandom(A);
	  K = readKFromConsole();
	  sum = calcSum(A, K);
	  printResult(sum);
	  }
	  
	  public static void enterArrayWithRandom(int[] A) { 
		    Random rand = new Random(); 
		    for (int i = 0; i < A.length; i++) { 
		      A[i] = rand.nextInt(400); 
		    } 
		    System.out.println(); 
 		    for (int i=0; i<A.length; i++){ 
		      System.out.println (">arr[" + i + "]=" + A[i]); 
		  } 
	  }
	  public static int readKFromConsole(){ 
		    Scanner sc = new Scanner(System.in); 
		    int K = 0; 
		    System.out.print("Введите число K: "); 
		    while(!sc.hasNextInt()){ 
			      sc.next(); 
			      System.out.print("Введите число K: "); 
			    } 
		    K = sc.nextInt(); 
		    return K;
	 	    } 

	  public static int calcSum(int[] A, int K){
		  int sum = 0;
	 for (int j = 0; j < A.length; j++) { 
  	if (A[j] % K == 0) {
      sum = sum + A[j];
    } 
  	}
	 return sum;
	  }
	  
	  public static void printResult(int sum){ 
		    System.out.println("Сумма элементов, кратных K: " + sum); 
		} 
	} 
	  
