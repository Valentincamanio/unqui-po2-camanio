package ar.edu.unq.po2.tp4;

import java.time.Month;

public abstract class IngresoSimple extends Ingreso{

	protected IngresoSimple(Month mes, String conceptoI, float montoPercibidoI) {
		super(mes, conceptoI, montoPercibidoI);
	}

	@Override
	protected Boolean esPorHorasExtras() {
		return false;
	}

	
}
