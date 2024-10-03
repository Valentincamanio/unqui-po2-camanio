package ar.edu.unq.po2.tpEnumsStreams;


public class ActividadDiaria {

	private DiaDeLaSemana dia;
	private int horaDeInicio ; 
	private int duracion;
	private Deporte deporte;
	
	public ActividadDiaria(DiaDeLaSemana dia, int horaDeInicio, int duracion, Deporte deporte) {
		this.dia = dia;
		this.horaDeInicio = horaDeInicio;
		this.duracion = duracion;
		this.deporte = deporte;
	}
	
	public Boolean esDeFutbol(ActividadDiaria act) {
		return act.getDeporte()==Deporte.FUTBOL;
	}
	
	// GETTERS
	public DiaDeLaSemana getDia() {
		return dia;
	}

	public int getHoraDeInicio() {
		return horaDeInicio;
	}

	public int getDuracion() {
		return duracion;
	}
	
	public Deporte getDeporte() {
		return deporte;
	}
	
	public int getCostoActividadDiaria() {
		if(!this.esActividadDeFinDeSemana()) {
			return 500+(this.getDeporte().getComplejidad()*200);
		}else {
			return 1000+(this.getDeporte().getComplejidad()*200);
		}
}

	public boolean esActividadDeFinDeSemana() {
		return dia.ordinal()>=3;
	}

	public Boolean esDeDeporte(Deporte depbuscado) {
		return this.getDeporte()==depbuscado;
	}

	
}
