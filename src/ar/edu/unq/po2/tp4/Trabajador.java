package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {

	List<Ingreso> ingresos= new ArrayList <Ingreso>();
	
	public void addIngreso(Ingreso x) {
		ingresos.add(x);
	}
	
	public float getTotalPercibido() {
		float valorT = 0;
		for (Ingreso ing:ingresos){
			valorT+=ing.getMontoPercibido();
		}
		return valorT;
	}
 
	public double getMontoImponible() {
		float valorI = 0;
		for (Ingreso ing:ingresos) {
			if (ing.esPorHorasExtras()==false) {
				valorI+=ing.getMontoPercibido();
			}
		}
		return valorI;
	} 
	
	public double getImpuestoAPagar() {
		return this.getMontoImponible() * (0.2);
	}
}
