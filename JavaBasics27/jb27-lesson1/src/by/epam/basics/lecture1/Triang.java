package by.epam.basics.lecture1;

public class Triang {
	  public static void main(String[] args) { 
		    double a, b; // два катета 
		    double c = 0; // гипотенуза 
		    double s; // площадь 
		    a = 10; 
		    b = 20; 
		 
		    c = Math.sqrt(a * a + b * b); 
		    s = 0.5 * a * b; 
		 
		    System.out.println("���������� = " + c + " ������� = " + s); 
		  } 
}
