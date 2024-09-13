package ar.edu.unq.po2.tp6.bancoyprestamos;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	List<Cliente> clientes= new ArrayList <Cliente>();
	List<SolicitudDeCredito> solicitudes= new ArrayList <SolicitudDeCredito>();
	
	public void recibeSolicitudDeCreditoPersonalDe(Cliente cliente, int monto, int cantMeses) {
		// Prop: Registra en la lista el nuevo credito personal
		SolicitudCreditoPersonal solCreditoPersonal = new SolicitudCreditoPersonal (cliente, monto, cantMeses);
		solicitudes.add(solCreditoPersonal);
	}

	public void recibeSolicitudDeCreditoHipotecarioDe(Cliente cliente, int monto, int cantMeses,
			PropiedadInmobiliaria prop) {
		// Prop: Registra en la lista el nuevo credito hipotecario
		SolicitudCreditoHipotecario solCreditoHip = new SolicitudCreditoHipotecario (cliente, monto, cantMeses,prop);
		solicitudes.add(solCreditoHip);
		
	}
	
	public void recibeNuevoCliente(Cliente clien) {
		clientes.add(clien);
	}
	
	
}
