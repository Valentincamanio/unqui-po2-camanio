package ar.edu.unq.po2.tp6.emails;

public class Usuario {
	
	private String nombreUsuario;
	private String password;	
	
	public Usuario(String nombreUsuario, String password) {
		this.nombreUsuario = nombreUsuario;
		this.password = password;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public String getPassword() {
		return password;
	}

	
}
