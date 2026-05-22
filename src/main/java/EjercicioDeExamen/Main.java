package EjercicioDeExamen;

import java.util.*;
import EjercicioDeExamen.PersonajesGenericos.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMap<String,Personaje> lista = ClaseArchivoPersistencia.leer("personajes.txt");
        int opcion;

        do {
            System.out.println("\n)))) MENU ((((");
            System.out.println("1. Crear Personaje");
            System.out.println("2. Cargar datos");
            System.out.println("3. Guardar y Salir");
            System.out.println("4. Ataque de personaje");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    crearPersonaje(sc, lista);
                    break;
                case 2:
                    ClaseArchivoPersistencia.mostrarArchivo("personajes.txt");
                    break;
                case 3:
                    ClaseArchivoPersistencia.escribir("personajes.txt", lista);
                    System.out.println("Datos guardados.");
                    break;
                case 4:
                    ataqueDePersonaje(sc, lista);
                    break;
            }

        } while (opcion != 3);

        sc.close();
    }

    public static void ataqueDePersonaje(Scanner sc, HashMap<String,Personaje> lista){
        System.out.println("Ingresa el nombre del personaje que atacará: ");
        String nombre = sc.nextLine();
        Personaje personaje = null;

        if (lista.containsKey(nombre)) {
            personaje = lista.get(nombre);

            // Verificamos si es maestro antes de forzar la conversión
            if (personaje instanceof MaestroUnElemento) {
                MaestroUnElemento maestro = (MaestroUnElemento) personaje;
                maestro.atacar();
                System.out.println("Energía restante de " + maestro.getNombre() + ": " + maestro.getEnergia());
            } else {
                System.out.println("Ese personaje es un Guerrero. Esta opción es solo para Maestros por ahora.");
            }

        } else {
            System.out.println("Ese personaje no existe");
        }
    }

    public static void crearPersonaje(Scanner sc, HashMap<String,Personaje> lista) {

        System.out.println("¿Tipo de personaje?");
        System.out.println("1. Maestro");
        System.out.println("2. Guerrero");

        int tipo = sc.nextInt();
        sc.nextLine();
        Personaje personaje = null;

        if (tipo == 1) {
            System.out.println("Elemento:");
            System.out.println("1. Agua");
            System.out.println("2. Tierra");
            System.out.println("3. Fuego");
            System.out.println("4. Aire");

            int elemento = sc.nextInt();
            sc.nextLine();

            switch (elemento) {
                case 1: personaje = new MaestroAguaGenerico(); break;
                case 2: personaje = new MaestroTierraGenerico(); break;
                case 3: personaje = new MaestroFuegoGenerico(); break;
                case 4: personaje = new MaestroAireGenerico(); break;
            }
        } else {
            personaje = new Guerrero();
        }

        System.out.print("Nombre: ");
        personaje.setNombre(sc.nextLine());

        System.out.print("Nacion: ");
        personaje.setNacion(sc.nextLine());

        System.out.print("Genero: ");
        personaje.setGenero(sc.nextLine());

        System.out.print("Estado: ");
        personaje.setEstado(sc.nextBoolean());

        System.out.print("Edad: ");
        personaje.setEdad(sc.nextInt());

        System.out.print("Energia: ");
        personaje.setEnergia(sc.nextInt());

        lista.put(personaje.getNombre(), personaje);
        System.out.println("Personaje creado.");

        System.out.print("¿Quieres que el personaje ataque? (s/n): ");
        String usarAtaque = sc.next();

        if (usarAtaque.equalsIgnoreCase("s")) {
            // También necesitamos validar aquí para no intentar que un guerrero ataque como maestro
            if (personaje instanceof MaestroUnElemento) {
                MaestroUnElemento maestro = (MaestroUnElemento) personaje;
                try {
                    maestro.atacar();
                } catch (Exception e) {
                    // Cambié a Exception genérica porque tu clase base no tiraba EnergiaInsuficienteException directo en el ataque
                    System.out.println("No puede atacar: " + e.getMessage());
                }
            } else {
                System.out.println("Los guerreros aún no tienen ataques especiales implementados.");
            }
        }
    }
}