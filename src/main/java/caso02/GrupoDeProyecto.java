package caso02;

import java.util.*;

public class GrupoDeProyecto {

	private Collection<Empleado> empleados;
	private Departamento departamento;

	public GrupoDeProyecto() {
		this.empleados = new ArrayList<>();
	}

	/**
	 * 
	 * @param empleado
	 */
	public void addEmpleado(Empleado empleado) {
		this.empleados.add(empleado);
	}

}