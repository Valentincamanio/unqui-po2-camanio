package ar.edu.unq.po2.tp3;
import java.util.Date;

public class Empleado {
	
	private String nombre;
	private String direccion;
	private String estCivil;
	private Date fechaDeNacimiento;
	private int sueldoBasico;
	
	public Empleado (String nombre,int sueldoBasico, String direccion,Date fechaDeNacimiento) {
		this.nombre=nombre;
		this.direccion=direccion;
		this.estCivil="Soltero";
		this.sueldoBasico=sueldoBasico;
		this.fechaDeNacimiento=fechaDeNacimiento;
	}

	public int getSueldoBasico() {
		return this.sueldoBasico;
	}

	public int setSueldoBasico(int nuevoSueldoBasico) {
		return this.sueldoBasico=nuevoSueldoBasico;
	}

 	public int edad() {
		return 0;
		// preguntar tipo date
	}

	protected int getSalarioFamiliar() {
		return 0;
		// subclass resposability
	}

	public int getSueldoBruto() {
		return 0;
		// subclass resposability
	}

	public int valorTotalPorAsignaciones(){
		return 0; 
		// subclass resposability
	}

	public int getRetenciones() {
		return 0;
		// subclass resposability
	}

	public int getSueldoNeto() {
		return this.getSueldoBruto() - this.getRetenciones();
	}

	public int getasignacionPorHijo() {
		return 150;
	}

	public int getasignacionPorConyuge() {
		return  0;
	/*
	 * if(this.estCivil=="Casado")
					then 100 else 0;
	 */
	}

	public int getAsignacionPorAntiguedad() {
		return 0;
		// subclass resposability
	}

	public int getDescuentoPorObraSocial() {
		return 0 ;
		// subclass resposability
	}
	
	public int getDescuentoPorAporteJubilatorio() {
		return 0;
		// subclass resposability
	}


}
