package by.epam.basics.lecture4;

public class Sequence {
	public static void main(String[] args) { 
		int m = 1;
		int[]masA = new int[12];
		printA(masA);
		calcA(masA, m);
	}
	  public static void printA(int[] masA){
		for(int i = 0; i < masA.length; i++ ){
			masA[i] = (int)(Math.random()*100);
			System.out.print(masA[i]+ " ");
			}
			System.out.println("\n");
	  }
	  public static void calcA(int[] masA, int m){
			for(int i = 0, j = 1; i<masA.length-1; i++, j++){if(masA[i]>masA[j]){ m++; }
			}
			if(m==masA.length){ System.out.println("Последовательность возрастающая"); }
			if(m<((masA.length)-1)){ System.out.println("Последовательность не возрастающая"); }
		}
	}
