package EjercicioDeExamen.PersonajesGenericos;

import EjercicioDeExamen.EnergiaInsuficienteException;
import EjercicioDeExamen.Personaje;

/**
 * Representa a un personaje de tipo Guerrero en el sistema.
 * A diferencia de los maestros, los guerreros no dominan ningún elemento químico o de la naturaleza,
 * por lo que heredan directamente de la clase base {@link Personaje} y basan su estilo
 * de combate en el uso de un arma física equipable.
 */
public class Guerrero extends Personaje {

    /**
     * El nombre o tipo de arma que utiliza el guerrero para combatir.
     */
    private String arma;

    /**
     * Constructor por defecto.
     * Inicializa un guerrero con los atributos predeterminados del personaje Sokka:
     * Nombre: Sokka, Nación: Agua, Género: Masculino, Estado: Activo (true),
     * Edad: 16 años, Energía: 15.
     * Su arma predeterminada se establece como "boomerang".
     */
    public Guerrero(){
        super("Sokka", "Agua", "Masculino", true, 16, 15);
        arma = "boomerang";
    }

    /**
     * Constructor parametrizado para crear un guerrero completamente personalizado.
     * Permite definir tanto los atributos heredados de la persona como su arma específica.
     *
     * @param arma    El arma que portará el guerrero (ej. "Espada", "Lanza", "Garrote").
     * @param nombre  El nombre del guerrero.
     * @param nacion  La nación a la que pertenece.
     * @param genero  El género del personaje.
     * @param estado  El estado vital o de actividad (true para activo).
     * @param edad    La edad en años.
     * @param energia La cantidad de energía inicial disponible para combatir.
     */
    public Guerrero(String arma, String nombre, String nacion, String genero, boolean estado, int edad, int energia){
        super(nombre, nacion, genero, estado, edad, energia);
        this.arma = arma;
    }

    /**
     * Ejecuta la acción de ataque del guerrero utilizando su arma equipada.
     * Antes de realizar la acción, evalúa si el personaje cuenta con energía suficiente.
     * Si el nivel es menor a 10 puntos, el combate falla y se propaga una excepción.
     *
     * @throws EnergiaInsuficienteException Si el guerrero tiene menos de 10 puntos de energía.
     */
    public void atacar() throws EnergiaInsuficienteException {
        if (energia < 10) {
            throw new EnergiaInsuficienteException("Sin energía");
        }
        System.out.println("Ataque con " + arma);
    }

    /**
     * Modifica o asigna una nueva arma para el guerrero.
     * @param arma El nombre del nuevo arma a equipar.
     */
    public void setArma(String arma) {
        this.arma = arma;
    }

    /**
     * Obtiene el arma actual que tiene equipada el guerrero.
     * @return El nombre del arma en uso.
     */
    public String getArma() {
        return arma;
    }

    /**
     * Devuelve una representación en texto del guerrero.
     * Reutiliza el formato de impresión de la clase padre {@link Personaje}
     * y le concatena de forma limpia la información específica de su arma.
     *
     * @return Una cadena de texto formateada con los atributos del guerrero.
     */
    @Override
    public String toString(){
        return super.toString() +
                "\nArma: " + arma;
    }
}