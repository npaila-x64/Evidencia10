package caso01;

import java.util.*;

public class Mascota {

	private Collection<Nino> duenos = new ArrayList<Nino>();
	private String nombre;

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void addDueno(Nino nino) {
		duenos.add(nino);
	}
}