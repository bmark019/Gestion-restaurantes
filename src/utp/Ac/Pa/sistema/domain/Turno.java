package utp.Ac.Pa.sistema.domain;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Jornada de trabajo: empleados asignados, facturas emitidas y cierre de caja.
 */
public class Turno {

    private int id;
    private LocalDate fecha;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private boolean abierto = true;
    private List<Empleado> empleados = new ArrayList<>();
    private List<Factura> facturas = new ArrayList<>();

    public Turno(int id, LocalDate fecha, LocalTime horaInicio, LocalTime horaFin) {
        this.id = id;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public void asignarEmpleado(Empleado empleado) {
        // Pendiente: la lógica se implementa en el siguiente avance.
    }

    public void registrarFactura(Factura factura) {
        // Pendiente: la lógica se implementa en el siguiente avance.
    }

    public double calcularTotalVentas() {
        // Pendiente: la lógica se implementa en el siguiente avance.
        return 0.0;
    }

    public List<Plato> obtenerPlatosMasVendidos(int cantidad) {
        // Pendiente: la lógica se implementa en el siguiente avance.
        return new ArrayList<>();
    }

    public double cerrarTurno() {
        // Pendiente: la lógica se implementa en el siguiente avance.
        return 0.0;
    }

    // ----- Getters y setters -----

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(LocalTime horaFin) {
        this.horaFin = horaFin;
    }

    public boolean isAbierto() {
        return abierto;
    }

    public void setAbierto(boolean abierto) {
        this.abierto = abierto;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public List<Factura> getFacturas() {
        return facturas;
    }
}
