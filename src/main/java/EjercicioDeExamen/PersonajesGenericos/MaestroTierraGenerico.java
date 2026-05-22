package EjercicioDeExamen.PersonajesGenericos;

import Interfaces.IMaestroTierra;
import EjercicioDeExamen.MaestroUnElemento;

/**
 * Representa a un maestro tierra genérico u ordinario.
 * Hereda de la clase {@link MaestroUnElemento} e implementa la interfaz {@link IMaestroTierra},
 * dándole acceso a las habilidades de control del elemento tierra.
 * A diferencia de los personajes predeterminados (canon), esta clase está pensada
 * para instanciar personajes personalizados creados por el usuario.
 */
public class MaestroTierraGenerico extends MaestroUnElemento implements IMaestroTierra {

    /**
     * Constructor por defecto.
     * Inicializa un maestro tierra genérico.
     * (Nota: Actualmente inicializa con los valores predeterminados de Toph).
     */
    public MaestroTierraGenerico(){
        super("Toph", "Tierra","Femenino", true, 14, 5, 79);
    }

    /**
     * Constructor parametrizado para crear un maestro tierra completamente personalizado.
     *
     * @param nombre         El nombre del maestro.
     * @param nacion         La nación de origen (Tierra).
     * @param genero         El género del personaje.
     * @param estado         El estado de actividad (true para activo).
     * @param edad           La edad en años.
     * @param nivelDeDominio El nivel de habilidad del 1 al 10.
     * @param energia        La cantidad de energía inicial.
     */
    public MaestroTierraGenerico(String nombre, String nacion, String genero, boolean estado, int edad, int nivelDeDominio, int energia){
        super(nombre, nacion, genero, estado, edad, nivelDeDominio, energia);
    }

    /**
     * Ejecuta un ataque básico de tierra.
     * Consume 20 puntos de energía por cada uso. Si después del ataque la energía
     * restante es mayor a 10, el ataque tiene éxito. Si es menor o igual a 10,
     * se llama al método verificarEnergia() para evaluar si el maestro está exhausto.
     */
    @Override
    public void atacar(){
        energia -= 20;
        if (energia > 10){
            System.out.println("Ataque de tierra");
        } else {
            // Nota: Si verificarEnergia() lanza una excepción (EnergiaInsuficienteException),
            // esta se propagará hacia arriba dependiendo de la firma del método en la clase padre.
            try {
                verificarEnergia();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    /**
     * Ejecuta la habilidad básica de manipular la tierra.
     */
    @Override
    public void controlarTierra(){
        System.out.println("Controlar tierra");
    }

    /**
     * Ejecuta la técnica avanzada de metal control.
     */
    @Override
    public void metalControl(){
        System.out.println("Controlando metal");
    }

    /**
     * Ejecuta la técnica de control de arena.
     */
    @Override
    public void controlArena(){
        System.out.println("Controlando arena");
    }

    /**
     * Ejecuta la técnica avanzada de control de lava.
     */
    public void controlLava(){
        System.out.println("Controlando lava");
    }
}
