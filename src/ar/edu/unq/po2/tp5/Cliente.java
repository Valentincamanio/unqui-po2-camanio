package ar.edu.unq.po2.tp5;

public class Cliente implements ICliente{
	
	String nombre;
	
	public Cliente(String nombre) {
		this.nombre=nombre;
	}

	@Override
	public float montoAPagar() {
		return 0;
	}

}
