package caso02;

import java.util.*;

public class Casa {

	private Condominio condominio;
	private Collection<Persona> arrendadores;

	public Casa() {
		this.arrendadores = new ArrayList<>();
	}

	/**
	 * 
	 * @param arrendador
	 */
	public void addArrendador(Persona arrendador) {
		this.arrendadores.add(arrendador);
	}
}