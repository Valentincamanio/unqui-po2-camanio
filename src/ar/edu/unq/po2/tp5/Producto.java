package ar.edu.unq.po2.tp5;

public abstract class Producto implements IProducto{
	
	protected float precio;
	String nombre;	
	
	public Producto(float precio, String nombre) {
		this.precio = precio;
		this.nombre = nombre;
	}

	@Override
	public abstract double precioProducto();

	
}
