package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrabajadorTestCase {
	
	private IngresoHorasExtras ing1; 
	private Trabajador juan;

	@BeforeEach
	void setUp() throws Exception {		
		ing1.setCantHorasExtras(10);
		ing1.setConcepto("fff");
		ing1.setMesDePercepcion(null);
		ing1.setMontoPercibido(20);
		juan.addIngreso(ing1);
	}
	/***
	 * @Test
	void test() {
		assertEquals(20, juan.getTotalPercibido());
	}
	
	 */
	
	@Test
	public void test2() {
		assertEquals(0, juan.getImpuestoAPagar());
	}

}
