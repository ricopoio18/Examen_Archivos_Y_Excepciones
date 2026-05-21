package Modelo;

public abstract class MaestroUnElemento extends Personaje{

    protected int nivelDeDominio; // va de 1 a 10

    public abstract void atacar();
    public MaestroUnElemento(){
        nivelDeDominio = 1;
    }

    public MaestroUnElemento(String nombre, String nacion, String genero, boolean estado, int edad, int nivelDeDominio, int energia){
        super(nombre, nacion, genero, estado, edad, energia);
        this.nivelDeDominio = nivelDeDominio;
    }
    public int getNivelDeDominio(){
        return nivelDeDominio;
    }

    public void setNivelDeDominio(int nivelDeDominio){
        this.nivelDeDominio = nivelDeDominio;
    }

    public void incrementarNivelDominio(){
        if(nivelDeDominio < 10) nivelDeDominio++;
    }

    public void verificarEnergia() throws EnergiaInsuficienteException {
        if (energia < 10) {
            throw new EnergiaInsuficienteException("¡El maestro necesita descansar y meditar!");
        }
    }


}

