package co.edu.unbosque.view;

import javax.swing.*;
import java.awt.*;

public class View extends JFrame {
	private PanelCliente panelClientes;

	public View() {
		setSize(550, 420);
		setResizable(false);
		setTitle("Tienda Generica");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		panelClientes = new PanelCliente();
		add(panelClientes, BorderLayout.CENTER);
	}

	public PanelCliente getPanelCliente() {
		return panelClientes;
	}

	public void setPanelClientes(PanelCliente panelClientes) {
		this.panelClientes = panelClientes;
	}
}
