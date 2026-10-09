package utp.Ac.Pa.sistema.domain;

import java.time.LocalDateTime;

/**
 * Comprobante de cobro de un pedido, con impuesto, total y método de pago.
 */
public class Factura {

    private int numero;
    private LocalDateTime fecha = LocalDateTime.now();
    private Pedido pedido;
    private double subtotal;
    private double impuesto;
    private double total;
    private String metodoPago;
    private boolean pagada;

    public Factura(int numero, Pedido pedido) {
        this.numero = numero;
        this.pedido = pedido;
    }

    public double calcularImpuesto() {
        // Pendiente: la lógica se implementa en el siguiente avance.
        return 0.0;
    }

    public double calcularTotal() {
        // Pendiente: la lógica se implementa en el siguiente avance.
        return 0.0;
    }

    public void registrarPago(String metodoPago) {
        // Pendiente: la lógica se implementa en el siguiente avance.
    }

    public String generarComprobante() {
        // Pendiente: la lógica se implementa en el siguiente avance.
        return "";
    }

    // ----- Getters y setters -----

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }
}
