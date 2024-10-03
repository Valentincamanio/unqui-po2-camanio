package ar.edu.unq.po2.tpEnumsStreams;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ActividadesSemanalesTest {

	private ActividadDiaria act1;
	private ActividadDiaria act2;
	private ActividadDiaria act3;
	private ActividadDiaria act4;
	private ActividadSemanal actsSemanales;
	
	@BeforeEach
	void setUp() throws Exception {
		
		act1 = new ActividadDiaria (DiaDeLaSemana.Lunes, 7, 2, Deporte.FUTBOL) ;
		act2 = new ActividadDiaria (DiaDeLaSemana.Viernes, 8, 1, Deporte.FUTBOL) ;
		act3 = new ActividadDiaria (DiaDeLaSemana.Sabado, 9, 3, Deporte.FUTBOL) ;
		act4 = new ActividadDiaria (DiaDeLaSemana.Miercoles, 9, 3, Deporte.RUNNING) ;
		
		actsSemanales= new ActividadSemanal();
		actsSemanales.addActividad(act1);
		actsSemanales.addActividad(act2);
		actsSemanales.addActividad(act3);
		actsSemanales.addActividad(act4);
	}

	@Test
	void testActividadesDeFutbol() {
		List<ActividadDiaria>listActs=Arrays.asList(act1,act2,act3);
		assertEquals(listActs, actsSemanales.getActividadesDeFutbol());;
	}
	
	@Test
	void testCostoDeActividadDiaria() {
		assertEquals(900, act1.getCostoActividadDiaria());
	}
	
	@Test
	void testActividadesConDeterminadaComplejidad() {
		List<ActividadDiaria> resultado = actsSemanales.getActividadesConComplejidad(1);
		assertEquals(1, resultado.size());
	}
	
	@Test
	void testCantidadDeHorasDeActividadesSemanales() {
		assertEquals(9, actsSemanales.getCantidadDeHorasTotalesDeActividades());
	}
	
	@Test
	void testDeporteDeMenorCostoDeUnTipoDeDeporte() {
		assertEquals(act1, actsSemanales.getActConMenorCostoDeTipo(Deporte.FUTBOL));
	}
	
	// =========================================    FUNCIONA TODO PERFECTO 
	
	
	
	
	
	
}
