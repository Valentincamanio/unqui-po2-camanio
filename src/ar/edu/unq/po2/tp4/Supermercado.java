package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	
	private String nombre;
	private String direccion;
	List<Producto> catalogo= new ArrayList <Producto>();
	List<Trabajador> trabajadores= new ArrayList <Trabajador>();
	
	public Supermercado(String dir,String nombreLocal) {
		direccion=dir;
		nombre=nombreLocal;
	}
	
	public void addProducto(Producto x) {
		catalogo.add(x);
	}
	
	public float getIngresosTotalesDeTrabajadores() {
		float valorT = 0;
		for (Trabajador trab:trabajadores) {
			valorT+=trab.getTotalPercibido();
		}
		return valorT;
	}
	
	public int getCantTotalProductos() {
		return catalogo.size();
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}
	
	public int getPrecioTotalProductosCatalogo() {
		int valorT = 0;
		for (Producto prod:catalogo) {
			valorT+=prod.getPrecio();
		}
		return valorT;
	}
	
	public void aplicarDescuentoAProdCuidadosDe(double x) {
		for (Producto prod:catalogo) {
			if(prod.esCuidado) {
				prod.aplicarDescuentoDe(x);
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
}
