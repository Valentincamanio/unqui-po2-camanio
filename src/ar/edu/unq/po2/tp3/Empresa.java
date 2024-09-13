package ar.edu.unq.po2.tp3;

import java.util.List;

import java.util.ArrayList;
;
public class Empresa {
	private String nombre;
	private int cuit;
	private List <Empleado> empleados;
	
	
	public Empresa (String nombreE , int cuitE,ArrayList<Empleado> emply) {
		nombre= nombreE;
		cuit = cuitE;
		empleados=emply;
	}
	public String getNombre() {
		return this.nombre;
	}
	
	public int getCuit() {
		return cuit;
	}
	
	public Empleado getEmpleados() {
		return (Empleado) empleados;
	}
	
	public int valorTotalSueldosNetos() {
		int valorT=0;
		for(Empleado emply:empleados) {
			valorT+=emply.getSueldoNeto();
		}
		return valorT;
	}
	
	public int valorTotalDeSueldosBrutos() {
		int valorT=0;
		for(Empleado emply:empleados) {
			valorT+=emply.getSueldoBruto();
		}
		return valorT;
	}
	
	public int valorTotalDeRetenciones() {
		int valorT=0;
		for(Empleado emply:empleados) {
			valorT+=emply.getRetenciones();
		}
		return valorT;
	}
	
	public void liquidarSueldos() {
		
	}
	
}

