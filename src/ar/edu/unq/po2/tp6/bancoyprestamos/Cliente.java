package ar.edu.unq.po2.tp6.bancoyprestamos;

public class Cliente {
	
	String nombre;
	String apellido;
	private int edad;
	Banco banco;
	private int sueldoMensual;
	
	public Cliente(String nombre, String apellido, int edad, int sueldoMensual,Banco banco) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.sueldoMensual = sueldoMensual;
		this.banco= banco;
		banco.recibeNuevoCliente(this);
	}

	public int getSueldoMensual() {
		return sueldoMensual;
	}
	
	public void solicitarCreditoPersonalDe(int monto,int cantMeses) {
		banco.recibeSolicitudDeCreditoPersonalDe(this, monto, cantMeses);
	}
	
	public void solicitarCreditoHipotecarioDe(int monto,int cantMeses,PropiedadInmobiliaria prop) {
		banco.recibeSolicitudDeCreditoHipotecarioDe(this, monto, cantMeses,prop);
	}

	public int getIngresoAnual() {
		return sueldoMensual * 12;
	}
	
	public int getEdad() {
		return edad;
	}

}
