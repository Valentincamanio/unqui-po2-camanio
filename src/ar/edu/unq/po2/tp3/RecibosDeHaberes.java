package ar.edu.unq.po2.tp3;

import java.util.Date;

public class RecibosDeHaberes{
	
	private String nombreDelEmpleado; 
	private String direccionDelEmpleado; 
	private Date fechaDeEmision;
	private int sueldoBrutoDelEmpleado;
	private int sueldoNetoDelEmpleado;

	public String getNombreDelEmpleado() {
		return nombreDelEmpleado;
	}

	public void setNombreDelEmpleado(String nombreDelEmpleado) {
		this.nombreDelEmpleado = nombreDelEmpleado;
	}

	public String getDireccionDelEmpleado() {
		return direccionDelEmpleado;
	}

	public void setDireccionDelEmpleado(String direccionDelEmpleado) {
		this.direccionDelEmpleado = direccionDelEmpleado;
	}

	public int getSueldoBrutoDelEmpleado() {
		return sueldoBrutoDelEmpleado;
	}

	public void setSueldoBrutoDelEmpleado(int sueldoBrutoDelEmpleado) {
		this.sueldoBrutoDelEmpleado = sueldoBrutoDelEmpleado;
	}

	public int getSueldoNetoDelEmpleado() {
		return sueldoNetoDelEmpleado;
	}

	public void setSueldoNetoDelEmpleado(int sueldoNetoDelEmpleado) {
		this.sueldoNetoDelEmpleado = sueldoNetoDelEmpleado;
	}
	
	
}
