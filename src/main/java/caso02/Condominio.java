package caso02;

import java.util.*;

public class Condominio {

	private Collection<Casa> casas;
	private String nombre;

	public Condominio() {
		this.casas = new ArrayList<>();
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * 
	 * @param casa
	 */
	public void addCasa(Casa casa) {
		this.casas.add(casa);
	}
}