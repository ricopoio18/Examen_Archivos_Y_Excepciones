package EjercicioDeExamen;

import java.io.*;
import java.util.*;
import EjercicioDeExamen.PersonajesGenericos.*;

/**
 * Clase de utilidad encargada de gestionar la persistencia de los datos del sistema.
 * Proporciona métodos estáticos para leer, escribir y mostrar la información de los
 * personajes en un archivo de texto, permitiendo guardar el progreso entre ejecuciones.
 */
public class ClaseArchivoPersistencia {

    @SuppressWarnings("unused")
    private String tipo; // Atributo de clase (nota: actualmente no se utiliza en los métodos estáticos)

    /**
     * Lee un archivo de texto y reconstruye un diccionario (HashMap) de personajes.
     * Analiza el archivo línea por línea esperando un formato clave-valor.
     * Instancia la clase hija correspondiente (Maestros o Guerrero) dependiendo
     * del valor leído en el campo "Tipo: ".
     *
     * @param ruta La ruta o nombre del archivo de texto a leer (ej. "personajes.txt").
     * @return Un HashMap donde la clave es el nombre del personaje y el valor es el objeto Personaje instanciado.
     */
    public static HashMap<String,Personaje> leer(String ruta) {

        HashMap<String,Personaje> lista = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(ruta))) {

            String linea;
            Personaje personaje = null;
            String tipo = "";

            while ((linea = reader.readLine()) != null) {

                linea = linea.trim();

                if (linea.startsWith("Tipo: ")) {
                    tipo = linea.split(": ")[1];

                    // Determina qué clase específica de personaje instanciar
                    switch (tipo) {
                        case "MaestroAguaGenerico":
                            personaje = new MaestroAguaGenerico();
                            break;
                        case "MaestroTierraGenerico":
                            personaje = new MaestroTierraGenerico();
                            break;
                        case "MaestroFuegoGenerico":
                            personaje = new MaestroFuegoGenerico();
                            break;
                        case "MaestroAireGenerico":
                            personaje = new MaestroAireGenerico();
                            break;
                        default:
                            personaje = new Guerrero();
                    }
                }
                else if (linea.startsWith("Nombre: ")) {
                    personaje.setNombre(linea.split(": ")[1]);
                }
                else if (linea.startsWith("Nacion: ")) {
                    personaje.setNacion(linea.split(": ")[1]);
                }
                else if (linea.startsWith("Genero: ")) {
                    personaje.setGenero(linea.split(": ")[1]);
                }
                else if (linea.startsWith("Estado: ")) {
                    personaje.setEstado(Boolean.parseBoolean(linea.split(": ")[1]));
                }
                else if (linea.startsWith("Edad: ")) {
                    personaje.setEdad(Integer.parseInt(linea.split(": ")[1]));
                }
                else if (linea.startsWith("Energia: ")) {
                    int energia = Integer.parseInt(linea.split(": ")[1]);
                    personaje.setEnergia(energia);

                    // Verifica si la energía cargada desde el archivo es válida
                    try {
                        personaje.verificarEnergia();
                    } catch (EnergiaInsuficienteException e) {
                        System.out.println(e.getMessage());
                    }
                }
                // Si encontramos una línea vacía y ya tenemos un personaje armado, lo guardamos en el mapa
                else if (linea.isEmpty() && personaje != null) {
                    lista.put(personaje.getNombre(), personaje);
                    personaje = null;
                }
            }

            // Guarda el último personaje leído en caso de que el archivo no termine con un salto de línea
            if (personaje != null) {
                lista.put(personaje.getNombre(), personaje);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return lista;
    }

    /**
     * Escribe la información de todos los personajes del HashMap en un archivo de texto.
     * El formato de escritura guarda cada atributo en una línea nueva con el prefijo
     * correspondiente, dejando una línea en blanco entre cada personaje.
     *
     * @param ruta  La ruta o nombre del archivo destino (ej. "personajes.txt").
     * @param lista El HashMap que contiene los personajes a guardar.
     */
    public static void escribir(String ruta, HashMap<String,Personaje> lista) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ruta))) {

            for (Map.Entry<String,Personaje> p: lista.entrySet()) {

                // Se utiliza getSimpleName() para guardar el nombre real de la clase hija
                writer.write("Tipo: " + p.getValue().getClass().getSimpleName());
                writer.newLine();

                writer.write("Nombre: " + p.getValue().nombre);
                writer.newLine();

                writer.write("Nacion: " + p.getValue().nacion);
                writer.newLine();

                writer.write("Genero: " + p.getValue().genero);
                writer.newLine();

                writer.write("Estado: " + p.getValue().estado);
                writer.newLine();

                writer.write("Edad: " + p.getValue().edad);
                writer.newLine();

                writer.write("Energia: " + p.getValue().energia);
                writer.newLine();

                writer.newLine(); // Línea en blanco separadora
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Lee y muestra por consola el contenido bruto de un archivo de texto.
     * Útil para verificar visualmente qué datos están guardados sin necesidad
     * de procesarlos y convertirlos en objetos.
     *
     * @param ruta La ruta o nombre del archivo de texto a leer.
     */
    public static void mostrarArchivo(String ruta) {
        try (BufferedReader reader = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}