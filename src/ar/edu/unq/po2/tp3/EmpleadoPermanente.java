package ar.edu.unq.po2.tp3;

import java.sql.Date;

public abstract class EmpleadoPermanente extends Empleado {
	
	private int cantidadDeHijos;
	private int antiguedadEnEmpresa;
	
	public EmpleadoPermanente(String nombre, int sueldoBasico, String direccion,Date fechaDeNacimiento, int antiguedadEnEmpresa, int cantidadDeHijos) {
		super(nombre, sueldoBasico, direccion,fechaDeNacimiento);
		this.cantidadDeHijos=cantidadDeHijos; 
		this.antiguedadEnEmpresa=antiguedadEnEmpresa;
	}
	
	public int sueldoBruto() {
		return this.getSueldoBasico() + this.getSalarioFamiliar();  
	}

	public int getSalarioFamiliar() {
		return ( this.getasignacionPorHijo() * this.getCantidadDeHijos() ) + this.getasignacionPorConyuge();
	}

	public int getRetenciones() {
		return (this.getDescuentoPorObraSocial()) + (this.getDescuentoPorAporteJubilatorio());
	}

	public int getCantidadDeHijos() {
		return cantidadDeHijos;
	}

	public void setCantidadDeHijos(int cantidadDeHijos) {
		this.cantidadDeHijos = cantidadDeHijos;
	}

	public int getAntiguedadEnEmpresa() {
		return antiguedadEnEmpresa;
	}

	public int getDescuentoPorObraSocial() {
		return ((this.getSueldoBruto()) / 10) + (20 * this.getCantidadDeHijos());
	}

	public void setAntiguedadEnEmpresa(int antiguedadEnEmpresa) {
		this.antiguedadEnEmpresa = antiguedadEnEmpresa;
	}

	public int getAsignacionPorAntiguedad() {
		return 50 * (this.getAntiguedadEnEmpresa());
	}

	public int getDescuentoPorAporteJubilatorio() {
		return (this.getSueldoBruto()) / 15;
	}
	
	public int getasignacionPorHijo() {
		return 150;
	}

	public int getasignacionPorConyuge() {
		return  100;
	}
}
	
	
