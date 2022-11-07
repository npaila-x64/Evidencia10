package caso02;

import java.util.*;

public class Empleado extends Persona {

	private Collection<Empleado> colegas;
	private GrupoDeProyecto grupo;

	public Empleado() {
		this.colegas = new ArrayList<>();
	}

	/**
	 * 
	 * @param colega
	 */
	public void addColega(Empleado colega) {
		this.colegas.add(colega);
	}

	/**
	 * 
	 * @param grupo
	 */
	public void setGrupo(GrupoDeProyecto grupo) {
		this.grupo = grupo;
	}

}