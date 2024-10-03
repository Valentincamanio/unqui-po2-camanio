package ar.edu.unq.po2.tpEnumsStreams;

public enum LesionDermatologica {
	
	ROJO(NivelRiesgo.MuyAlto,"Preocupante") , GRIS(NivelRiesgo.Alto ,"Grave") , AMARILLO(NivelRiesgo.Medio ,"Alamarmante") , MIEL(NivelRiesgo.Bajo ,"Medicinal");

	NivelRiesgo nivel ;
	String descripcion;
	
	LesionDermatologica(NivelRiesgo nivel, String descripcion) {
		this.descripcion=descripcion;
		this.nivel=nivel;
	}
	
	public NivelRiesgo getNivel() {
		return nivel;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public LesionDermatologica getProximoEnMaduracion() {
		LesionDermatologica [] lesiones = LesionDermatologica.values();
		return lesiones[(this.ordinal()+1) % lesiones.length];
	}
	
}
