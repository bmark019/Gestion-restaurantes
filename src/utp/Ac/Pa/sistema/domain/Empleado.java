package utp.Ac.Pa.sistema.domain;

/**
 * Clase base abstracta con los datos y el acceso al sistema de todo empleado del restaurante.
 */
public abstract class Empleado {

    protected int id;
    protected String nombre;
    protected String cedula;
    protected String usuario;
    private String clave;
    protected boolean activo = true;

    public Empleado(int id, String nombre, String cedula, String usuario, String clave) {
        this.id = id;
        this.nombre = nombre;
        this.cedula = cedula;
        this.usuario = usuario;
        this.clave = clave;
    }

    public boolean iniciarSesion(String usuario, String clave) {
        // Pendiente: la lógica se implementa en el siguiente avance.
        return false;
    }

    public boolean cambiarClave(String claveActual, String claveNueva) {
        // Pendiente: la lógica se implementa en el siguiente avance.
        return false;
    }

    public abstract String obtenerRol();

    public abstract double calcularDesempeno();

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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
