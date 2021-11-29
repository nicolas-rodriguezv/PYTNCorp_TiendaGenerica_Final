package co.edu.unbosque.model.persistance;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Propiedades {

	private Properties prop = new Properties();
	private String archivoprop = "./Propiedades/tienda.properties";

	public Propiedades() {
		escribirPropiedades();
	}

	public int escribirPropiedades() {
		try {
			prop.setProperty("Nombre de la tienda", "STORE_NAME");
			prop.setProperty("Tipo de comercio", "TIPO_COMERCIO");
			prop.setProperty("NIT de la tienda", "STORE_NIT");
			prop.setProperty("Ciudad", "CIUDAD");
			prop.setProperty("Valor del iva", "IVA_VALUE");
			prop.setProperty("Tasa de interes", "INTEREST_VALUE");
			prop.setProperty("Banco donde esta alojada la tienda", "BANK");
			prop.setProperty("Numero de cuenta corriente del banco", "NUMBER");
			prop.setProperty("Nombre del gerente de la tienda", "NAME");

			prop.store(new FileOutputStream(archivoprop), null);
		} catch (IOException e) {
			return -1;
		}

		return 0;
	}

	public String leerPropiedades() {
		String linea = "";
		try {
			prop.load(new FileInputStream(archivoprop));

			prop.list(System.out);

			linea += "Nombre de la tienda: "+prop.getProperty("Nombre de la tienda");
			linea += "Tipo de comercio : "+prop.getProperty("Tipo de comercio");
			linea += "NIT de la tienda : "+prop.getProperty("NIT de la tienda");
			linea += "Ciudad : " +prop.getProperty("Ciudad");
			linea += "Valor del IVA : " +prop.getProperty("Valor del iva");
			linea += "Tasa de interes: "+prop.getProperty("Tasa de interes");
			linea += "Banco donde esta alojada la tienda: " +prop.getProperty("Banco donde esta alojada la tienda");
			linea += "Numero de cuenta corriente del banco: "+prop.getProperty("Numero de cuenta corriente del banco");
			linea += "Nombre del gerente de la tienda: "+prop.getProperty("Nombre del gerente de la tienda");

		} catch (IOException e) {
			return null;
		}

		return linea;
	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	public String getArchivoprop() {
		return archivoprop;
	}

	public void setArchivoprop(String archivoprop) {
		this.archivoprop = archivoprop;
	}

	

}
