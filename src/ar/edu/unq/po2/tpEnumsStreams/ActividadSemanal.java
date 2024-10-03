package ar.edu.unq.po2.tpEnumsStreams;

import java.util.ArrayList;
import java.util.List;

public class ActividadSemanal {

	private List<ActividadDiaria> actividades = new ArrayList<ActividadDiaria>();
	
	public ActividadSemanal() {
	}
	
	public void addActividad(ActividadDiaria act) {
		actividades.add(act);
	}

	public List<ActividadDiaria> getActividadesDeFutbol(){
		return actividades.stream()
						  .filter(a -> a.esDeFutbol(a))
						  .toList();
	}
	
	public List<ActividadDiaria> getActividadesConComplejidad(int complejidad){
		return actividades.stream()
						  .filter(a -> a.getDeporte().tieneNivelDeDificultad(complejidad))
						  .toList();
	}
	
	// UTIL: PARA IR SUMANDO ALGO DE CADA ELEMENTO DE LA COLECCION USAR LOS DISTINTOS TIPOS DE MAP Y LE DAS EL .SUM() ASI LO SUMA
	public int getCantidadDeHorasTotalesDeActividades() {
		return actividades.stream()
						  .mapToInt(ActividadDiaria::getDuracion)
						  .sum() ;
	}
	
	public ActividadDiaria getActConMenorCostoDeTipo(Deporte depbuscado) {
		List<ActividadDiaria> lasDeEseDeporte = actividades.stream()
														   .filter(a -> a.esDeDeporte(depbuscado))
														   .toList();
		return lasDeEseDeporte.stream()
							  .min((e1, e2) -> Double.compare(e1.getCostoActividadDiaria(), e2.getCostoActividadDiaria())) // FORMA DE COMPARAR Y BUSCAR EL MINIMO SEGUN ALGUNA CARACTERISTICA DEL OBJETO
							  .orElse(null); // SE LE PONE orElse PORQUE SINO TIRA OPCIONAL Y ROMPE
	
	}
	
}
