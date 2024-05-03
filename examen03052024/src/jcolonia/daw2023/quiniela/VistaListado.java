package jcolonia.daw2023.quiniela;

import java.util.List;
import java.util.Scanner;

/**
 * Maneja la vista para el listado de los partidos.
 */
public class VistaListado {

	/**
	 * Lista con los partidos del conjunto.
	 */
	private List<String> líneas;
	
	/**
	 * Escáner de entrada de datos.
	 */
	private Scanner scEntrada;

	/**
     * Título del diálogo.
     */
    private String título;

	/**
	 * Constructor por defecto de la clase.
	 * @param título el título del diálogo
	 * 
	 * @param ConjuntoDePartidos la lista de equipos a mostrar.
	 * @param scEntrada la entrada de datos.
	 */
	public VistaListado( String título, List<String> ConjuntoDePartidos, Scanner scEntrada) {
		this.líneas = ConjuntoDePartidos;
		this.scEntrada = scEntrada;
		
	}
	/**
     * Cuando lo llamen, mostrará el título principal del diálogo.
     */
    public void mostrarTítulo() {
        System.out.println(título);
        System.out.println("Introduce los datos del partido:");
    }

	/**
	 * Muestra el listado de partidos.
	 */
	public void listar() {
		int líneaInicio, líneaFin, líneaActual;

		if (líneas.isEmpty()) {
			System.out.println("No hay partidos para mostrar");
		}

		líneaInicio = 0;
		while (líneaInicio < líneas.size()) { 
			líneaFin = Math.min(líneaInicio + 10, líneas.size());
			for (líneaActual = líneaInicio; líneaActual < líneaFin; líneaActual++) {
				System.out.printf("%03d) %s%n", líneaActual, líneas.get(líneaActual));
			}
			líneaInicio = líneaFin;
			System.out.println(
					"Pulse cualquier tecla para mostrar el siguiente grupo de partidos, o pulse 'Q' para salir del visionado de partidos:");
			scEntrada.nextLine();
		}
		System.out.printf("No hay mas partidos para mostrar \n");
		System.out.printf("Pulse 'Enter' para salir del visionado de partidos\n\n");
		scEntrada.nextLine();
	}
	
	/**
	 * Muestra el listado con un formato.
	 * @param líneas los distintos equipos del conjunto.
	 */
	public static void mostrar(List<String> líneas) {
	    for (int i = 0; i < líneas.size(); i++) {
	        System.out.printf("%03d) %s%n", i, líneas.get(i));
	    }
	}
}
