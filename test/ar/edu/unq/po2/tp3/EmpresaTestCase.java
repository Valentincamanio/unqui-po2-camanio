package ar.edu.unq.po2.tp3;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpresaTestCase {
	private Empresa Samsung;
	private Empleado valentin;
	
	@BeforeEach
	
	void setUp() throws Exception {
		this.Samsung = new Empresa ("Samsung",222);
		// this.valentin= new Empleado ("Valentin",2951,"midireccion");
		// Empleado empl = new EmpleadoPermanente();
		
		// System.out.print(false);
		System.out.println("Nombre:" + Samsung.getNombre());
		System.out.println("Cuit:" + Samsung.getCuit());
	}
	
	// (String[]args)
	
	
	@Test
	void testConstructor() {
		assertEquals("Samsung", this.Samsung.getNombre());
	}
	
}
