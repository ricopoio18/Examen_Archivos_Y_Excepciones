package EjercicioDeExamen.PersonajesPredeterminados;

import Interfaces.IMaestroAgua;
import EjercicioDeExamen.MaestroUnElemento;

/**
 * Representa al personaje específico Katara, una prodigio y maestra de la Tribu Agua del Sur.
 * Hereda de la clase {@link MaestroUnElemento} e implementa la interfaz {@link IMaestroAgua},
 * lo que le permite acceder a habilidades curativas, combate con agua y técnicas avanzadas.
 */
public class Katara extends MaestroUnElemento implements IMaestroAgua {

    /**
     * Constructor por defecto para Katara.
     * Llama al constructor de la clase padre (MaestroUnElemento) utilizando {@code super()}
     * para inicializar a Katara con sus atributos característicos:
     * Nombre: Katara, Nación: Agua, Género: Femenino, Estado: Activo (true),
     * Edad: 14 años, Nivel de Dominio: 5, Energía: 30.
     */
    public Katara(){
        super("Katara", "Agua", "Femenino", true, 14, 5, 30);
    }

    /**
     * Ejecuta el ataque básico de Katara.
     * Sobrescribe el método abstracto {@code atacar()} de la clase padre {@link MaestroUnElemento}.
     */
    @Override
    public void atacar(){
        System.out.println("Ataque agua");
    }

    /**
     * Ejecuta la habilidad básica de manipular el agua.
     * Implementación del método definido en la interfaz {@link IMaestroAgua}.
     */
    @Override
    public void controlarAgua(){
        System.out.println("Controlando");
    }

    /**
     * Ejecuta la técnica avanzada y prohibida de sangre control (Bloodbending).
     * Implementación del método definido en la interfaz {@link IMaestroAgua}.
     */
    @Override
    public void sagreControl(){
        System.out.println("Controlar sangre");
    }

    /**
     * Ejecuta la habilidad especial de curación utilizando el agua.
     * Implementación del método definido en la interfaz {@link IMaestroAgua}.
     */
    @Override
    public void sanar(){
        System.out.println("Sanando");
    }

    /**
     * Ejecuta la técnica de control de plantas (extrayendo o manipulando el agua en su interior).
     * Implementación del método definido en la interfaz {@link IMaestroAgua}.
     */
    @Override
    public void controlPlantas(){
        System.out.println("Controlando plantas");
    }
}
