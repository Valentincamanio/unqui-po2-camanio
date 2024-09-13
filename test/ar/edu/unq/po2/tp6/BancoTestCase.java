package ar.edu.unq.po2.tp6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp6.bancoyprestamos.Cliente;
import ar.edu.unq.po2.tp6.bancoyprestamos.PropiedadInmobiliaria;
import ar.edu.unq.po2.tp6.bancoyprestamos.SolicitudCreditoPersonal;

class BancoTestCase {
	
	private Cliente manu;
	private SolicitudCreditoPersonal creditoDiez;
	private PropiedadInmobiliaria propiedad1;
	
	@BeforeEach
	void setUp() throws Exception {
		manu= new Cliente ("Manuel","TT",21,6000);
		creditoDiez=new SolicitudCreditoPersonal (manu,400,12);
		propiedad1=new PropiedadInmobiliaria ("La casa esta amueblada","Juanb",100000);
	}

	@Test
	public void test1() {
		assertEquals(6000, manu.getSueldoMensual());
		assertEquals(72000, manu.getIngresoAnual());
	}
	
	@Test
	public void test2() {
		assertTrue(creditoDiez.esAceptable());
	}

	@Test
	public void test3() {
		assertEquals(100000, propiedad1.getValor());
	}
}

