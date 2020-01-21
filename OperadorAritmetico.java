package JUnitLab;

public class OperadorAritmetico {
	
	public static int suma(int a, int b) {
		 return a + b;
	}
	
	public static int division(int a, int b) {
		if (b == 0) {
		    throw new ArithmeticException("/ by zero");
		}
 		return a / b;
	}
}
