package ar.edu.unq.po2.tpEnumsStreams;

public enum Deporte {
	RUNNING(1) , FUTBOL(2) , BASKET (2) , TENNIS (3) , JABALINA(4);

	int complejidad;
	Deporte(int i) {
		complejidad=i;
	}
	
	int getComplejidad() {
		return complejidad;
	}
	
	Boolean tieneNivelDeDificultad(int complejidad2) {
		return complejidad==complejidad2;
	}
	
}
