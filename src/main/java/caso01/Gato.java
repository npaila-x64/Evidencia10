package caso01;

public class Gato extends Mascota {
	private String caracter;

	public void morder() {
		throw new UnsupportedOperationException();
	}

	public void rasgunar() {
		throw new UnsupportedOperationException();
	}

	public void setCaracter(String caracter) {
		this.caracter = caracter;
	}
}