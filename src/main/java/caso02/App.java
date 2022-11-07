package caso02;

import static caso02.AreaDepartamento.*;

public class App {
    public static void main(String[] args) {

        Empresa empresa = new Empresa();
        empresa.setNombre("Tesoros del Mar S.A");

        Departamento deptAdquisiciones = new Departamento(ADQUISICIONES);
        GrupoDeProyecto grupoAdquisiciones = new GrupoDeProyecto();
        deptAdquisiciones.addGrupo(grupoAdquisiciones);

        Departamento deptVentas = new Departamento(VENTAS);
        GrupoDeProyecto grupoVentas = new GrupoDeProyecto();
        deptVentas.addGrupo(grupoVentas);

        Departamento deptProduccion = new Departamento(PRODUCCION);
        GrupoDeProyecto grupoProduccion = new GrupoDeProyecto();
        deptProduccion.addGrupo(grupoProduccion);

        Departamento deptLogistica = new Departamento(LOGISTICA);
        GrupoDeProyecto grupoLogistica = new GrupoDeProyecto();
        deptLogistica.addGrupo(grupoLogistica);

        Departamento deptFinanzas = new Departamento(FINANZAS);
        GrupoDeProyecto grupoFinanzas = new GrupoDeProyecto();
        deptFinanzas.addGrupo(grupoFinanzas);

        empresa.addDepartamento(deptAdquisiciones);
        empresa.addDepartamento(deptVentas);
        empresa.addDepartamento(deptProduccion);
        empresa.addDepartamento(deptLogistica);
        empresa.addDepartamento(deptFinanzas);

        Empleado agustin = new Empleado();
        agustin.setNombre("Agustín");
        grupoAdquisiciones.addEmpleado(agustin);

        Moto motoDeAgustin = new Moto();
        motoDeAgustin.setModelo("Harley Davidson 1200 Custom");

        agustin.setMoto(motoDeAgustin);

        Empleado francisco = new Empleado();
        francisco.setNombre("Francisco");

        agustin.addColega(francisco);
        francisco.addColega(agustin);


        Condominio condominio = new Condominio();
        condominio.setNombre("Nuevo Amanecer");
        Casa casaDeArriendo = new Casa();
        condominio.addCasa(casaDeArriendo);

        agustin.addCasaDeArriendo(casaDeArriendo);
        francisco.addCasaDeArriendo(casaDeArriendo);
        casaDeArriendo.addArrendador(agustin);
        casaDeArriendo.addArrendador(francisco);

        Persona andrea = new Persona();
        andrea.setNombre("Andrea");
        Moto motoDeAndrea = new Moto();
        motoDeAgustin.setModelo("Kawasaki Ninja ZX 6R 636");

        andrea.setMoto(motoDeAndrea);
    }
}
