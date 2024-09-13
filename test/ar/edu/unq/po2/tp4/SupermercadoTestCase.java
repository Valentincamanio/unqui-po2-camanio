package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SupermercadoTestCase {
	
	private Supermercado chino;
	private Producto sal;
	private Producto agua;

	@BeforeEach
	void setUp() throws Exception {
		chino=new Supermercado ("Juanbbb","ChinoLand");
		sal=new Producto (20,"Sal",true);
		agua=new Producto (10,"Agua",true);
		chino.addProducto(sal);
		chino.addProducto(agua);
		chino.aplicarDescuentoAProdCuidadosDe(0.5);
	}

	@Test
	public void test1() {
		assertEquals(10, sal.precio);
	}
	
	@Test
	public void test2() {
		assertEquals(2, chino.getCantTotalProductos());
	}

	@Test
	public void test3() {
		assertEquals(15, chino.getPrecioTotalProductosCatalogo());
	}

}
