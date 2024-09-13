package ar.edu.unq.po2.tp6.emails;

import java.util.List;

public class Email implements IEmail{
	
	private ServidorPop servidor; 
	private Usuario usuario;
	
	public Email(String nombreUser, String pass) {
		usuario= new Usuario (nombreUser,pass);
		servidor.logIn(usuario);
	}

	@Override
	public void borrarCorreo(Correo x) {
		servidor.borrarCorreo(x);
	}

	@Override
	public List<Correo> recibirCorreos() {
		return servidor.recibirCorreos();
	}

	@Override
	public int contarBorrados() {
		return servidor.contarBorrados();
	}

}
