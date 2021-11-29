package co.edu.unbosque.model;

import java.io.Serializable;

public class ProvedorDTO implements Serializable{

	private String NIT;
	private String nombreProvedor;
	private int precioCompra;
	private int precioVenta;
	
	public ProvedorDTO(String nIT, String nombreProvedor, int precioCompra, int precioVenta) {
		super();
		NIT = nIT;
		this.nombreProvedor = nombreProvedor;
		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;
	}
	
	
	
	@Override
	public String toString() {
		return "ProvedorDTO [NIT=" + NIT + ", nombreProvedor=" + nombreProvedor + ", precioCompra=" + precioCompra
				+ ", precioVenta=" + precioVenta + "]";
	}



	public String getNIT() {
		return NIT;
	}
	public void setNIT(String nIT) {
		NIT = nIT;
	}
	public String getNombreProvedor() {
		return nombreProvedor;
	}
	public void setNombreProvedor(String nombreProvedor) {
		this.nombreProvedor = nombreProvedor;
	}
	public int getPrecioCompra() {
		return precioCompra;
	}
	public void setPrecioCompra(int precioCompra) {
		this.precioCompra = precioCompra;
	}
	public int getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(int precioVenta) {
		this.precioVenta = precioVenta;
	}
	
	

}
