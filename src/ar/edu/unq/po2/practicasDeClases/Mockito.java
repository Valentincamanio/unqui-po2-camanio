package ar.edu.unq.po2.practicasDeClases;

public class Mockito {
}


// framework de test orientado a test doubles 

/**
 * Sut - Evalua cada clase con su propio test y de esa forma se encuentra los errores mas rapido 
 * Doc - Todas las clases que interactuan con el sut. Por ej: clase perro, se testea perro como sut y dueno como doc
 * 
 * Comportamientos para test doubles / objetos falsos: Dummy, Stub,Mock, Spy 
 * 	Dummy: Es el objeto falso para rellenar listas de parametros
 * 	Stub: Proporciona respuestas programadas realizadas durante la prueba / Simula los casos mas robustos 
 * 	Mock: Es un stub con la capacidad de pdoer verficarse / Verifica que el doc haya enviado lo que se le pedia 
 * 	Spy: Es un mock pero llama a los metodos del obketo real 
 */

// Las clases que ya vienen con java se pueden espiar pero no mockear 


/**
 * Instanciar el doc como falso: 
 * 		Classname humano = mock(Humano.class);
 * 		@Mock private Humano humano
 * Setear el valo: 
 * 		. when(humano).thenReturn(value)
 * 		. thenReturn(value,value). thenThrow(throwableClasses)
 * Verificar: 
 * 		. verify(mock).methodCall
 * 		. verify(mock,(una condicion para ver si por ej se mando 3 veces algo)).methodCall
 */

// import static org.mockito.Mockito.*;


/**  Para probar con mock
 *  
 *  IMoneda unaMoneda;
 *  IGuerrero otroGuerrero;
 *  GuerreroDeAzar guerrero;
 *  
 * 	void setUp(){
 * 		unaMoneda = mock(IMoneda.class); 
 * 		otroGuerrero = mock(IGuerrero.class);
 * 		guerrero = mew GuerreroDeAzar (40,33,unaMoneda);
 * }
 * 	
 * 	void testGuerrreroDeAzarAtacaAOtroYOcasionaDano(){
 * 		// Sut: GuerreroDeAzar - Doc: IMoneda,IGuerrero
 * 		
 * 		guerrero.atacar(otroGuerrero);
 * 
 * 		//verify - Como no se puede instanciar tiene q tener un metodo
 * 		verify(otroGuerrero).descontarPuntosDeVida(100);
 * 		
 * 	}
 * 	
 * 	 void testGuerrreroDeAzarSeAtacaASuMismo(){
 * 		
 * 		guerrero.atacar(otroGuerrero);
 * 
 * 		//verify - como no se puede verify sobre guerrero porque es sut, se evalua que nunca llego el descontarvida
 * 		verify(otroGuerrero, never()).descontarPuntosDeVida(100);
 * 		
 * 	}
 */




