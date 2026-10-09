package utp.Ac.Pa.sistema.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Registro de los ingredientes disponibles y de sus entradas y salidas.
 */
public class Inventario {

    private List<Ingrediente> ingredientes = new ArrayList<>();
    private LocalDate fechaActualizacion = LocalDate.now();

    public Inventario() {
    }

    public void registrarIngrediente(Ingrediente ingrediente) {
        // Pendiente: la lógica se implementa en el siguiente avance.
    }

    public void registrarEntrada(Ingrediente ingrediente, double cantidad) {
        // Pendiente: la lógica se implementa en el siguiente avance.
    }

    public boolean descontarIngredientes(Plato plato, int cantidad) {
        // Pendiente: la lógica se implementa en el siguiente avance.
        return false;
    }

    public List<Ingrediente> listarIngredientesPorAgotarse() {
        // Pendiente: la lógica se implementa en el siguiente avance.
        return new ArrayList<>();
    }

    // ----- Getters y setters -----

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public LocalDate getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(LocalDate fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }
}
