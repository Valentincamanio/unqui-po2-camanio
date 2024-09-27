package ar.edu.unq.po2.tp6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp6.bancoyprestamos.Banco;
import ar.edu.unq.po2.tp6.bancoyprestamos.Cliente;
import ar.edu.unq.po2.tp6.bancoyprestamos.PropiedadInmobiliaria;
import ar.edu.unq.po2.tp6.bancoyprestamos.SolicitudCreditoPersonal;

class BancoTestCase {
	
	private Cliente manu;
	private SolicitudCreditoPersonal creditoDiez;
	private PropiedadInmobiliaria propiedad1;
	private Banco banco;
	
	@BeforeEach
	void setUp() throws Exception {
		banco= new Banco ();
		manu= new Cliente ("Manuel","TT",21,6000,banco);
		creditoDiez=new SolicitudCreditoPersonal (manu,400,12);
		propiedad1=new PropiedadInmobiliaria ("La casa esta amueblada","Juanb",100000);
	}

	@Test
	public void testClientes() {
		assertEquals(6000, manu.getSueldoMensual());
		assertEquals(72000, manu.getIngresoAnual());
	}
	
	@Test
	public void testCreditos() {
		assertTrue(creditoDiez.esAceptable());
	}

	@Test
	public void testPropiedades() {
		assertEquals(100000, propiedad1.getValor());
	}
	
	@Test
	public void testBanco() {
		assertEquals(1, banco.getCantClientes());
	}
}

