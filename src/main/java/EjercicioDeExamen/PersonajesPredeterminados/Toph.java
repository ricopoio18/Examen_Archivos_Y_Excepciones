package EjercicioDeExamen.PersonajesPredeterminados;

import Interfaces.IMaestroTierra;
import EjercicioDeExamen.MaestroUnElemento;

/**
 * Representa al personaje específico Toph Beifong, una prodigio de la Nación de la Tierra.
 * Hereda de la clase {@link MaestroUnElemento} e implementa la interfaz {@link IMaestroTierra},
 * lo que le permite utilizar habilidades desde el control básico de tierra hasta
 * técnicas avanzadas como el metal control.
 */
public class Toph extends MaestroUnElemento implements IMaestroTierra {

    /**
     * Constructor por defecto para Toph.
     * Llama al constructor de la clase padre (MaestroUnElemento) utilizando {@code super()}
     * para inicializar a Toph con sus atributos característicos:
     * Nombre: Toph, Nación: Tierra, Género: Femenino, Estado: Activo (true),
     * Edad: 14 años, Nivel de Dominio: 5, Energía: 79.
     */
    public Toph(){
        super("Toph", "Tierra","Femenino", true, 14, 5, 79);
    }

    /**
     * Ejecuta el ataque básico de Toph.
     * Sobrescribe el método abstracto {@code atacar()} de la clase padre {@link MaestroUnElemento}.
     */
    @Override
    public void atacar(){
        System.out.println("Ataque tierra");
    }

    /**
     * Ejecuta la habilidad básica de manipular la tierra.
     * Implementación del método definido en la interfaz {@link IMaestroTierra}.
     */
    @Override
    public void controlarTierra(){
        System.out.println("Controlar tierra");
    }

    /**
     * Ejecuta la técnica avanzada de metal control.
     * Implementación del método definido en la interfaz {@link IMaestroTierra}.
     * (Nota: Toph es la inventora y la más grande maestra de esta técnica).
     */
    @Override
    public void metalControl(){
        System.out.println("Controlando metal");
    }

    /**
     * Ejecuta la técnica de control de arena.
     * Implementación del método definido en la interfaz {@link IMaestroTierra}.
     */
    @Override
    public void controlArena(){
        System.out.println("Controlando arena");
    }

    /**
     * Ejecuta la técnica avanzada de control de lava.
     * (Técnica especial de los maestros tierra).
     */
    public void controlLava(){
        System.out.println("Controlando lava");
    }
}
