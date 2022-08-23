package mytasks.java;

import java.util.Scanner;

public class Task2Calculator {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("input number 1 = ");
		double number1 = 0;
		try {
			number1 = reader.nextDouble();
		} catch(Exception e) {
		    System.out.println("input number 1 was not number");
		}
		
		System.out.println("input number 2 = ");
		double number2 = 0;
		try {
			number2 = reader.nextDouble();
		} catch(Exception e) {
		    System.out.println("input number 2 was not number");
		}
		
		Task2Function function = new Task2Function();

		double total_add = function.add(number1, number2);
		System.out.println("number 1 + number 2 = " + total_add);

		double total_substract = function.subtract(number1, number2);
		System.out.println("number 1 - number 2 = " + total_substract);
			
		double total_multiply = function.multiply(number1, number2);
		System.out.println("number 1 * number 2 = " + total_multiply);
		
		double total_divide = function.divide(number1, number2);
		System.out.println("number 1 : number 2 = " + total_divide);
	}

}