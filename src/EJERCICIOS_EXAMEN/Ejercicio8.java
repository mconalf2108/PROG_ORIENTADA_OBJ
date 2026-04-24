package EJERCICIOS_EXAMEN;

import java.util.ArrayList;

public class Ejercicio8 {
    static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(-4);
        lista.add(-5);
        lista.add(-6);
        lista.add(-7);
        lista.removeIf(numero -> numero < 0);
    }
}
