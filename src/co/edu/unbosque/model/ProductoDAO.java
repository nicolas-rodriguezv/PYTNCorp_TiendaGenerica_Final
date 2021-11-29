package co.edu.unbosque.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import co.edu.unbosque.view.Mensajes;

public class ProductoDAO {

	private Mensajes msg = new Mensajes();
	private ArrayList<ProductoDTO> producto = new ArrayList<ProductoDTO>();
	private File f;

	public ProductoDAO() {
		f = new File("./data/productos.dat");
		if(!f.exists()) {
			try{
				f.createNewFile();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void crearProducto() {
		leerArchivoProducto();

		String codigo = msg.leerDatoString("Digite el codigo del producto");
		String nombreproducto = msg.leerDatoString("Ingrese el nombre del producto");
		int cantidad = msg.leerDatoEntero("Digite la cantidad de producto");
		String nit = msg.leerDatoString("Digite el NIT del provedor");
		double precioCompra = msg.leerDatoReal("Digite el precio de venta");
		double precioTotal = msg.leerDatoReal("Digite el precio de venta");

		producto.add(new ProductoDTO(codigo, nombreproducto, nit, cantidad, precioCompra, precioTotal));

		escribirArchivoProducto();

		msg.mostrarInformacion("El producto fue agregado exitosamente!");
	}

	public ProductoDTO buscarProductoPorCodigo() {
		leerArchivoProducto();

		String codigo = msg.leerDatoString("Ingrese el codigo del producto");

		for(ProductoDTO productodto : producto) {

			if(productodto.getCodigoDelProducto().equals(codigo)) {
				return productodto;
			}
			msg.mostrarInformacionProducto(productodto);
		}
		return null;
	}

	public boolean actualizarProducto() {
		leerArchivoProducto();
		try {
			ProductoDTO productodto = buscarProductoPorCodigo();
			if(productodto == null) {
				return false;
			}else {
				producto.remove(productodto);
				crearProducto();
				escribirArchivoProducto();
				return true;
			}

		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean borrarProducto() {
		leerArchivoProducto();
		try {
			ProductoDTO productodto = buscarProductoPorCodigo();
			if(productodto == null) {
				return false;
			} else{
				producto.remove(productodto);
				escribirArchivoProducto();
				return true;
			}

		} catch(Exception e) {
			e.printStackTrace();
			return false;
		} 
	}

	public int escribirArchivoProducto() {
		try {
			ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(f));
			salida.writeObject(producto);
			salida.close();
		} catch (IOException e) {
			e.printStackTrace();
			return -1;
		}
		return 0;
	}

	public int leerArchivoProducto() {
		if(f.length() != 0) {
			try {
				ObjectInputStream in = new ObjectInputStream(new FileInputStream(f));	
				producto = (ArrayList<ProductoDTO>)in.readObject();
				in.close();
			} catch(IOException | ClassNotFoundException e) {
				e.printStackTrace();
				return -1;
			}
		}	
		return 0;
	}

	public ArrayList<ProductoDTO> getProducto() {
		return producto;
	}

}
