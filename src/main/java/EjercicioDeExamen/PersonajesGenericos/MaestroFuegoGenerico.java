package EjercicioDeExamen.PersonajesGenericos;

import Interfaces.IMaestroFuego;
import EjercicioDeExamen.*;

/**
 * Representa a un maestro fuego genérico u ordinario.
 * Hereda de la clase {@link MaestroUnElemento} e implementa la interfaz {@link IMaestroFuego},
 * otorgándole la capacidad de controlar el fuego y usar técnicas derivadas de este elemento.
 * Esta clase está diseñada para instanciar nuevos personajes de la Nación del Fuego
 * creados dinámicamente por el usuario.
 */
public class MaestroFuegoGenerico extends MaestroUnElemento implements IMaestroFuego{

    /**
     * Constructor por defecto.
     * Inicializa un maestro fuego genérico.
     * (Nota: Actualmente inicializa con los valores predeterminados de Zuko).
     */
    public MaestroFuegoGenerico(){
        super("Zuko", "Fuego", "Masculino", true, 16, 10,50);
    }

    /**
     * Constructor parametrizado para crear un maestro fuego completamente personalizado.
     *
     * @param nombre         El nombre del maestro fuego.
     * @param nacion         La nación de origen (Fuego).
     * @param genero         El género del personaje.
     * @param estado         El estado vital o de actividad (true para activo).
     * @param edad           La edad en años.
     * @param nivelDeDominio El nivel de habilidad sobre el fuego (del 1 al 10).
     * @param energia        La cantidad de energía inicial disponible para combatir.
     */
    public MaestroFuegoGenerico(String nombre, String nacion, String genero, boolean estado, int edad, int nivelDeDominio, int energia){
        super(nombre, nacion, genero, estado, edad, nivelDeDominio, energia);
    }

    /**
     * Ejecuta un ataque básico de fuego.
     * El ataque consume 20 puntos de energía. Posteriormente, se verifica si la energía
     * restante es suficiente para continuar peleando. Si el maestro se queda sin energía
     * (o tiene energía negativa), la excepción original se captura y se relanza como
     * una {@link RuntimeException}.
     */
    @Override
    public void atacar(){
        try {
            energia -= 20;
            verificarEnergia();
            System.out.println("Ataque de fuego");
        } catch (EnergiaInsuficienteException e) {
            // Se envuelve la excepción comprobada (checked) en una no comprobada (unchecked)
            throw new RuntimeException(e);
        }
    }

    /**
     * Ejecuta la habilidad básica de manipular el fuego.
     */
    @Override
    public void controlarFuego(){
        System.out.println("Manipular fuego");
    }

    /**
     * Ejecuta la técnica avanzada de redirección o generación de rayos.
     */
    @Override
    public void controlRayos(){
        System.out.println("Redireccionando rayos");
    }

    /**
     * Ejecuta la técnica especial y destructiva de combustión.
     */
    @Override
    public void combustion(){
        System.out.println("Ataque de combustión");
    }
}
