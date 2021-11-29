package co.edu.unbosque.controller;

import co.edu.unbosque.model.Fachada;
import co.edu.unbosque.model.ProductoDTO;
import co.edu.unbosque.model.persistance.Propiedades;
import co.edu.unbosque.view.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {

	private View gui;
	private Mensajes msg = new Mensajes();
	private Propiedades prop = new Propiedades();
	private Fachada facha = new Fachada();

	public Controller() {
		gui = new View();
		gui.setVisible(true);
		gui.getPanelCliente().setVisible(true);
		asignarOyentes();
	}

	public void asignarOyentes() {

		// Utilidades cliente
				gui.getPanelCliente().getBtnBuscarcli().addActionListener(this);
				gui.getPanelCliente().getBtnActualizarCliente().addActionListener(this);
				gui.getPanelCliente().getBtnBorrarCliente().addActionListener(this);
				gui.getPanelCliente().getBtnAgregarCliente().addActionListener(this);

				// Utilidades producto
				gui.getPanelCliente().getBtnBuscarProd().addActionListener(this);
				gui.getPanelCliente().getBtnActualizarProducto().addActionListener(this);
				gui.getPanelCliente().getBtnBorrarProducto().addActionListener(this);
				gui.getPanelCliente().getBtnAgregarProducto().addActionListener(this);
				// Utilidades provedor
				gui.getPanelCliente().getBtnBuscarProve().addActionListener(this);
				gui.getPanelCliente().getBtnActualizarProveedor().addActionListener(this);
				gui.getPanelCliente().getBtnBorrarProveedor().addActionListener(this);
				gui.getPanelCliente().getBtnAgregarProveedor().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {

		String command = ae.getActionCommand();
		System.out.println(command);

		// Comandos cliente
		if (command.equals("BUSCARCLIENTE")) {
			msg.mostrarInformacionCliente(facha.getClientedao().buscarClientePorID());
		}

		if (command.equals("UPDATECLIENTE")) {
			facha.getClientedao().actualizarCliente();
		}

		if (command.equals("BORRARCLIENTE")) {
			facha.getClientedao().borrarCliente();
		}
		if (command.equals("AGREGAR CLIENTE")) {
			facha.getClientedao().crearCliente();
		}

		// Comandos producto
		if (command.equals("BUSCARPRODUCTO")) {
			ProductoDTO codigo = facha.getProductoDAO().buscarProductoPorCodigo();
			for (ProductoDTO producto : facha.getProductoDAO().getProducto()) {
				if (codigo.getCodigoDelProducto().equals(producto.getCodigoDelProducto())) {
					
					gui.getPanelCliente().getMod1()
							.addRow(new String[] { producto.getCodigoDelProducto(), producto.getNombreProducto(),
									String.valueOf(producto.getCantidad()), String.valueOf(producto.getPrecioCompra()),
									String.valueOf(producto.getPrecioVenta()) });
				}
			}
		}

		if (command.equals("UPDATEPRODUCTO")) {
			facha.getProductoDAO().actualizarProducto();
		}
		if (command.equals("AGREGARPRODUCTO")) {
		}

		if (command.equals("BORRARPRODUCTO")) {
			facha.getProductoDAO().borrarProducto();
		}

		// Comandos provedor
		if (command.equals("BUSCARPROVE")) {
			msg.mostrarInformacionProvedor(facha.getProvedordao().buscarProvedorPorID());
		}

		if (command.equals("UPDATEPROVEDOR")) {
			facha.getProvedordao().actualizarProvedor();
		}

		if (command.equals("BORRARPROVEDOR")) {
			facha.getProvedordao().borrarProvedor();
		}
		if (command.equals("AGREGARPROVEEDOR")) {
			facha.getProvedordao().crearProvedor();
		}
	}
}
