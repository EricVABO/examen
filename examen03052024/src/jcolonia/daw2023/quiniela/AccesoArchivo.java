package jcolonia.daw2023.quiniela;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase para acceder a archivos de texto.
 */
public class AccesoArchivo {

    /**
     * Nombre que tendrá el archivo con el que se ralizarán las exportaciones e importaciones.
     */
    private String nombreArchivo;

    /**
     * Constructor principal de la clase.
     * 
     * @param nombreArchivo el nombre del archivo a acceder
     */
    public AccesoArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    /**
     * Escribe una lista de cadenas de texto en el archivo.
     * 
     * @param líneas la lista que se exportará al archivo seleccionado.
     * @return true si se escribe correctamente, en caso contrario devolverá false.
     */
    public boolean escribir(List<String> líneas) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            for (String línea : líneas) {
                writer.write(línea);
                writer.newLine();
            }
            return true;
        } catch (IOException e) {
            System.err.println("Error en la escritura de datos.");
            return false;
        }
    }
    
    

    /**
     * Lee el contenido del archivo y lo importa como una lista.
     * 
     * @return las líneas con el contenido del archivo.
     * @throws IOException si ocurre un error de entrada/salida al leer el archivo
     */
    public List<String> leer() throws IOException {
        List<String> líneas = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo));
        String línea;
        while ((línea = reader.readLine()) != null) {
            líneas.add(línea);
        }
        reader.close();
        return líneas;
    }
}