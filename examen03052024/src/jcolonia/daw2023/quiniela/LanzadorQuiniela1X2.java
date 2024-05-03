package jcolonia.daw2023.quiniela;

import java.util.Scanner;

/**
 * Lanzador de la aplicación de gestión de resultados deportivos de tipo 1X2.
 * 
 * @see ControladorQuiniela1X2
 * 
 * @version 1.1 (20240502000)
 * @author <a href="mailto:dmartin.jcolonia@gmail.com">David H. Martín</a>
 */
public class LanzadorQuiniela1X2 {
	/**
	 * Inicia el programa creando una instancia de la clase y activando el bucle
	 * principal de opciones. Abre el lector asociado a la entrada estándar.
	 * 
	 * @param args no se usa
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    ControladorQuiniela1X2 controlador = new ControladorQuiniela1X2();
	    controlador.buclePrincipal(scanner);
	}
}
