package by.epam.basics.lecture2;

import java.util.Scanner;

public class MinMaxString { 
	  public static void main(String[] args) { //вызов метода main
	    int n = 10; 
	    Scanner sc = new Scanner(System.in); //создание объекта sc, относящегося к классу Scanner, 
	    // который использует объект System.in для получения ввода значений с консоли
	    String max = "", min = "", str = ""; //объявление строковых перемееных max, min, str с пустыми значениями (NULL)
	    for (int i = 0; i < n; i++) { //инициализация цикла, цикл повторяется для значений i от 0 
	    	//до тех пор, пока i < 10, после каждого цикла i увеличивается на 1
	      System.out.print("> "); // выведение в консоль текста "> "
	      if (sc.hasNextLine()) { //проверка, было ли введено какое-либо значение с консоли
	        str = sc.nextLine(); //сканер считывает значение, введенное с клавиатуры 
	        //и присваивает его строковой переменной str
	        if (i == 0) { //если введено переменная i равна 0
	          min = str; //то строковая переменная min ссылается на значение строковой переменной str
	        } 
	        if (str.length() > max.length()) {//если длина строковой переменной str больше длины 
	        	// переменной max 
	          max = str; //строковая переменная max ссылается на значение строковой переменной str
	        } else if (str.length() < min.length()) { //если предыдущее условие не выполняется, 
	        	// то задаётся новое условие, если длина переменной str меньше длины переменной min
	          min = str; // то строковая переменная min ссылается на значение строковой переменной str
	        } 
	      } 
	    } 
	    System.out.println("max string = " + max + " length=" + max.length()); 
	    // выведение в консоль текста "max string = " + значение max + " length=" + длина строки max
	    System.out.println("min string = " + min + " length=" + min.length()); 
	    // выведение в консоль текста ""min string = " + значение min + " length=" + длина строки min
	  } 
	} 