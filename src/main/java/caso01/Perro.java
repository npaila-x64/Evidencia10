package caso01;

public class Perro extends Mascota {
	private String color;

	public void ladrar() {
		System.out.println("wof!");
	}

	public void comer() {
		System.out.println("estoy comiendo");
	}

	public void setColor(String color) {
		this.color = color;
	}
}