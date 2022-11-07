package caso01;

import java.util.*;

public class Nino {

	private String nombre;
	private Integer edad;
	private Mascota mascota;
	private Collection<Nino> amigos = new ArrayList<Nino>();
	private Collection<Nino> hermanos = new ArrayList<Nino>();

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}

	public void addHermano(Nino hermano) {
		hermanos.add(hermano);
	}

	public void addAmigo(Nino amigo) {
		amigos.add(amigo);
	}

}