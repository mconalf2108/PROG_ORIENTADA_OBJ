package OOP.PRACTICA_COMPARADORES;

import java.util.Comparator;

public class ComparadorCochePorTomador implements Comparator {
    public int compare(Object o1, Object o2) {
        Coche c1 = (Coche) o1;
        Coche c2 = (Coche) o2;

        // Suponemos que el atributo tomador está en Coche (añadir getter en Coche)
        int resTomador = c1.getTomador().compareTo(c2.getTomador());

        if (resTomador != 0) {
            return resTomador;
        }

        // Si el tomador es el mismo, usamos el compareTo del Coche (orden natural)
        return c1.compareTo(c2);
    }
}