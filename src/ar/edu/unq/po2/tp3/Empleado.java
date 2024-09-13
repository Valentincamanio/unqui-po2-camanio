package ar.edu.unq.po2.tp3;
import java.util.Date;

public abstract class Empleado {
	
	private String nombre;
	private String direccion;
	private String estCivil;
	private Date fechaDeNacimiento;
	private int sueldoBasico;
	
	protected Empleado() {
	}
	
	protected Empleado (String nombre,int sueldoBasico, String direccion,Date fechaDeNacimiento) {
		this.nombre=nombre;
		this.direccion=direccion;
		this.estCivil="Soltero";
		this.sueldoBasico=sueldoBasico;
		this.fechaDeNacimiento=fechaDeNacimiento;
	}

	public int getSueldoBasico() {
		return sueldoBasico;
	}

	public int setSueldoBasico(int nuevoSueldoBasico) {
		return this.sueldoBasico=nuevoSueldoBasico;
	}

 	public int edad() {
		 return 0 ; //fechaDeNacimiento;
	}
 	
 	public int getSueldoNeto() {
		return this.getSueldoBruto() - this.getRetenciones();
	}

	public abstract int getSueldoBruto();

	public abstract int getRetenciones();
	



}
