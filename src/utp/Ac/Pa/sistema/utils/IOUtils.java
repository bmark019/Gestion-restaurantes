package utp.Ac.Pa.sistema.utils;

import java.util.Scanner;

/**
 * Utilidades de entrada y salida por consola que usa todo el sistema.
 */
public class IOUtils {

    private static final Scanner ENTRADA = new Scanner(System.in);

    private IOUtils() {
        // Clase de utilidades: no se crean objetos de ella.
    }

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public static String leerTexto(String mensaje) {
        System.out.print(mensaje);
        if (!ENTRADA.hasNextLine()) {
            return "";
        }
        return ENTRADA.nextLine().trim();
    }

    public static int leerEntero(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            if (!ENTRADA.hasNextLine()) {
                return 0; // sin más entrada: equivale a salir
            }
            try {
                return Integer.parseInt(ENTRADA.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Valor no valido. Escriba un numero entero.");
            }
        }
    }

    public static double leerDecimal(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            if (!ENTRADA.hasNextLine()) {
                return 0.0;
            }
            try {
                return Double.parseDouble(ENTRADA.nextLine().trim().replace(',', '.'));
            } catch (NumberFormatException e) {
                System.out.println("Valor no valido. Escriba un numero.");
            }
        }
    }
}
