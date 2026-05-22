package EjercicioDeExamen;

/**
 * Representa la clase base para todos los personajes del sistema.
 * Contiene los atributos y comportamientos fundamentales que todo personaje debe tener,
 * como su información básica y la gestión de su energía.
 */
public class Personaje {
    protected String nombre;
    protected String nacion;
    protected String genero;
    protected boolean estado; // true = activo/vivo, false = inactivo/derrotado
    protected int edad;
    protected int energia;

    /**
     * Constructor parametrizado para crear un personaje con valores específicos.
     *
     * @param nombre  El nombre del personaje.
     * @param nacion  La nación a la que pertenece el personaje (ej. Fuego, Agua, Tierra, Aire).
     * @param genero  El género del personaje.
     * @param estado  El estado vital o de actividad del personaje (true para activo).
     * @param edad    La edad del personaje en años.
     * @param energia El nivel de energía inicial del personaje.
     */
    public Personaje(String nombre, String nacion, String genero, boolean estado, int edad, int energia){
        this.nombre = nombre;
        this.nacion = nacion;
        this.genero = genero;
        this.estado = estado;
        this.edad = edad;
        this.energia = energia;
    }

    /**
     * Constructor por defecto.
     * Inicializa un personaje genérico con valores predeterminados.
     */
    public Personaje(){
        nombre = "Aang";
        nacion = "Agua";
        genero = "Femenino";
        estado = true;
        edad = 20;
        energia = -1;
    }

    /**
     * Obtiene el nombre del personaje.
     * @return El nombre actual del personaje.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece un nuevo nombre para el personaje.
     * @param nombre El nuevo nombre a asignar.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la nación del personaje.
     * @return La nación actual.
     */
    public String getNacion(){
        return nacion;
    }

    /**
     * Establece la nación del personaje.
     * @param nacion La nueva nación a asignar.
     */
    public void setNacion(String nacion) {
        this.nacion = nacion;
    }

    /**
     * Obtiene el género del personaje.
     * @return El género actual.
     */
    public String getGenero(){
        return genero;
    }

    /**
     * Establece el género del personaje.
     * @param genero El nuevo género a asignar.
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * Obtiene el estado del personaje.
     * @return true si está activo, false en caso contrario.
     */
    public boolean getEstado(){
        return estado;
    }

    /**
     * Establece el estado del personaje.
     * @param estado true para activo, false para inactivo.
     */
    public void setEstado(boolean estado){
        this.estado = estado;
    }

    /**
     * Obtiene la edad del personaje.
     * @return La edad en años.
     */
    public int getEdad(){
        return edad;
    }

    /**
     * Establece la edad del personaje.
     * @param edad La nueva edad a asignar.
     */
    public void setEdad(int edad){
        this.edad = edad;
    }

    /**
     * Establece el nivel de energía del personaje.
     * @param energia El nivel de energía a asignar.
     */
    public void setEnergia(int energia){
        this.energia = energia;
    }

    /**
     * Obtiene el nivel de energía actual del personaje.
     * @return La cantidad de energía.
     */
    public int getEnergia(){
        return energia;
    }

    /**
     * Verifica si la energía del personaje está en niveles críticos o inválidos.
     * * @throws EnergiaInsuficienteException Si la energía es menor a 10 pero mayor a 0 (requiere descanso),
     * o si la energía es menor a 0 (energía negativa).
     */
    public void verificarEnergia() throws EnergiaInsuficienteException {
        if (energia < 10 && energia > 0) {
            throw new EnergiaInsuficienteException("¡El maestro necesita descansar y meditar!");
        }
        else if (energia < 0) {
            throw new EnergiaInsuficienteException("Energia negativa");
        }
    }

    /**
     * Devuelve una representación en formato de cadena (String) de los datos del personaje.
     * * @return Una cadena de texto con los atributos del personaje formateados con saltos de línea.
     */
    public String toString(){
        return "\nNombre: " + nombre +
                "\nNacion: " + nacion +
                "\nGénero: " + genero +
                "\nEstado: " + estado +
                "\nEdad: " + edad +
                "\nEnergia: " + energia;
    }
}