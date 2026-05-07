package ExamenClase;

import java.util.Comparator;

public class ordenarPorDorsal implements Comparator {
    /**
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return
     */
    @Override
    public int compare(Object o1, Object o2) {
        Jugador j1 = (Jugador) o1;
        Jugador j2 = (Jugador) o2;
        return j1.getNombre().compareToIgnoreCase(j2.getNombre());
    }
}
