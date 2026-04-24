package EJERCICIOS_EXAMEN;

import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("bebesita");
        lista.add("seteadora");
        lista.add("bebesita");
        lista.add("seteadora");
        lista.add("loyalty");
        lista.add("loyalty");
        Set<String> lista2 = new TreeSet<>(lista);
        System.out.println(lista2);
    }
}
