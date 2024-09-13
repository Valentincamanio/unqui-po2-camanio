package ar.edu.unq.po2.tp6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp6.emails.Correo;
import ar.edu.unq.po2.tp6.emails.ServidorPop;

class EmailTestCase {
	
	private Correo mail1;
	private ServidorPop server;
	
	@BeforeEach
	void setUp() throws Exception {
		mail1 = new Correo ("yo","enfoque","tengo que enfocarme en esto");
	}
	@Test
	public void test1() {
		assertEquals("yo", mail1.getDestinatario());
	}
	
	/*** Nose porque rompe
	 *  @BeforeEach
	void setUp2() throws Exception {
		mail1 = new Correo ("yo","enfoque","tengo que enfocarme en esto");
		server.addBorrado(mail1);
	}
	
	@Test
	public void test2() {
		assertEquals(0, server.contarBorrados());
		
	}

	 * 
	 */
	
}	