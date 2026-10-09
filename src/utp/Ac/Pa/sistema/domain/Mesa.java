package utp.Ac.Pa.sistema.domain;

/**
 * Mesa del restaurante, con su capacidad y su estado (libre u ocupada).
 */
public class Mesa {

    private int numero;
    private int capacidad;
    private String estado = "LIBRE";

    public Mesa(int numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }

    public void ocupar() {
        // Pendiente: la lógica se implementa en el siguiente avance.
    }

    public void liberar() {
        // Pendiente: la lógica se implementa en el siguiente avance.
    }

    public boolean estaDisponible() {
        // Pendiente: la lógica se implementa en el siguiente avance.
        return false;
    }

    // ----- Getters y setters -----

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
