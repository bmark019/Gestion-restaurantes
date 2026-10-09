package utp.Ac.Pa.sistema.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Empleado que atiende las mesas, toma los pedidos y los cobra.
 */
public class Mesero extends Empleado {

    private List<Mesa> mesasAsignadas = new ArrayList<>();
    private int pedidosAtendidos;

    public Mesero(int id, String nombre, String cedula, String usuario, String clave) {
        super(id, nombre, cedula, usuario, clave);
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

    public void asignarMesa(Mesa mesa) {
        // Pendiente: la lógica se implementa en el siguiente avance.
    }

    public Pedido tomarPedido(Mesa mesa, Cliente cliente) {
        // Pendiente: la lógica se implementa en el siguiente avance.
        return null;
    }

    public void entregarPedido(Pedido pedido) {
        // Pendiente: la lógica se implementa en el siguiente avance.
    }

    public Factura cobrarPedido(Pedido pedido, String metodoPago) {
        // Pendiente: la lógica se implementa en el siguiente avance.
        return null;
    }

    // ----- Getters y setters -----

    public List<Mesa> getMesasAsignadas() {
        return mesasAsignadas;
    }

    public int getPedidosAtendidos() {
        return pedidosAtendidos;
    }

    public void setPedidosAtendidos(int pedidosAtendidos) {
        this.pedidosAtendidos = pedidosAtendidos;
    }
}
