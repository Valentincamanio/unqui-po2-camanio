package ar.edu.unq.po2.tp5;

public class ProductoCooperativas extends Producto {

	public ProductoCooperativas(float precio, String nombre) {
		super(precio, nombre);
	}

	@Override
	public double precioProducto() {
		return (precio*0.10) + precio;
		
	}

}
