package utp.Ac.Pa.sistema;

import utp.Ac.Pa.sistema.utils.IOUtils;

/**
 * Clase principal del Sistema de Gestión de Restaurantes.
 * Muestra el menú con los escenarios del sistema; cada opción se conectará
 * con las clases del paquete domain en el siguiente avance.
 */
public class App {

    private static final String[] OPCIONES = {
        "Registro de pedidos por mesa",
        "Control de inventario de ingredientes",
        "Facturacion y cierre de turno",
        "Reportes de platos mas vendidos",
        "Asignacion de roles y control de desempeno",
        "Gestion de menu y personal"
    };

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = IOUtils.leerEntero("Seleccione una opcion: ");
            if (opcion >= 1 && opcion <= OPCIONES.length) {
                IOUtils.mostrarMensaje("[" + OPCIONES[opcion - 1] + "] se implementa en el siguiente avance.");
            } else if (opcion != 0) {
                IOUtils.mostrarMensaje("Opcion no valida.");
            }
        } while (opcion != 0);
        IOUtils.mostrarMensaje("Sistema finalizado.");
    }

    private static void mostrarMenu() {
        IOUtils.mostrarMensaje("");
        IOUtils.mostrarMensaje("=== SISTEMA DE GESTION DE RESTAURANTES ===");
        for (int i = 0; i < OPCIONES.length; i++) {
            IOUtils.mostrarMensaje((i + 1) + ". " + OPCIONES[i]);
        }
        IOUtils.mostrarMensaje("0. Salir");
    }
}
