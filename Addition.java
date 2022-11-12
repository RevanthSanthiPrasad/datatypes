package dataTypes;

public class Addition {
public static void main (String [] args ) {
	int number1 = 15;
	int number2 = 25;
	int total = number1 + number2;
	System.out.println("Total value = " +total);
	System.out.println("-------------------------------------");
	System.out.println(10+20+"Hi");
	System.out.println("Hi"+10+20);  //after the string it just concatinating
	System.out.println(10+20+"Hi"+10+20); // before the string it just add those values & after the string it just concats
}
}
