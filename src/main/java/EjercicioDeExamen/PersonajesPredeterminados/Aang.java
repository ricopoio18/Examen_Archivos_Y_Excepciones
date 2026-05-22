package EjercicioDeExamen.PersonajesPredeterminados;

import Interfaces.IMaestroAgua;
import Interfaces.IMaestroAire;
import Interfaces.IMaestroFuego;
import Interfaces.IMaestroTierra;
import EjercicioDeExamen.MaestroUnElemento;

/**
 * Representa al personaje específico Aang, el Avatar.
 * Aunque hereda de la clase base {@link MaestroUnElemento} para reutilizar atributos,
 * su naturaleza de Avatar se refleja en la implementación simultánea de las cuatro
 * interfaces elementales: Agua, Aire, Fuego y Tierra.
 */
public class Aang extends MaestroUnElemento implements IMaestroAgua, IMaestroAire, IMaestroFuego, IMaestroTierra {

    /**
     * Constructor por defecto para Aang.
     * Llama al constructor de la clase padre utilizando {@code super()} para inicializar
     * al Avatar con sus atributos predeterminados:
     * Nombre: Aang, Nación de Origen: Aire, Género: Masculino, Estado: Activo (true),
     * Edad: 14 años, Nivel de Dominio Base: 10, Energía: 45.
     */
    public Aang(){
        super("Aang", "Aire", "Masculino", true, 14, 10, 45);
    }

    /**
     * Ejecuta el ataque básico de Aang, el cual prioriza su elemento natal (Aire).
     * Sobrescribe el método abstracto de la clase padre.
     */
    @Override
    public void atacar(){
        System.out.println("Ataque aire");
    }

    // ==========================================
    // HABILIDADES DE AGUA (IMaestroAgua)
    // ==========================================

    @Override
    public void controlarAgua(){
        System.out.println("Controlando");
    }

    /**
     * Técnica de sangre control heredada de la interfaz de agua.
     * (Nota de canon: Aang se niega a usar esta técnica por principios, pero
     * mecánicamente la posee por implementar la interfaz).
     */
    @Override
    public void sagreControl(){
        System.out.println("Controlar sangre");
    }

    @Override
    public void sanar(){
        System.out.println("Sanando");
    }

    @Override
    public void controlPlantas(){
        System.out.println("Controlando plantas");
    }

    // ==========================================
    // HABILIDADES DE AIRE (IMaestroAire)
    // ==========================================

    @Override
    public void controlarAire(){
        System.out.println("Controlando aire");
    }

    @Override
    public void volar(){
        System.out.println("Volar");
    }

    @Override
    public void proyeccionEspiritual(){
        System.out.println("Me proyecto");
    }

    // ==========================================
    // HABILIDADES DE FUEGO (IMaestroFuego)
    // ==========================================

    @Override
    public void controlarFuego(){
        System.out.println("Controlando fuego");
    }

    /**
     * Técnica de rayos heredada de la interfaz de fuego.
     * (Aang utiliza principalmente la redirección de rayos enseñada por Zuko).
     */
    @Override
    public void controlRayos(){
        System.out.println("Controlando rayos");
    }

    @Override
    public void combustion(){
        System.out.println("Combustión");
    }

    // ==========================================
    // HABILIDADES DE TIERRA (IMaestroTierra)
    // ==========================================

    @Override
    public void controlarTierra(){
        System.out.println("Controlando tierra");
    }

    @Override
    public void metalControl(){
        System.out.println("Controlando metal");
    }

    @Override
    public void controlArena(){
        System.out.println("Controlando arena");
    }

    @Override
    public void controlLava(){
        System.out.println("Control lava");
    }

}
