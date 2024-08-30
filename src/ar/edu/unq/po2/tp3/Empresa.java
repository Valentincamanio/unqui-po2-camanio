package ar.edu.unq.po2.tp3;


public class Empresa {
	private String nombre;
	private String cuit;
	private Empleado empleados;
	
	public Empresa (String nombre , String cuit) {
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
	
	public String getCuit() {
		return this.cuit;
	}
	
	public Empleado getEmpleados() {
		return this.empleados;
	}
	
	public int valorTotalSueldosNetos() {
		return this.empleados.getSueldoNeto();
	}
	
	public int valorTotalDeSueldosBrutos() {
		return this.empleados.getSueldoBruto();
	}
	
	public int valorTotalDeRetenciones() {
		return this.empleados.getRetenciones();
	}
	
	public void liquidarSueldos() {
		
	}
	
}

