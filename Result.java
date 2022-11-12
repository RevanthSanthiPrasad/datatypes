package dataTypes;

public class Result {
public static void main (String [] args ) {
	int tamil = 81;
	int english = 63;
	int maths = 96;
	int science = 74;
	int social = 70;
	int total = tamil + english + maths + science + social;
	int average = total/5;
	System.out.println("Total = "+total + ", Average = "+average);
}
}
