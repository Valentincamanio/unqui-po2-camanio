package ar.edu.unq.po2.tp6.emails;

public class Correo {
	
	private String destinatario;
	private String asunto;
	private String cuerpo; 
	
	public Correo(String destinatario, String asunto, String cuerpo) {
		this.destinatario = destinatario;
		this.asunto = asunto;
		this.cuerpo = cuerpo;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public String getAsunto() {
		return asunto;
	}

	public String getCuerpo() {
		return cuerpo;
	}
	
}
