package ar.edu.unq.po2.tp6.bancoyprestamos;

public class SolicitudCreditoHipotecario extends SolicitudDeCredito{
	
	private PropiedadInmobiliaria propiedad;
	public SolicitudCreditoHipotecario(Cliente cliente, int monto, int plazoDeMeses,PropiedadInmobiliaria prop) {
		super(cliente, monto, plazoDeMeses);
		 propiedad = prop;
	}

	@Override
	public Boolean esAceptable() {
		return elMontoDeCuotaEsAptoParaSueldoMensualDeCliente() && elMontoEsAptoParaGarantia() && clienteCumpleRequisitosDeEdad()  ;
	}

	private boolean clienteCumpleRequisitosDeEdad() {
		return (cliente.getEdad()<64) || (cliente.getEdad()==64 && plazoDeMeses<12) ;
	}

	private boolean elMontoEsAptoParaGarantia() {
		return monto< (propiedad.getValor()*0.7);
	}

	private Boolean elMontoDeCuotaEsAptoParaSueldoMensualDeCliente() {
		return (cliente.getSueldoMensual()*0.5) > this.montoDeCuota();
	}

}
