package jcolonia.daw2023.quiniela;

import java.util.List;
import java.util.Scanner;

/**
 * Crea una vista para la eliminación de un partido.
 */
public class VistaDiálogoBajaPartido1X2 {

	/**
     * Scanner para la entrada de datos.
     */
    private Scanner scanner;
    
    /**
     * Título del diálogo.
     */
    private String título;


    /**
     * Constructor de la clase.
     * 
     * @param título el título del diálogo
     */
    public VistaDiálogoBajaPartido1X2(String título) {
        this.título = título;
        scanner = new Scanner(System.in);
    }

    /**
     * Solicita al usuario que seleccione el partido a eliminar.
     * 
     * @param listaPartidos la lista de partidos disponibles
     * @return la posición del partido seleccionado en la lista
     */
    public int bajaQuiniela1X2(List<String> listaPartidos) {
    	System.out.println("Selecciona el partido que deseas eliminar:");

        for (int i = 0; i < listaPartidos.size(); i++) {
            System.out.printf("%d. %s%n", i + 1, listaPartidos.get(i));
        }

        // Solicitar la selección del usuario
        int posiciónSeleccionada;
        do {
            System.out.println("Selecciona el número del partido a eliminar (0 para cancelar): ");
            posiciónSeleccionada = scanner.nextInt();
        } while (posiciónSeleccionada < 0 || posiciónSeleccionada > listaPartidos.size());

        return posiciónSeleccionada - 1;
    }

    /**
     * Pide confirmación al usuario para eliminar el partido.
     * 
     * @param partidoString muestra el partido que se va a añadir.
     * @return true si confirma la introducción, en caso contrario devolverá false.
     */
    public boolean confirmarBaja(String partidoString) {
        System.out.println("¿Desea eliminar el siguiente partido?: ");
        System.out.println(partidoString);
        System.out.printf("Confirmar S/N: ");
        String entrada = scanner.next();
        return entrada.equalsIgnoreCase("S");
    }
}