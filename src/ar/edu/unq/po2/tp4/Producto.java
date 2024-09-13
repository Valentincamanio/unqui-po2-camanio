package ar.edu.unq.po2.tp4;

public class Producto {

	public float precio;
	public String nombre;
	public Boolean esCuidado;
	
	public Producto(float precioP,String nombreP,Boolean esCuidadoP) {
		precio=precioP;
		nombre=nombreP;
		esCuidado=esCuidadoP;
	}

	public float getPrecio() {
		return precio;
	}

	public void aplicarDescuentoDe(double x) {
		precio-=(precio*x);
	}
	
}
