package ar.edu.unq.po2.tp6.bancoyprestamos;

public abstract class SolicitudDeCredito {
	
	protected Cliente cliente;
	protected int monto;
	protected int plazoDeMeses;
	
	public SolicitudDeCredito(Cliente cliente, int monto, int plazoDeMeses) {
		this.cliente = cliente;
		this.monto = monto;
		this.plazoDeMeses = plazoDeMeses;
	}

	public abstract Boolean esAceptable();
	
	public int montoDeCuota() {
		return monto/plazoDeMeses;
	}
}
