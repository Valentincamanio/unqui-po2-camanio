package ar.edu.unq.po2.tp6.bancoyprestamos;

public class PropiedadInmobiliaria {
	
	String descripcion;
	String direccion;
	int valorFiscal;
	
	public PropiedadInmobiliaria(String descripcion, String direccion, int valorFiscal) {
		this.descripcion = descripcion;
		this.direccion = direccion;
		this.valorFiscal = valorFiscal;
	}

	public int getValor() {
		return valorFiscal;
	}
	
}
