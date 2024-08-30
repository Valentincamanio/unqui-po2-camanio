package ar.edu.unq.po2.tp3;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpresaTestCase {
	private Empresa lg;
	private Empleado valentin;
	
	@BeforeEach
	
	void setUp() throws Exception {
		this.lg = new Empresa ("Valentin","ddd");
		// this.valentin= new Empleado ("Valentin",2951,"midireccion");
	}
	
	 
	@Test
	void testConstructor() {
		assertEquals("Valentin", this.lg.getNombre());
	}
	
}
