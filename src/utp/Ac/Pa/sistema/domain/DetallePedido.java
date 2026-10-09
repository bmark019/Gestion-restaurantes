package utp.Ac.Pa.sistema.domain;

/**
 * Línea de un pedido: un plato, su cantidad y una observación.
 */
public class DetallePedido {

    private Plato plato;
    private int cantidad;
    private String observacion;

    public DetallePedido(Plato plato, int cantidad, String observacion) {
        this.plato = plato;
        this.cantidad = cantidad;
        this.observacion = observacion;
    }

    public double calcularImporte() {
        // Pendiente: la lógica se implementa en el siguiente avance.
        return 0.0;
    }

    // ----- Getters y setters -----

    public Plato getPlato() {
        return plato;
    }

    public void setPlato(Plato plato) {
        this.plato = plato;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
}
