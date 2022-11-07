package caso02;

import java.util.*;

public class Departamento {

	private Empresa empresa;
	private Collection<GrupoDeProyecto> grupos;
	private AreaDepartamento area;

	public Departamento(AreaDepartamento area) {
		this.grupos = new ArrayList<>();
		setArea(area);
	}

	/**
	 * 
	 * @param area
	 */
	public void setArea(AreaDepartamento area) {
		this.area = area;
	}

	/**
	 * 
	 * @param grupo
	 */
	public void addGrupo(GrupoDeProyecto grupo) {
		this.grupos.add(grupo);
	}

	public Departamento() {
		// TODO - implement Departamento.Departamento
		throw new UnsupportedOperationException();
	}

}