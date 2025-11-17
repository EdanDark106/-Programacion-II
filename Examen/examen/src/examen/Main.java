package examen;

public class Main {
    public static void main(String[] args) {
        MiTeleferico teleferico = new MiTeleferico();

        Linea amarillo = new Linea("Amarillo");
        Linea rojo = new Linea("Rojo");
        Linea verde = new Linea("Verde");

        teleferico.agregarLinea(amarillo);
        teleferico.agregarLinea(rojo);
        teleferico.agregarLinea(verde);

        amarillo.agregarCabina(1);
        amarillo.agregarCabina(2);

        Persona p1 = new Persona("Juan", 20, 70);
        Persona p2 = new Persona("Maria", 65, 60);
        Persona p3 = new Persona("Carlos", 30, 80);

        amarillo.agregarPersonaEnCabina(1, p1);
        amarillo.agregarPersonaEnCabina(2, p2);
        rojo.agregarPersonaEnCabina(1, p3);

        System.out.println("¿Cumplen todas las cabinas? " + teleferico.verificarTodasLineas());

        System.out.println("Ingreso total: " + teleferico.calcularIngresoTotal());

        Linea lineaMax = teleferico.getLineaConMasIngresoSoloRegular();
        if (lineaMax != null) {
            System.out.println("Línea con más ingreso solo tarifa regular: " + lineaMax.color);
        }
    }
}
