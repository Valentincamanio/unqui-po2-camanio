package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;


public class Mercado implements IProducto,ICliente{

	List<Producto> prodCooperativas= new ArrayList <Producto>();
	List<Producto> prodEmpTradicionales= new ArrayList <Producto>();
	
	// Solo inicializa el mercado
	public Mercado() {
	}
	
	@Override
	public double precioProducto() {
		return 0;
		
	}

	@Override
	public float montoAPagar() {
		return 0;
	}
	
}
