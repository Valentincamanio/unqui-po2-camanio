package ar.edu.unq.po2.tp6.emails;

import java.util.List;

public interface IEmail {
	
	public void borrarCorreo(Correo x);
	public List<Correo> recibirCorreos();
	public int contarBorrados();
	
}
