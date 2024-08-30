package ar.edu.unq.po2.tp3;

import java.sql.Date;

public class EmpleadoTemporal extends Empleado {
	
	private String fechaFin;
	private int cantHorasExtras;

	public EmpleadoTemporal(String nombre, int sueldoBasico, String direccion,Date fechaDeNacimiento, String fechaFin, int cantHorasExtras) {
		super(nombre, sueldoBasico, direccion,fechaDeNacimiento);
		this.fechaFin = fechaFin;
		this.cantHorasExtras = cantHorasExtras;
	}
	
	public int sueldoBruto() {
		return this.getSueldoBasico() + this.getCobroHorasExtras();  
	}
	
	public int getRetenciones() {
		return this.getDescuentoPorObraSocial() + this.getDescuentoPorAporteJubilatorio() ;
	}
	
	public int getDescuentoPorObraSocial() {
		return (this.getSueldoBruto()/10) + 25 ;// se le suman si tiene mas de 50 años 
	}
	
	public int getCobroHorasExtras() {
		return 40 * this.getCantHorasExtras();
	}

	public int getDescuentoPorAporteJubilatorio() {
		return (this.getSueldoBruto() / 10) + (5 * this.getCantHorasExtras());
	}
	
	public String getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}

	public int getCantHorasExtras() {
		return cantHorasExtras;
	}

	public void setCantHorasExtras(int cantHorasExtras) {
		this.cantHorasExtras = cantHorasExtras;
	}
	
	
}
