package co.edu.unbosque.model;

import co.edu.unbosque.model.persistance.Propiedades;

public class Fachada {
	
    private ClienteDAO clientedao = new ClienteDAO();
    private ProductoDAO productoDAO = new ProductoDAO();
    private ProvedorDAO provedordao = new ProvedorDAO();

	public ClienteDAO getClientedao() {
		return clientedao;
	}
	public void setClientedao(ClienteDAO clientedao) {
		this.clientedao = clientedao;
	}
	public ProductoDAO getProductoDAO() {
		return productoDAO;
	}
	public void setProductoDAO(ProductoDAO productoDAO) {
		this.productoDAO = productoDAO;
	}
	public ProvedorDAO getProvedordao() {
		return provedordao;
	}
	public void setProvedordao(ProvedorDAO provedordao) {
		this.provedordao = provedordao;
	}
    
    
}
