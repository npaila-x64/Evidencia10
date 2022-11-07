package caso02;

import java.util.*;

public class Empresa {

	private Collection<Departamento> departamentos;
	private String nombre;

	public Empresa() {
		this.departamentos = new ArrayList<>();
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
	 * @param departamento
	 */
	public void addDepartamento(Departamento departamento) {
		this.departamentos.add(departamento);
	}

}