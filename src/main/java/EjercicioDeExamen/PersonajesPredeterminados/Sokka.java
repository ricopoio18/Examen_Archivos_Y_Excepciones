package EjercicioDeExamen.PersonajesPredeterminados;

import EjercicioDeExamen.Personaje;

/**
 * Representa al personaje específico Sokka, un guerrero y estratega de la Tribu Agua del Sur.
 * A diferencia de los maestros, Sokka hereda directamente de la clase base {@link Personaje}.
 * Incorpora atributos únicos que reflejan su estilo de combate basado en armas y
 * su rol como el planificador del equipo.
 */
public class Sokka extends Personaje {

    /**
     * El arma principal que Sokka utiliza en combate.
     */
    private String arma;

    /**
     * La estrategia o táctica actual que Sokka ha ideado para el combate.
     */
    private String planBatalla;

    /**
     * Constructor por defecto para Sokka.
     * Inicializa a Sokka con sus características predeterminadas (canon):
     * Nombre: Sokka, Nación: Agua, Género: Masculino, Estado: Activo (true),
     * Edad: 16 años, Energía: 15.
     * Por defecto, su arma es el icónico "boomerang" y su plan de batalla es "Rodear".
     */
    public Sokka(){
        super("Sokka", "Agua", "Masculino", true, 16, 15);
        arma = "boomerang";
        planBatalla = "Rodear";
    }

    /**
     * Constructor parametrizado para instanciar a Sokka con un arma y plan específicos.
     * Sus atributos físicos y personales se mantienen fijos según su identidad,
     * pero permite equiparlo de manera diferente.
     *
     * @param arma        El arma que Sokka utilizará (ej. "Machete espacial", "Garrote").
     * @param planBatalla El plan táctico a emplear.
     */
    public Sokka(String arma, String planBatalla){
        super("Sokka", "Agua", "Masculino", true, 16, 15);
        this.arma = arma;
        this.planBatalla = planBatalla;
    }

    /**
     * Establece el arma que empuñará Sokka.
     * @param arma El nombre del arma.
     */
    public void setArma(String arma) {
        this.arma = arma;
    }

    /**
     * Obtiene el arma actual de Sokka.
     * @return El arma equipada.
     */
    public String getArma() {
        return arma;
    }

    /**
     * Define o cambia la estrategia de combate de Sokka.
     * Funciona como el método 'setter' para el atributo planBatalla.
     * @param planBatalla La nueva estrategia a seguir.
     */
    public void organizarPlanBatalla(String planBatalla) {
        this.planBatalla = planBatalla;
    }

    /**
     * Obtiene el plan de batalla actual ideado por Sokka.
     * @return El plan de batalla.
     */
    public String getPlanBatalla() {
        return planBatalla;
    }

    /**
     * Devuelve una representación en texto de Sokka, combinando la información
     * de la clase base (Personaje) con sus datos específicos (arma y plan de batalla).
     * * @return Una cadena de texto formateada con todos los atributos de Sokka.
     */
    @Override
    public String toString(){
        return super.toString() +
                "\nArma: " + arma +
                "\nPlan de batalla: " + planBatalla;
    }
}
