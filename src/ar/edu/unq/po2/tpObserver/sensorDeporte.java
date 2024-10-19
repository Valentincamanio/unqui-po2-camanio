package ar.edu.unq.po2.tpObserver;

import java.util.HashSet;
import java.util.Set;

public class sensorDeporte{
	
	 public sensorDeporte(Set<Observador> dependencias) {
		this.dependencias = dependencias;
	}

	Set <Observador> dependencias = new HashSet <Observador>();
	
	public void addObserver(Observador o) {
		dependencias.add(o);
	}
	
	public void deleteObserver(Observador o) {
		dependencias.remove(o);
	}
	
	public void notificaCambios() {
		dependencias.forEach(null);
	}
	 
}
