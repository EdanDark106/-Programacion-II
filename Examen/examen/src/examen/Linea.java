package examen;

import java.util.ArrayList;
import java.util.List;

public class Linea {
    String color;
    List<Persona> filaPersona;
    List<Cabina> cabinas;
    int cantidadCabinas;

    public Linea(String color) {
        this.color = color;
        this.filaPersona = new ArrayList<>();
        this.cabinas = new ArrayList<>();
        this.cantidadCabinas = 0;
    }

    public void agregarPersona(Persona p) {
        filaPersona.add(p);
    }

    public void agregarCabina(int nroCab) {
        cabinas.add(new Cabina(nroCab));
        cantidadCabinas++;
    }

    public boolean agregarPersonaEnCabina(int nroCab, Persona p) {
        for (Cabina c : cabinas) {
            if (c.nroCabina == nroCab) {
                int personasEnCabina = 0;
                float pesoTotal = 0;
                for (Persona per : filaPersona) {
                    if (per != null) {
                        pesoTotal += per.pesoPersona;
                        personasEnCabina++;
                    }
                }
                if (personasEnCabina >= 10 || pesoTotal + p.pesoPersona > 850) {
                    return false;
                }
                return c.agregarPersona(p);
            }
        }
        return false; 
    }

    public boolean verificarCumplimiento() {
        for (Cabina c : cabinas) {
            int count = 0;
            float pesoSum = 0;
            if (c.personaAbordo != null) {
                count++;
                pesoSum += c.personaAbordo.pesoPersona;
            }
            if (count == 0 || count > 10 || pesoSum > 850) {
                return false;
            }
        }
        return true;
    }

    public float calcularIngreso() {
        float total = 0;
        for (Persona p : filaPersona) {
            if (p != null) {
                if (p.edad < 25 || p.edad > 60) {
                    total += 1.5f;
                } else {
                    total += 3f; 
                }
            }
        }
        return total;
    }
}

 