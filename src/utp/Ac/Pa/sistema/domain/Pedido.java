package utp.Ac.Pa.sistema.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Orden tomada en una mesa, con sus platos y su estado.
 */
public class Pedido {

    private int numero;
    private LocalDateTime fechaHora = LocalDateTime.now();
    private String estado = "REGISTRADO";
    private Mesa mesa;
    private Mesero mesero;
    private Cliente cliente;
    private List<DetallePedido> detalles = new ArrayList<>();

    public Pedido(int numero, Mesa mesa, Mesero mesero, Cliente cliente) {
        this.numero = numero;
        this.mesa = mesa;
        this.mesero = mesero;
        this.cliente = cliente;
    }

    public void agregarPlato(Plato plato, int cantidad, String observacion) {
        // Pendiente: la lógica se implementa en el siguiente avance.
    }

    public void quitarPlato(Plato plato) {
        // Pendiente: la lógica se implementa en el siguiente avance.
    }

    public double calcularSubtotal() {
        // Pendiente: la lógica se implementa en el siguiente avance.
        return 0.0;
    }

    public void cambiarEstado(String nuevoEstado) {
        // Pendiente: la lógica se implementa en el siguiente avance.
    }

    // ----- Getters y setters -----

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public Mesero getMesero() {
        return mesero;
    }

    public void setMesero(Mesero mesero) {
        this.mesero = mesero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<DetallePedido> getDetalles() {
        return detalles;
    }
}
