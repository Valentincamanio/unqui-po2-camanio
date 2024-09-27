package ar.edu.unq.po2.tp5;

public class ProductoEmpresaTradicional extends Producto {

	public ProductoEmpresaTradicional(float precio, String nombre) {
		super(precio, nombre);
	}

	@Override
	public double precioProducto() {
		return precio;
	}

}
