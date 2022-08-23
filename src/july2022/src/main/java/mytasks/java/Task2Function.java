package mytasks.java;

public class Task2Function {

	public double add(double number1 , double number2) {
		return(number1 + number2) ; 
	
	}
	
	public double subtract(double number1 , double number2) {
		return (number1 - number2) ; 
	
	}
	
	public double multiply(double number1 , double number2) {
		return (number1 * number2) ; 
	
	}
	
//	public double divide(int first , int second) {
//		return (double)first / second ; 
//	
//	}
	
	public double divide(double number1, double number2){
		if (number2 == 0) {
			System.out.println("error can not dividing with zero amount");
		return 0 ;
		}
		else {
			return number1 / number2 ;
		}	
		
	}
	
}
