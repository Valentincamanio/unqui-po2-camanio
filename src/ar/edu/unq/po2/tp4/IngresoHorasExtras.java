package ar.edu.unq.po2.tp4;

import java.time.Month;

public abstract class IngresoHorasExtras extends Ingreso {
	
	private int cantHorasExtras;
	
	protected IngresoHorasExtras(Month mes, String conceptoI, float montoPercibidoI,int cantHorasE) {
		super(mes, conceptoI, montoPercibidoI);
		cantHorasExtras=cantHorasE;
	}

	protected int getCantHorasExtras() {
		return cantHorasExtras;
	}


	protected void setCantHorasExtras(int cantHorasExtras) {
		this.cantHorasExtras = cantHorasExtras;
	}
	
	@Override
	protected Boolean esPorHorasExtras() {
		return true;
	}
	
	
}
