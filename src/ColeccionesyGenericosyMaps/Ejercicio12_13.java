package ColeccionesyGenericosyMaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Ejercicio12_13<T> {
    Set<T> participantes =  new HashSet<T>();


    public boolean add(T elemento) {
        return participantes.add(elemento);
    }
    Set<T> premiados(int numPremiados){
        ArrayList<T> listaBarajable = new ArrayList<>(participantes);
        Collections.shuffle(listaBarajable);
        T num ;
        Set<T> combinacionGanadora = new HashSet<>();
        for (int i = 0; i < numPremiados; i++) {
             num =listaBarajable.get(i);
             combinacionGanadora.add(num);
        }
        return combinacionGanadora;
    }
}
