package EjercicioDeExamen;
//Clase para lanzar las excepciones
public class EnergiaInsuficienteException extends RuntimeException {
    public EnergiaInsuficienteException(String message) {
        super(message);
    }
}
