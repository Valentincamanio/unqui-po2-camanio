package ar.edu.unq.po2.tp6.emails;

import java.util.ArrayList;
import java.util.List;

public class ServidorPop implements IEmail {
	
	List<Usuario> retorno= new ArrayList <Usuario>();
	List<Correo> borrados= new ArrayList <Correo>();
	List<Correo> inbox= new ArrayList <Correo>();
	
	
	public void logIn(Usuario x) {
		retorno.add(x);
	}
	
	@Override
	public void borrarCorreo(Correo x) {
		inbox.remove(x);
	}

	@Override
	public List<Correo> recibirCorreos() {
		return inbox;
	}

	@Override
	public int contarBorrados() {
		return borrados.size();
	}
	
	/////////////////// SETTERS
	public void setRetorno(Usuario x) {
		retorno.add(x);
	}

	public void addBorrado(Correo x) {
		borrados.add(x);
	}

	public void addInbox(Correo x) {
		inbox.add(x);
	}
}
