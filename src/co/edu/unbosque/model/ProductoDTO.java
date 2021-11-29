package co.edu.unbosque.model;

import java.io.Serializable;

public class ProductoDTO implements Serializable{
	
	private String codigoDelProducto;
	private String nombreProducto;	
	private String nitProvedor;
	private int cantidad;
	private double precioCompra;
	private double IVA = precioCompra*0.19;
	private double precioTotal = precioCompra + IVA;
	
	
	public ProductoDTO(String codigoDelProducto, String nombreProducto, String nitProvedor, int cantidad,
			double precioCompra , double precioTotal) {
		this.codigoDelProducto = codigoDelProducto;
		this.nombreProducto = nombreProducto;
		this.nitProvedor = nitProvedor;
		this.cantidad = cantidad;
		this.precioCompra = precioCompra;
		this.precioTotal = precioTotal;
		
		
	}
	
	@Override
	public String toString() {
		return "ProductoDTO [codigoDelProducto=" + codigoDelProducto + ", nombreProducto=" + nombreProducto
				+ ", nitProvedor=" + nitProvedor + ", cantidad=" + cantidad + ", precioCompra=" + precioCompra
				+ ", IVA=" + IVA + ", precioTotal=" + precioTotal + "]";
	}

	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public String getCodigoDelProducto() {
		return codigoDelProducto;
	}
	public void setCodigoDelProducto(String codigoDelProducto) {
		this.codigoDelProducto = codigoDelProducto;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public String getNitProvedor() {
		return nitProvedor;
	}
	public void setNitProvedor(String nitProvedor) {
		this.nitProvedor = nitProvedor;
	}
	public double getPrecioCompra() {
		return precioCompra;
	}
	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}
	public double getPrecioVenta() {
		return precioTotal;
	}
	public void setPrecioVenta(double precioVenta) {
		this.precioTotal = precioVenta;
	}
	
	
}
