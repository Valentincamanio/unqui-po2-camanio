package ar.edu.unq.po2.tp3;

import java.sql.Date;

public abstract class EmpleadoTemporal extends Empleado {
	
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
		int descTotal = this.getSueldoBruto() /10;
		if (this.edad() > 50) {
			descTotal += 25;
		}
		return descTotal ;
	}
	
	public int getCobroHorasExtras() {
		return 40 * cantHorasExtras;
	}

	public int getDescuentoPorAporteJubilatorio() {
		return (this.getSueldoBruto() / 10) + (5 * cantHorasExtras);
	}
	
	public String getFechaFin() {
		return fechaFin;
	}

	public int getCantHorasExtras() {
		return cantHorasExtras;
	}

	
	
}
