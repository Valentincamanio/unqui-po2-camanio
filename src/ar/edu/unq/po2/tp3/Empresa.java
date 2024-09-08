package ar.edu.unq.po2.tp3;


public class Empresa {
	private String nombre;
	private int cuit;
	private Empleado empleados;
	
	public Empresa (String nombre , int cuit) {
		this.nombre= nombre;
		this.cuit = cuit;
		/*
		 * 
		List <Empleado> empleados= new Arraylist <Empleado>();
		for() {
			this.empleados.add
		}import java.util.List;
		 */
	}
	public String getNombre() {
		return this.nombre;
	}
	
	public int getCuit() {
		return cuit;
	}
	
	public Empleado getEmpleados() {
		return empleados;
	}
	
	public int valorTotalSueldosNetos() {
		return empleados.getSueldoNeto();
	}
	
	public int valorTotalDeSueldosBrutos() {
		return empleados.getSueldoBruto();
	}
	
	public int valorTotalDeRetenciones() {
		return empleados.getRetenciones();
	}
	
	public void liquidarSueldos() {
		
	}
	
}

