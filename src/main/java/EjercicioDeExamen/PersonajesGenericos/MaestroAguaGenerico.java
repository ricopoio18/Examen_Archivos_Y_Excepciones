package EjercicioDeExamen.PersonajesGenericos;

import Interfaces.IMaestroAgua;
import EjercicioDeExamen.EnergiaInsuficienteException;
import EjercicioDeExamen.MaestroUnElemento;

/**
 * Representa a un maestro agua genérico u ordinario.
 * Hereda de la clase {@link MaestroUnElemento} e implementa la interfaz {@link IMaestroAgua},
 * otorgándole habilidades curativas, de combate y de control del agua en sus distintas formas.
 * Esta clase está diseñada para instanciar personajes de la Tribu Agua creados
 * dinámicamente por el usuario.
 */
public class MaestroAguaGenerico extends MaestroUnElemento implements IMaestroAgua{

    /**
     * Constructor por defecto.
     * Inicializa un maestro agua genérico.
     * (Nota: Actualmente inicializa con los atributos predeterminados de Katara).
     */
    public MaestroAguaGenerico(){
        super("Katara", "Agua","Femenino", true, 14, 5, 30);
    }

    /**
     * Constructor parametrizado para crear un maestro agua completamente personalizado.
     *
     * @param nombre         El nombre del maestro agua.
     * @param nacion         La nación de origen (Agua).
     * @param genero         El género del personaje.
     * @param estado         El estado vital o de actividad (true para activo).
     * @param edad           La edad en años.
     * @param nivelDeDominio El nivel de habilidad sobre el agua (del 1 al 10).
     * @param energia        La cantidad de energía inicial disponible.
     */
    public MaestroAguaGenerico(String nombre, String nacion, String genero, boolean estado, int edad, int nivelDeDominio, int energia){
        super(nombre, nacion, genero, estado, edad, nivelDeDominio, energia);
    }

    /**
     * Ejecuta un ataque básico de agua.
     * El ataque consume 20 puntos de energía. Luego del ataque, verifica si el personaje
     * tiene energía suficiente para continuar. Si la energía cae a niveles críticos,
     * captura la excepción {@link EnergiaInsuficienteException} y la relanza como
     * una {@link RuntimeException}.
     */
    @Override
    public void atacar(){
        energia -= 20;
        System.out.println("Ataque de agua");
        try {
            verificarEnergia();
        } catch (EnergiaInsuficienteException e) {
            // Envuelve la excepción comprobada en una excepción en tiempo de ejecución
            throw new RuntimeException(e);
        }
    }

    /**
     * Ejecuta la habilidad básica de manipular el agua.
     */
    @Override
    public void controlarAgua(){
        System.out.println("Controlando");
    }

    /**
     * Ejecuta la técnica avanzada y prohibida de sangre control (Bloodbending).
     * (Nota: Recuerda corregir el nombre a sangreControl() en la interfaz si lo deseas).
     */
    @Override
    public void sagreControl(){
        System.out.println("Controlar sangre");
    }

    /**
     * Ejecuta la habilidad especial de curación utilizando el agua.
     */
    @Override
    public void sanar(){
        System.out.println("Sanando");
    }

    /**
     * Ejecuta la técnica de control de plantas (manipulando el agua en su interior).
     */
    @Override
    public void controlPlantas(){
        System.out.println("Controlando plantas");
    }
}
