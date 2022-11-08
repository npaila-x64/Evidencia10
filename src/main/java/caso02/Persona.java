package caso02;

import java.util.*;

public class Persona {

	private Collection<Persona> amigos;
	private Casa arriendo;
	private Moto moto;
	private String nombre;

	public Persona() {
		this.amigos = new ArrayList<Persona>();
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
	 * @param amigo
	 */
	public void addAmigo(Persona amigo) {
		// TODO - implement Persona.addAmigo
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param moto
	 */
	public void setMoto(Moto moto) {
		this.moto = moto;
	}

	/**
	 * 
	 * @param casa
	 */
	public void addCasaDeArriendo(Casa casa) {
		this.arriendo = casa;
	}

}