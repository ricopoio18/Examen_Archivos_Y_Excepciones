package EjercicioDeExamen;

/**
 * Clase abstracta que representa a un personaje capaz de dominar un único elemento.
 * Hereda de la clase base {@link Personaje} y añade características específicas
 * como el nivel de maestría sobre su elemento y la capacidad de realizar ataques.
 */
public abstract class MaestroUnElemento extends Personaje {

    /**
     * Nivel de dominio o habilidad del maestro sobre su elemento.
     * Generalmente evaluado en una escala del 1 al 10.
     */
    protected int nivelDeDominio;

    /**
     * Método abstracto que define la acción de ataque del maestro.
     * Cada clase hija (por ejemplo, MaestroAguaGenerico, MaestroFuegoGenerico)
     * debe implementar obligatoriamente este método con su propia lógica de
     * daño, efectos y consumo de energía.
     */
    public abstract void atacar();

    /**
     * Constructor por defecto.
     * Inicializa un maestro de un elemento estableciendo su nivel de dominio
     * base en 1. El resto de los atributos se inicializan con el constructor
     * por defecto de la clase padre.
     */
    public MaestroUnElemento(){
        nivelDeDominio = 1;
    }

    /**
     * Constructor parametrizado para instanciar un maestro con valores específicos.
     * Hace uso de la clase padre (Personaje) para inicializar los atributos heredados.
     *
     * @param nombre         El nombre del maestro.
     * @param nacion         La nación a la que pertenece (Agua, Tierra, Fuego, Aire).
     * @param genero         El género del maestro.
     * @param estado         El estado vital o de actividad (true para activo).
     * @param edad           La edad del maestro en años.
     * @param nivelDeDominio El nivel inicial de habilidad sobre su elemento.
     * @param energia        El nivel inicial de energía disponible.
     */
    public MaestroUnElemento(String nombre, String nacion, String genero, boolean estado, int edad, int nivelDeDominio, int energia){
        super(nombre, nacion, genero, estado, edad, energia);
        this.nivelDeDominio = nivelDeDominio;
    }

    /**
     * Obtiene el nivel de dominio actual del maestro.
     * * @return El nivel de dominio como número entero.
     */
    public int getNivelDeDominio(){
        return nivelDeDominio;
    }

    /**
     * Establece un nuevo nivel de dominio para el maestro.
     * * @param nivelDeDominio El nuevo valor del nivel de dominio a asignar.
     */
    public void setNivelDeDominio(int nivelDeDominio){
        this.nivelDeDominio = nivelDeDominio;
    }

    /**
     * Incrementa el nivel de dominio del maestro en 1 unidad.
     * Incluye una validación para asegurar que el nivel de dominio
     * nunca supere el nivel máximo permitido, que en este caso es 10.
     */
    public void incrementarNivelDominio(){
        if(nivelDeDominio < 10) {
            nivelDeDominio++;
        }
    }
}

