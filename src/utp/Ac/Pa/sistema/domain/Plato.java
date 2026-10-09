package utp.Ac.Pa.sistema.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Producto del menú, con su precio y los ingredientes que usa.
 */
public class Plato {

    private int codigo;
    private String nombre;
    private double precio;
    private boolean disponible = true;
    private int vecesVendido;
    private List<Ingrediente> ingredientes = new ArrayList<>();

    public Plato(int codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public void agregarIngrediente(Ingrediente ingrediente) {
        // Pendiente: la lógica se implementa en el siguiente avance.
    }

    public void actualizarPrecio(double nuevoPrecio) {
        // Pendiente: la lógica se implementa en el siguiente avance.
    }

    public void registrarVenta(int cantidad) {
        // Pendiente: la lógica se implementa en el siguiente avance.
    }

    // ----- Getters y setters -----

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public int getVecesVendido() {
        return vecesVendido;
    }

    public void setVecesVendido(int vecesVendido) {
        this.vecesVendido = vecesVendido;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }
}
