package co.edu.unbosque.view;

import javax.swing.*;

import co.edu.unbosque.model.ClienteDTO;
import co.edu.unbosque.model.ProductoDTO;
import co.edu.unbosque.model.ProvedorDTO;

public class Mensajes {

    public int leerDatoEntero(String mensaje) {
        String aux = JOptionPane.showInputDialog(mensaje);
        int dato = Integer.parseInt(aux);
        return dato;
    }

    public long leerDatoLong(String mensaje) {
        String aux = JOptionPane.showInputDialog(mensaje);
        long dato = Long.parseLong(aux);
        return dato;
    }

    public String leerDatoString(String mensaje) {
        String dato = JOptionPane.showInputDialog(mensaje);
        return dato;
    }

    public double leerDatoReal(String mensaje) {
        String aux = JOptionPane.showInputDialog(mensaje);
        double dato = Double.parseDouble(aux);
        return dato;
    }

    public void mostrarInformacion(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
    public void mostrarInformacionCliente(ClienteDTO clienteDTO) {
        JOptionPane.showMessageDialog(null, clienteDTO);
    }
    
    public void mostrarInformacionProducto(ProductoDTO productodto) {
        JOptionPane.showMessageDialog(null, productodto);
    }
    
    public void mostrarInformacionProvedor(ProvedorDTO provedordto) {
        JOptionPane.showMessageDialog(null, provedordto);
    }
}

