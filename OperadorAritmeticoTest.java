package JUnitLab;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class OperadorAritmeticoTest {

	@Test
	void testSuma() {
		 int esperado = 8;
		 int a = 5;
		 int b = 3;
		 int suma = OperadorAritmetico.suma(a, b);

		 assertEquals(esperado, suma);
	}

	@Test
	void testSumaNegativo() {
		 int esperado = -8;
		 int a = -5;
		 int b = -3;
		 int suma = OperadorAritmetico.suma(a, b);

		 assertEquals(esperado, suma);
	}
	
	@Test
	void testDivision() throws Exception {
		int esperado = 2;
		int a = 8;
		int b = 4;
		int division;
		 division = OperadorAritmetico.division(a, b);
		 assertEquals(esperado, division);
		
	}
	
	@Test
	void divideByZero() {
		Exception exception = assertThrows(ArithmeticException.class, () -> OperadorAritmetico.division(1, 0));
		assertEquals("/ by zero", exception.getMessage());
	}
	
}
	
