package caso01;

public class Gato extends Mascota {
	private String caracter;

	public void morder() {
		System.out.println("muerde!");
	}

	public void rasgunar() {
		System.out.println("rasguña!");
	}

	public void setCaracter(String caracter) {
		this.caracter = caracter;
	}
}