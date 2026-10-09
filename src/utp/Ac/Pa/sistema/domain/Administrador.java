package utp.Ac.Pa.sistema.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Empleado que gestiona el menú, el personal y los reportes del restaurante.
 */
public class Administrador extends Empleado {

    private int nivelAcceso;
    private List<Empleado> personal = new ArrayList<>();
    private List<Categoria> menu = new ArrayList<>();

    public Administrador(int id, String nombre, String cedula, String usuario, String clave, int nivelAcceso) {
        super(id, nombre, cedula, usuario, clave);
        this.nivelAcceso = nivelAcceso;
    }

    @Override
    public String obtenerRol() {
        // Pendiente: la lógica se implementa en el siguiente avance.
        return "";
    }

    @Override
    public double calcularDesempeno() {
        // Pendiente: la lógica se implementa en el siguiente avance.
        return 0.0;
    }

    public void registrarEmpleado(Empleado empleado) {
        // Pendiente: la lógica se implementa en el siguiente avance.
    }

    public void darDeBajaEmpleado(Empleado empleado) {
        // Pendiente: la lógica se implementa en el siguiente avance.
    }

    public void asignarTurno(Empleado empleado, Turno turno) {
        // Pendiente: la lógica se implementa en el siguiente avance.
    }

    public void agregarPlatoAlMenu(Plato plato, Categoria categoria) {
        // Pendiente: la lógica se implementa en el siguiente avance.
    }

    public double consultarDesempeno(Empleado empleado) {
        // Pendiente: la lógica se implementa en el siguiente avance.
        return 0.0;
    }

    public List<Plato> generarReportePlatosMasVendidos(Turno turno) {
        // Pendiente: la lógica se implementa en el siguiente avance.
        return new ArrayList<>();
    }

    // ----- Getters y setters -----

    public int getNivelAcceso() {
        return nivelAcceso;
    }

    public void setNivelAcceso(int nivelAcceso) {
        this.nivelAcceso = nivelAcceso;
    }

    public List<Empleado> getPersonal() {
        return personal;
    }

    public List<Categoria> getMenu() {
        return menu;
    }
}
