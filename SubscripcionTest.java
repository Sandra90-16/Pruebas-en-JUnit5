package JUnitLab;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SubscripcionTest {
	
	@Test
		public void testPrecioPorMes() {
		double esperado= 100;
		Subscripcion s = new Subscripcion(200,2) ;
		double resultado = s.precioPorMes();
		assertEquals(esperado, resultado,0) ;
	}
	@Test
		public void testPrecioPorMes2() {
		double esperado= 67;
		Subscripcion s = new Subscripcion(200,3) ;
		double resultado= s.precioPorMes();
		assertEquals(esperado, resultado, 0) ;
	}
	
	@Test
		public void testCancel() {
		Subscripcion s = new Subscripcion(200,3) ;
		s.cancel();
		assertEquals(s.getPeriodo(),0);
	}
}

