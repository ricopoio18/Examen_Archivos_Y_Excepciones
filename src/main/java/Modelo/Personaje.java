package Modelo;

public class Personaje{
    protected String nombre;
    protected String nacion;
    protected String genero;
    protected boolean estado;
    protected int edad;
    protected int energia;


    public Personaje(String nombre, String nacion, String genero, boolean estado, int edad, int energia){
        this.nombre = nombre;
        this.nacion = nacion;
        this.genero = genero;
        this.estado = estado;
        this.edad = edad;
        this.energia = energia;
    }

    public Personaje(){
        nombre = "Aang";
        nacion = "Agua";
        genero = "Femenino";
        estado = true;
        edad = 20;
        energia = -1;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacion(){
        return nacion;
    }
    public void setNacion(String nacion) {
        this.nacion = nacion;
    }

    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean getEstado(){
        return estado;
    }
    public void setEstado(boolean estado){
        this.estado = estado;
    }

    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setEnergia(int energia){
        this.energia = energia;
    }

    public int getEnergia(){
        return energia;
    }

    public void verificarEnergia() throws EnergiaInsuficienteException {
        if (energia < 10 && energia>0) {
            throw new EnergiaInsuficienteException("¡El maestro necesita descansar y meditar!");
        }
        else if (energia < 0) {
            throw new EnergiaInsuficienteException("Energia negativa");
        }
    }

    public String toString(){
        return "\nNombre: " + nombre +
                "\nNacion: " + nacion +
                "\nGénero: " + genero +
                "\nEstado: " + estado +
                "\nEdad: " + edad +
                "\nEnergia: " + energia;
    }
}