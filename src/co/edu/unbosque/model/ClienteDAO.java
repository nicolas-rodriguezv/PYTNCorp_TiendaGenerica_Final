package co.edu.unbosque.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import co.edu.unbosque.view.Mensajes;

public class ClienteDAO {

	private Mensajes msg = new Mensajes();
	private ArrayList<ClienteDTO> listac = new ArrayList<ClienteDTO>();
	private File f;

	public ClienteDAO() {
		f = new File("./data/clientes.dat");
		if(!f.exists()) {
			try{
				f.createNewFile();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void crearCliente() {
		leerArchivoCliente();

		String cedula = msg.leerDatoString("Ingrese la cedula del cliente");
		String nombre = msg.leerDatoString("Ingrese el nombre del cliente");
		String direccion = msg.leerDatoString("Ingrese la direccion del cliente");
		String telefono = msg.leerDatoString("Ingrese el telefono del cliente");
		String correo = msg.leerDatoString("Ingrese el correo del cliente");

		listac.add(new ClienteDTO(nombre, cedula, direccion, telefono, correo));

		escribirArchivoCliente();

		msg.mostrarInformacion("El cliente fue agregado exitosamente!");
	}

	public ClienteDTO buscarClientePorID() {
		leerArchivoCliente();

		String cedula = msg.leerDatoString("Ingrese el Cedula del cliente");

		for(ClienteDTO clientedto : listac) {

			if(clientedto.getCedula().equals(cedula)) {
				return clientedto;
			}
			msg.mostrarInformacionCliente(clientedto);
		}
		return null;
	}

	public boolean actualizarCliente() {
		leerArchivoCliente();
		try {
			ClienteDTO clientedto = buscarClientePorID();
			if(clientedto == null) {
				return false;
			}else {
				listac.remove(clientedto);
				crearCliente();
				escribirArchivoCliente();
				return true;
			}

		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean borrarCliente() {
		leerArchivoCliente();
		try {
			ClienteDTO clientedto = buscarClientePorID();
			if(clientedto == null) {
				return false;
			} else{
				listac.remove(clientedto);
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
			salida.writeObject(listac);
			salida.close();
		} catch (IOException e) {
			return -1;
		}
		return 0;
	}

	public int leerArchivoCliente() {
		if(f.length()!=0) {
			try {
				ObjectInputStream in = new ObjectInputStream(new FileInputStream(f));	
				listac = (ArrayList<ClienteDTO>)in.readObject();
				in.close();
			} catch(IOException | ClassNotFoundException e) {
				return -1;
			}
		}	
		return 0;
	}
}
