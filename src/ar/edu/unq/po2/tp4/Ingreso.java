package ar.edu.unq.po2.tp4;

import java.time.Month;
import java.util.Date;

public abstract class Ingreso {
	
	private Month mesDePercepcion;
	private String concepto;
	private float montoPercibido;
	
	protected Ingreso (Month mes,String conceptoI, float montoPercibidoI) {
		mesDePercepcion=mes;
		concepto=conceptoI;
		montoPercibido=montoPercibidoI;
	}
	
	// Gets
	protected Month getMesDePercepcion() {
		return mesDePercepcion;
	}
	
	protected String getConcepto() {
		return concepto;
	}
	
	protected float getMontoPercibido() {
		return montoPercibido;
	}
	
	protected abstract Boolean esPorHorasExtras();
	
	// Sets 
	protected void setMesDePercepcion(Month mesDePercepcion) {
		this.mesDePercepcion = mesDePercepcion;
	}
	
	protected void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	
	protected void setMontoPercibido(float montoPercibido) {
		this.montoPercibido = montoPercibido;
	}

	
}
