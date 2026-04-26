package ColeccionesyGenericosyMaps.Ejercicio13;

import java.util.Comparator;
import java.util.List;

public class Ejercicio13_3 {
    public static <T> T valorMaximo (T[] tabla,Comparator<T> comparador){
        T maximo= tabla[0];
        for(T elemento : tabla){
            if(comparador.compare(elemento,maximo)>0){
                maximo=elemento;
            }
        }
        return maximo;
    }
}
