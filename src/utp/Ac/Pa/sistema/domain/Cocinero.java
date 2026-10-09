package utp.Ac.Pa.sistema.domain;

/**
 * Empleado que prepara los pedidos en la cocina.
 */
public class Cocinero extends Empleado {

    private String especialidad;
    private int platosPreparados;

    public Cocinero(int id, String nombre, String cedula, String usuario, String clave, String especialidad) {
        super(id, nombre, cedula, usuario, clave);
        this.especialidad = especialidad;
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

    public boolean prepararPedido(Pedido pedido, Inventario inventario) {
        // Pendiente: la lógica se implementa en el siguiente avance.
        return false;
    }

    public void marcarPedidoListo(Pedido pedido) {
        // Pendiente: la lógica se implementa en el siguiente avance.
    }

    // ----- Getters y setters -----

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getPlatosPreparados() {
        return platosPreparados;
    }

    public void setPlatosPreparados(int platosPreparados) {
        this.platosPreparados = platosPreparados;
    }
}
