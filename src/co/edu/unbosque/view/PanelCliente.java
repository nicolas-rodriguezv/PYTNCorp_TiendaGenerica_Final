package co.edu.unbosque.view;

import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;

public class PanelCliente extends JPanel {
    private String BUSCARPRODUCTO = "Buscar Productos";
    private String BUSCARCLIENTE = "Buscar Cliente por ID";
    private String BUSCARPROVE = "Buscar Proveedores";
    private JButton btnBuscarcli = new JButton();
    private JButton btnAgregarCliente = new JButton();
    private JButton btnAgregarProveedor = new JButton();
    private JButton btnAgregarProducto = new JButton();
    private JButton btnBuscarProd = new JButton();
    private JButton btnBuscarProve = new JButton();
    private JButton btnActualizarCliente = new JButton("Actualizar Cliente");
    private JButton btnBorrarCliente = new JButton("Borrar Cliente");
    private JButton btnActualizarProveedor = new JButton("Actualizar Proveedor");
    private JButton btnBorrarProveedor = new JButton("Borrar Proveedor");
    private JButton btnActualizarProducto = new JButton("Actualizar Producto");
    private JButton btnBorrarProducto = new JButton("Borrar Producto");
    private DefaultTableModel mod1;
    private JTable tabla1;
    private JScrollPane scroll1;

    public PanelCliente() {
        setSize(560, 400);
        btnBuscarcli = new JButton("Buscar Cliente por ID");
        btnBuscarcli.setFont(new Font("Tahoma", Font.PLAIN, 12));
        btnBuscarcli.setBounds(20, 11, 173, 17);
        btnBuscarcli.setActionCommand("BUSCARCLIENTE");
        btnBuscarProd = new JButton("Buscar Productos");
        btnBuscarProd.setFont(new Font("Tahoma", Font.PLAIN, 12));
        btnBuscarProd.setBounds(372, 11, 157, 17);
        btnBuscarProd.setActionCommand("BUSCARPRODUCTO");
        btnBuscarProve = new JButton("Buscar Proveedores");
        btnBuscarProve.setFont(new Font("Tahoma", Font.PLAIN, 12));
        btnBuscarProve.setBounds(197, 11, 165, 17);
        btnBuscarProve.setActionCommand("BUSCARPROVE");
        setLayout(null);
        add(btnBuscarcli);
        add(btnBuscarProd);
        add(btnBuscarProve);
        mod1 = new DefaultTableModel(new String[]{"Cod", "Nombre", "Cantidad", "NIT" ,"Precio C/U ($)", "Precio Total ($)"}, 0);
        tabla1 = new JTable(mod1);
        tabla1.setEnabled(false);
        tabla1.setFont(new Font("Tahoma", Font.PLAIN, 12));
        tabla1.getTableHeader().setReorderingAllowed(false);
        tabla1.getTableHeader().setResizingAllowed(false);
        scroll1 = new JScrollPane(tabla1);
        scroll1.setBounds(20, 109, 509, 264);
        add(scroll1);
        
        btnActualizarCliente.setFont(new Font("Tahoma", Font.PLAIN, 12));
        btnActualizarCliente.setBounds(20, 33, 173, 17);
        btnActualizarCliente.setActionCommand("UPDATECLIENTE");
        add(btnActualizarCliente);
        
        btnBorrarCliente.setFont(new Font("Tahoma", Font.PLAIN, 12));
        btnBorrarCliente.setBounds(20, 54, 173, 17);
        btnBorrarCliente.setActionCommand("BORRARCLIENTE");
        add(btnBorrarCliente);
        
        btnActualizarProveedor.setFont(new Font("Tahoma", Font.PLAIN, 12));
        btnActualizarProveedor.setBounds(197, 33, 165, 17);
        btnActualizarProveedor.setActionCommand("UPDATEPROVEDOR");
        add(btnActualizarProveedor);
        
        btnBorrarProveedor.setFont(new Font("Tahoma", Font.PLAIN, 12));
        btnBorrarProveedor.setBounds(197, 54, 165, 17);
        btnBorrarProveedor.setActionCommand("BORRARPROVEDOR");
        add(btnBorrarProveedor);
        
        btnActualizarProducto.setFont(new Font("Tahoma", Font.PLAIN, 12));
        btnActualizarProducto.setBounds(372, 33, 157, 17);
        btnActualizarProducto.setActionCommand("UPDATEPRODUCTO");
        add(btnActualizarProducto);
        
        btnBorrarProducto.setFont(new Font("Tahoma", Font.PLAIN, 12));
        btnBorrarProducto.setBounds(372, 52, 157, 17);
        btnBorrarProducto.setActionCommand("BORRARPRODUCTO");
        add(btnBorrarProducto);
        
        btnAgregarCliente = new JButton("Agregar Cliente");
        btnAgregarCliente.setFont(new Font("Tahoma", Font.PLAIN, 12));
        btnAgregarCliente.setBounds(20, 76, 173, 17);
        btnAgregarCliente.setActionCommand("AGREGAR CLIENTE");
        add(btnAgregarCliente);
        
        btnAgregarProveedor = new JButton("Agregar Proveedor");
        btnAgregarProveedor.setFont(new Font("Tahoma", Font.PLAIN, 12));
        btnAgregarProveedor.setBounds(197, 76, 165, 17);
        btnActualizarProveedor.setActionCommand("AGREGARPROVEEDOR");
        add(btnAgregarProveedor);
        
        btnAgregarProducto = new JButton("Agregar Producto");
        btnAgregarProducto.setFont(new Font("Tahoma", Font.PLAIN, 12));
        btnAgregarProducto.setBounds(370, 76, 157, 17);
        btnAgregarProducto.setActionCommand("AGREGARPRODUCTO");
        add(btnAgregarProducto);

    }
    
    
	public JButton getBtnAgregarCliente() {
		return btnAgregarCliente;
	}


	public void setBtnAgregarCliente(JButton btnAgregarCliente) {
		this.btnAgregarCliente = btnAgregarCliente;
	}


	public JButton getBtnAgregarProveedor() {
		return btnAgregarProveedor;
	}


	public void setBtnAgregarProveedor(JButton btnAgregarProveedor) {
		this.btnAgregarProveedor = btnAgregarProveedor;
	}


	public JButton getBtnAgregarProducto() {
		return btnAgregarProducto;
	}


	public void setBtnAgregarProducto(JButton btnAgregarProducto) {
		this.btnAgregarProducto = btnAgregarProducto;
	}


	public String getBUSCARPRODUCTO() {
		return BUSCARPRODUCTO;
	}

	public void setBUSCARPRODUCTO(String BUSCARPRODUCTO) {
		BUSCARPRODUCTO = BUSCARPRODUCTO;
	}

	public String getBUSCARCLIENTE() {
		return BUSCARCLIENTE;
	}

	public void setBUSCARCLIENTE(String BUSCARCLIENTE) {
		BUSCARCLIENTE = BUSCARCLIENTE;
	}

	public String getBUSCARPROVE() {
		return BUSCARPROVE;
	}

	public void setBUSCARPROVE(String BUSCARPROVE) {
		BUSCARPROVE = BUSCARPROVE;
	}

	public JButton getBtnBuscarcli() {
		return btnBuscarcli;
	}

	public void setBtnBuscarcli(JButton btnBuscarcli) {
		this.btnBuscarcli = btnBuscarcli;
	}

	public JButton getBtnBuscarProd() {
		return btnBuscarProd;
	}

	public void setBtnBuscarProd(JButton btnBuscarProd) {
		this.btnBuscarProd = btnBuscarProd;
	}

	public JButton getBtnBuscarProve() {
		return btnBuscarProve;
	}

	public void setBtnBuscarProve(JButton btnBuscarProve) {
		this.btnBuscarProve = btnBuscarProve;
	}

	public JButton getBtnActualizarCliente() {
		return btnActualizarCliente;
	}

	public void setBtnActualizarCliente(JButton btnActualizarCliente) {
		this.btnActualizarCliente = btnActualizarCliente;
	}

	public JButton getBtnBorrarCliente() {
		return btnBorrarCliente;
	}

	public void setBtnBorrarCliente(JButton btnBorrarCliente) {
		this.btnBorrarCliente = btnBorrarCliente;
	}

	public JButton getBtnActualizarProveedor() {
		return btnActualizarProveedor;
	}

	public void setBtnActualizarProveedor(JButton btnActualizarProveedor) {
		this.btnActualizarProveedor = btnActualizarProveedor;
	}

	public JButton getBtnBorrarProveedor() {
		return btnBorrarProveedor;
	}

	public void setBtnBorrarProveedor(JButton btnBorrarProveedor) {
		this.btnBorrarProveedor = btnBorrarProveedor;
	}

	public JButton getBtnActualizarProducto() {
		return btnActualizarProducto;
	}

	public void setBtnActualizarProducto(JButton btnActualizarProducto) {
		this.btnActualizarProducto = btnActualizarProducto;
	}

	public JButton getBtnBorrarProducto() {
		return btnBorrarProducto;
	}

	public void setBtnBorrarProducto(JButton btnBorrarProducto) {
		this.btnBorrarProducto = btnBorrarProducto;
	}

	public DefaultTableModel getMod1() {
		return mod1;
	}

	public void setMod1(DefaultTableModel mod1) {
		this.mod1 = mod1;
	}

	public JTable getTabla1() {
		return tabla1;
	}

	public void setTabla1(JTable tabla1) {
		this.tabla1 = tabla1;
	}

	public JScrollPane getScroll1() {
		return scroll1;
	}

	public void setScroll1(JScrollPane scroll1) {
		this.scroll1 = scroll1;
	}    
}
