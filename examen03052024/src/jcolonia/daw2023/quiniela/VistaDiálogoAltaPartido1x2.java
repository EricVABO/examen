package jcolonia.daw2023.quiniela;

import java.util.Scanner;

/**
 * Vista: Diálogo para la introducción de un nuevo partido.
 */
public class VistaDiálogoAltaPartido1x2 {

    /**
     * Scanner para la entrada de datos.
     */
    private Scanner scanner;
    
    /**
     * Título del diálogo.
     */
    private String título;

    /**
     * Constructor principal de la clase.
     * 
     * @param título el título del diálogo
     */
    public VistaDiálogoAltaPartido1x2(String título) {
        this.título = título;
        scanner = new Scanner(System.in);
    }

    /**
     * Cuando lo llamen, mostrará el título principal del diálogo.
     */
    public void mostrarTítulo() {
        System.out.println(título);
        System.out.println("Introduce los datos del partido:");
    }

    /**
     * Solicita al usuario que ingrese los datos del partido.
     * 
     * @return un objeto `ElementoPartido1X2` con los datos ingresados por el usuario
     * @throws DatoPartido1X2Exception Si ocurre un error al introducir un dato.
     * @throws Partido1X2Exception Cuando los datos no son introducidos de forma correcta.
     */
    public ElementoPartido1X2 entradaQuiniela1X2() throws DatoPartido1X2Exception, Partido1X2Exception {
        ElementoPartido1X2 partido = new ElementoPartido1X2();
        try {
            System.out.print("Equipo local: ");
            String equipoLocal = scanner.nextLine();
            partido.setDato(equipoLocal);

            System.out.print("Equipo visitante: ");
            String equipoVisitante = scanner.nextLine();
            partido.setDato(equipoVisitante);

            System.out.println();
            System.out.println("Siendo '1' el equipo local, siendo 'X' el empate y siendo '2' el equipo visitante.");
            System.out.print("Introduzca el resultado (1, X o 2): ");
            String resultado = scanner.nextLine();
            partido.setDato(resultado);
        } catch (DatoPartido1X2Exception e) {
            throw new DatoPartido1X2Exception("Error al ingresar los datos del partido: %s" + e.getMessage());
        }

        return partido;
    }

    /**
     * Pide confirmación al usuario para agregar el partido.
     * 
     * @param partidoString muestra el partido que se va a añadir.
     * @return true si confirma la introducción, en caso contrario devolverá false.
     */
    public boolean confirmarAlta(String partidoString) {
        System.out.println("¿Desea agregar el partido?");
        System.out.println(partidoString);
        System.out.printf("Confirmar S/N: ");
        String entrada = scanner.nextLine();
        return entrada.equalsIgnoreCase("S");
    }
}