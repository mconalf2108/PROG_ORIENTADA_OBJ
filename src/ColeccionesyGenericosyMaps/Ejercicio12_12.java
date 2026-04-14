package ColeccionesyGenericosyMaps;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ejercicio12_12 {
    static void main(String[] args) {

    }
    static <E> Set<E> union(Set<E> conjunto1, Set<E> conjunto2) {
        Set<E> union = new HashSet<>();
        union.addAll(conjunto1);
        union.addAll(conjunto2);
        return union;
    }
    static <E> Set <E> interseccion(Set<E> conjunto1, Set<E> conjunto2){
        Set <E> interseccion = new HashSet<>();
        interseccion.addAll(conjunto1);
        interseccion.retainAll(conjunto2);
        return interseccion;

    }
}
