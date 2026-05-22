package EjercicioDeExamen.PersonajesGenericos;

import Interfaces.IMaestroAire;
import EjercicioDeExamen.EnergiaInsuficienteException;
import EjercicioDeExamen.MaestroUnElemento;

/**
 * Representa a un maestro aire genérico u ordinario.
 * Hereda de la clase {@link MaestroUnElemento} e implementa la interfaz {@link IMaestroAire},
 * lo que le proporciona las habilidades de control del aire, vuelo y conexión espiritual.
 * Esta clase se utiliza para instanciar personajes de los Nómadas Aire creados
 * dinámicamente por el usuario en el sistema.
 */
public class MaestroAireGenerico extends MaestroUnElemento implements IMaestroAire {

    /**
     * Constructor por defecto.
     * Inicializa un maestro aire genérico.
     * (Nota: Actualmente inicializa con los atributos predeterminados de Aang).
     */
    public MaestroAireGenerico(){
        super("Aang", "Aire", "Masculino", true, 14, 10, 50);
    }

    /**
     * Constructor parametrizado para crear un maestro aire completamente personalizado.
     *
     * @param nombre         El nombre del maestro aire.
     * @param nacion         La nación de origen (Aire).
     * @param genero         El género del personaje.
     * @param estado         El estado vital o de actividad (true para activo).
     * @param edad           La edad en años.
     * @param nivelDeDominio El nivel de habilidad sobre el aire (del 1 al 10).
     * @param energia        La cantidad de energía inicial disponible para combatir y usar técnicas.
     */
    public MaestroAireGenerico(String nombre, String nacion, String genero, boolean estado, int edad, int nivelDeDominio, int energia){
        super(nombre, nacion, genero, estado, edad, nivelDeDominio, energia);
    }

    /**
     * Ejecuta un ataque básico de aire.
     * Consume 20 puntos de energía por uso. Posteriormente, verifica si la energía
     * restante es suficiente. Si se agota la energía, captura la excepción de
     * {@link EnergiaInsuficienteException} y la relanza como una {@link RuntimeException}.
     */
    @Override
    public void atacar(){
        try {
            energia -= 20;
            verificarEnergia();
            System.out.println("Ataque de aire");
        } catch (EnergiaInsuficienteException e) {
            // Envuelve la excepción comprobada en una excepción en tiempo de ejecución
            throw new RuntimeException(e);
        }
    }

    /**
     * Ejecuta la habilidad básica de manipular el aire.
     */
    @Override
    public void controlarAire(){
        System.out.println("Controlando aire");
    }

    /**
     * Ejecuta la técnica de vuelo (usando un planeador o por medios propios).
     */
    @Override
    public void volar(){
        System.out.println("Volar");
    }

    /**
     * Ejecuta la técnica avanzada de proyección espiritual, característica
     * de los maestros aire con gran conexión espiritual.
     */
    @Override
    public void proyeccionEspiritual(){
        System.out.println("Me proyecto");
    }

}