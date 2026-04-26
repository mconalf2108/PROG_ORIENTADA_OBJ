package ColeccionesyGenericosyMaps.Ejercicio13;

import java.util.Comparator;

public class ComparadorPorEdad implements Comparator<Cliente> {
    @Override
    public int compare(Cliente o1, Cliente o2) {
        if(o1.getEdad() > o2.getEdad()) {
            return 1;
        }
        else if (o1.getEdad() == o2.getEdad()) {
            return 0;
        }else{
            return -1;
        }
    }
}
