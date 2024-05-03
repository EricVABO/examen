package jcolonia.daw2023.quiniela;
import java.util.Scanner;

/**
 * Muestra el menú de la aplicación.
 */
public class VistaMenú {

	/**
	 * Lista con las distintas opciones de la aplicación.
	 */
    private String[] listaOpciones;
    
    /**
     * Pregunta asociada al menú.
     */
    private String pregunta;
    
    /**
     * Nombre del menú.
     */
    private String nombre;
    
    /**
     * La entrada de datos.
     */
    private Scanner scEntrada;

    /**
     * Constructor por defecto del menú.
     * 
     * @param nombre opción del menú.
     * @param listaOpciones las distintas opciones del menú.
     * @param scEntrada la entrada de datos.
     */
    public VistaMenú(String nombre, String[] listaOpciones, Scanner scEntrada) {
        this.nombre = nombre;
        this.listaOpciones = listaOpciones;
        this.pregunta = "Seleccione una opción:";
        this.scEntrada = scEntrada;
    }

    /**
     * Pide al usuario la selección de una opción.
     * 
     * @return la opción seleccionada.
     */
    public int pedirOpción() {
        String entrada;
        boolean entradaValida = false;
        int opcion = 0;
        
        while (!entradaValida) {
            System.out.print("\nIngrese el número de la opción: ");
            entrada = scEntrada.nextLine();
            System.out.println("");
            
            try {
                opcion = Integer.parseInt(entrada);
                if (opcion >= 0 && opcion <= listaOpciones.length) {
                	entradaValida = true;
                } else {
                    System.out.println("Opción inválida, ingrese un número válido.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida, ingrese un número.");
            }
        }
        
        return opcion;
    }

    /**
     * Muestra el título del menú.
     */
    public void mostrarTítuloPrincipal() {
        System.out.println(nombre);
        System.out.println("============================");
    }

    /**
     * Muetra las opciones del menú.
     */
    public void mostrarMenú() {
        System.out.println("Opciones disponibles:");
        for (int i = 0; i < listaOpciones.length; i++) {
        	System.out.printf("%d. %s%n", i + 1, listaOpciones[i]);
        }
        System.out.printf("%d. %s%n", 0,"salir");
    }
}