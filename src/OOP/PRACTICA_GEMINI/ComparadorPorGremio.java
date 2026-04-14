package OOP.PRACTICA_GEMINI;

import java.util.Comparator;

public class ComparadorPorGremio implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Personaje este = (Personaje) o1;
        Personaje otro = (Personaje) o2;

        if (este.gremio != null && otro.gremio == null) {
            return -1;
        } else if (este.gremio == null && otro.gremio != null) {
            return 1;
        } else if (este.getGremio() != null && otro.getGremio() != null) {
            int resultadoReputacion = Integer.compare(otro.getGremio().getReputacion(), este.getGremio().getReputacion());
            if (resultadoReputacion != 0) {
                return resultadoReputacion; // Si hay ganador por reputación, terminamos aquí
            }
        }
        return este.getNombre().toLowerCase().compareTo(otro.getNombre().toLowerCase());

    }
}