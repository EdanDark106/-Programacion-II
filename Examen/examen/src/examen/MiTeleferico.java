package examen;

import java.util.ArrayList;
import java.util.List;

public class MiTeleferico {
    List<Linea> lineas;

    public MiTeleferico() {
        lineas = new ArrayList<>();
    }

    public void agregarLinea(Linea l) {
        lineas.add(l);
    }

    public float calcularIngresoTotal() {
        float total = 0;
        for (Linea l : lineas) {
            total += l.calcularIngreso();
        }
        return total;
    }

    public Linea getLineaConMasIngresoSoloRegular() {
        Linea maxLinea = null;
        float maxIngreso = -1;
        for (Linea l : lineas) {
            float ingresoRegular = 0;
            for (Persona p : l.filaPersona) {
                if (p != null && !(p.edad < 25 || p.edad > 60)) {
                    ingresoRegular += 3;
                }
            }
            if (ingresoRegular > maxIngreso) {
                maxIngreso = ingresoRegular;
                maxLinea = l;
            }
        }
        return maxLinea;
    }

    public boolean verificarTodasLineas() {
        for (Linea l : lineas) {
            if (!l.verificarCumplimiento()) {
                return false;
            }
        }
        return true;
    }
}