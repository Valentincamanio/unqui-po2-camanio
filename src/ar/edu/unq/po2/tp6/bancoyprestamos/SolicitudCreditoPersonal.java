package ar.edu.unq.po2.tp6.bancoyprestamos;

public class SolicitudCreditoPersonal extends SolicitudDeCredito{
	
	
	public SolicitudCreditoPersonal(Cliente cliente, int monto, int plazoDeMeses) {
		super(cliente, monto, plazoDeMeses);
	}


	private Boolean elSueldoEsSuperiorA(int y,double x) {
		return y>x;
	}

	@Override
	public Boolean esAceptable() {
		return this.elSueldoEsSuperiorA(cliente.getIngresoAnual(),15000) && (cliente.getSueldoMensual() > this.montoDeCuota()*0.7);
	} 

	


}
