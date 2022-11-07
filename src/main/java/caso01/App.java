package caso01;

public class App {
    public static void main(String[] args) {

        Escuela escuela = new Escuela();

        Nino sofia = new Nino();
        sofia.setNombre("Sofía");
        sofia.setEdad(6);
        escuela.addNino(sofia);

        Perro firulais = new Perro();
        firulais.setNombre("Firulais");
        firulais.setColor("café");
        sofia.setMascota(firulais);
        firulais.addDueno(sofia);

        Nino pablo = new Nino();
        pablo.setNombre("Pablo");
        pablo.setEdad(10);
        escuela.addNino(pablo);

        pablo.setMascota(firulais);
        firulais.addDueno(pablo);

        sofia.addHermano(pablo);
        pablo.addHermano(sofia);

        Nino pedro = new Nino();
        pedro.setNombre("Pedro");
        pedro.setEdad(10);
        escuela.addNino(pedro);

        pedro.addAmigo(pablo);
        pablo.addAmigo(pedro);

        Gato misifus = new Gato();
        misifus.setNombre("Misifus");
        misifus.setCaracter("muy malo");
        pedro.setMascota(misifus);
        misifus.addDueno(pedro);
    }
}

