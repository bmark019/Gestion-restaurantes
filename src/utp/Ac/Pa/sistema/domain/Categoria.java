package utp.Ac.Pa.sistema.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Sección del menú que agrupa platos (entradas, platos fuertes, postres, bebidas).
 */
public class Categoria {

    private int id;
    private String nombre;
    private String descripcion;
    private List<Plato> platos = new ArrayList<>();

    public Categoria(int id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public void agregarPlato(Plato plato) {
        // Pendiente: la lógica se implementa en el siguiente avance.
    }

    public void quitarPlato(Plato plato) {
        // Pendiente: la lógica se implementa en el siguiente avance.
    }

    public List<Plato> listarPlatosDisponibles() {
        // Pendiente: la lógica se implementa en el siguiente avance.
        return new ArrayList<>();
    }

    public Plato obtenerPlatoMasVendido() {
        // Pendiente: la lógica se implementa en el siguiente avance.
        return null;
    }

    // ----- Getters y setters -----

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Plato> getPlatos() {
        return platos;
    }
}
