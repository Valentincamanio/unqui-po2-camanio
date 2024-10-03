package ar.edu.unq.po2.tpEnumsStreams;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EnumsYStreamsTest {
	
	private LesionDermatologica lesionRojo;
	private LesionDermatologica lesionAmarrilla;
	private LesionDermatologica lesionMiel;
	
	@BeforeEach
	void setUp() throws Exception {
		
		lesionRojo = LesionDermatologica.ROJO;
		lesionAmarrilla = LesionDermatologica.AMARILLO;
		lesionMiel = LesionDermatologica.MIEL;
	}

	@Test
	void testNivelDeLesion() {
		assertEquals( NivelRiesgo.MuyAlto , lesionRojo.nivel );;
	}
	
	@Test
	void testDescripcionDeLesion() {
		assertEquals( "Alamarmante" , lesionAmarrilla.getDescripcion() );;
	}
	
	@Test
	// PROBADO EL CASO BORDE
	void testProximoColorEnMaduracion() {
		assertEquals( LesionDermatologica.ROJO , lesionMiel.getProximoEnMaduracion() );;
	}

}
