package by.epam.basics.lecture4;

import java.util.Random;

public class Sequence {
	public static void main(String[] args) { 
		int m = 1;
		int[]masA = new int[12];
		enterArrayWithRandom(masA);
		printArray(masA);
		calcA(masA, m);
	}
	  public static void enterArrayWithRandom(int[] masA) { 
		    Random rand = new Random(); 
		    for (int i = 0; i < masA.length; i++) { 
		      masA[i] = rand.nextInt(200); 
		    } 
		    
	  }
	  public static void printArray(int[] masA){ 
		  System.out.println(); 
		    for (int i=0; i<masA.length; i++){ 
		      System.out.println (">arr[" + i + "]=" + masA[i]); 
		  } 
	} 

	  public static void calcA(int[] masA, int m){
			for(int i = 0, j = 1; i<masA.length-1; i++, j++){if(masA[i]>masA[j]){ m++; }
			}
			if(m==masA.length){ System.out.println("Последовательность возрастающая"); }
			if(m<((masA.length)-1)){ System.out.println("Последовательность не возрастающая"); }
		}
	}
