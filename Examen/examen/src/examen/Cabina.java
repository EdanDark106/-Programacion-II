package examen;

public class Cabina {
    int nroCabina;
    Persona personaAbordo; 

    public Cabina(int nroCabina) {
        this.nroCabina = nroCabina;
        this.personaAbordo = null;
    }

    public boolean agregarPersona(Persona p) {
        if (this.personaAbordo == null) {
            this.personaAbordo = p;
            return true;
        }
        return false; 
    }
}