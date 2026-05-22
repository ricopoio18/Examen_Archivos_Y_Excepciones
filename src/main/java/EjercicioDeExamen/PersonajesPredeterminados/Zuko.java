package EjercicioDeExamen.PersonajesPredeterminados;

import Interfaces.IMaestroFuego;
import EjercicioDeExamen.MaestroUnElemento;

/**
 * Representa al personaje específico Zuko, un príncipe de la Nación del Fuego.
 * Hereda de la clase {@link MaestroUnElemento} e implementa la interfaz {@link IMaestroFuego},
 * lo que le otorga habilidades únicas relacionadas con el control del fuego y técnicas avanzadas.
 */
public class Zuko extends MaestroUnElemento implements IMaestroFuego {

    /**
     * Constructor por defecto para Zuko.
     * Llama al constructor de la clase padre (MaestroUnElemento) utilizando {@code super()}
     * para inicializar a Zuko con sus atributos predeterminados y característicos:
     * Nombre: Zuko, Nación: Fuego, Género: Masculino, Estado: Activo (true),
     * Edad: 16 años, Nivel de Dominio: 10, Energía: 50.
     */
    public Zuko(){
        super("Zuko", "Fuego", "Masculino", true, 16, 10, 50);
    }

    /**
     * Ejecuta el ataque básico de Zuko.
     * Sobrescribe el método abstracto {@code atacar()} de la clase padre {@link MaestroUnElemento}.
     */
    @Override
    public void atacar(){
        System.out.println("Ataque fuego");
    }

    /**
     * Ejecuta la habilidad básica de manipular el fuego.
     * Implementación del método definido en la interfaz {@link IMaestroFuego}.
     */
    @Override
    public void controlarFuego(){
        System.out.println("Manipular fuego");
    }

    /**
     * Ejecuta la técnica avanzada de redirección de rayos.
     * Implementación del método definido en la interfaz {@link IMaestroFuego}.
     * (Nota: Zuko se especializa en redireccionar rayos gracias a las enseñanzas de Iroh).
     */
    @Override
    public void controlRayos(){
        System.out.println("Redireccionando rayos");
    }

    /**
     * Ejecuta la técnica especial de combustión.
     * Implementación del método definido en la interfaz {@link IMaestroFuego}.
     */
    @Override
    public void combustion(){
        System.out.println("Ataque de combustión");
    }
}
