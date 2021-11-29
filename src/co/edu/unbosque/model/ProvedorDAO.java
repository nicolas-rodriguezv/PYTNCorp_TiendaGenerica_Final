package co.edu.unbosque.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import co.edu.unbosque.view.Mensajes;

public class ProvedorDAO {

	private Mensajes msg = new Mensajes();
	private ArrayList<ProvedorDTO> provedor = new ArrayList<ProvedorDTO>();
	private File f;

	public ProvedorDAO() {
		f = new File("./data/provedor.dat");
		if(!f.exists()) {
			try{
				f.createNewFile();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void crearProvedor() {
		leerArchivoCliente();

		String NIT = msg.leerDatoString("Ingrese el NIT del cliente");
		String nombreProvedor = msg.leerDatoString("Ingrese el nombre del cliente");
		int precioCompra = msg.leerDatoEntero("Ingrese la direccion del cliente");
		int precioVenta = msg.leerDatoEntero("Ingrese el telefono del cliente");

		provedor.add(new ProvedorDTO(NIT, nombreProvedor, precioCompra, precioVenta));

		escribirArchivoCliente();

		msg.mostrarInformacion("El provedor fue agregado exitosamente!");
	}

	public ProvedorDTO buscarProvedorPorID() {
		leerArchivoCliente();

		String NIT = msg.leerDatoString("Ingrese el NIT del provedor");

		for(ProvedorDTO provedordto : provedor) {

			if(provedordto.getNIT().equals(NIT)) {
				return provedordto;
			}
		}
		return null;
	}

	public boolean actualizarProvedor() {
		leerArchivoCliente();
		try {
			ProvedorDTO clientedto = buscarProvedorPorID();
			if(clientedto == null) {
				return false;
			}else {
				provedor.remove(clientedto);
				crearProvedor();
				escribirArchivoCliente();
				return true;
			}

		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean borrarProvedor() {
		leerArchivoCliente();
		try {
			ProvedorDTO provedordto = buscarProvedorPorID();
			if(provedordto == null) {
				return false;
			} else{
				provedor.remove(provedordto);
				escribirArchivoCliente();
				return true;
			}

		} catch(Exception e) {
			e.printStackTrace();
			return false;
		} 
	}


	public int escribirArchivoCliente() {
		try {
			ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(f));
			salida.writeObject(provedor);
			salida.close();
		} catch (IOException e) {
			return -1;
		}
		return 0;
	}

	public int leerArchivoCliente() {
		if(f.length() != 0) {
			try {
				ObjectInputStream in = new ObjectInputStream(new FileInputStream(f));	
				provedor = (ArrayList<ProvedorDTO>)in.readObject();
				in.close();
			} catch(IOException | ClassNotFoundException e) {
				return -1;
			}
		}	
		return 0;
	}
}


