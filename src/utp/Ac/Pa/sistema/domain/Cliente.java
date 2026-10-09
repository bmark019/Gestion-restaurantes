package utp.Ac.Pa.sistema.domain;

/**
 * Persona que consume en el restaurante y a quien se le emite la factura.
 */
public class Cliente {

    private int id;
    private String nombre;
    private String cedula;
    private String telefono;

    public Cliente(int id, String nombre, String cedula, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
    }

    public void actualizarDatos(String nombre, String telefono) {
        // Pendiente: la lógica se implementa en el siguiente avance.
    }

    public String obtenerDatosFactura() {
        // Pendiente: la lógica se implementa en el siguiente avance.
        return "";
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

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
