package utp.Ac.Pa.sistema.domain;

/**
 * Insumo de cocina con su existencia y su stock mínimo.
 */
public class Ingrediente {

    private int codigo;
    private String nombre;
    private String unidadMedida;
    private double cantidadDisponible;
    private double stockMinimo;

    public Ingrediente(int codigo, String nombre, String unidadMedida, double cantidadDisponible, double stockMinimo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.unidadMedida = unidadMedida;
        this.cantidadDisponible = cantidadDisponible;
        this.stockMinimo = stockMinimo;
    }

    public void aumentarStock(double cantidad) {
        // Pendiente: la lógica se implementa en el siguiente avance.
    }

    public boolean descontarStock(double cantidad) {
        // Pendiente: la lógica se implementa en el siguiente avance.
        return false;
    }

    public boolean necesitaReposicion() {
        // Pendiente: la lógica se implementa en el siguiente avance.
        return false;
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

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public double getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(double cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public double getStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(double stockMinimo) {
        this.stockMinimo = stockMinimo;
    }
}
