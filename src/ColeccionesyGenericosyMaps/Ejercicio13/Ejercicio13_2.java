package ColeccionesyGenericosyMaps.Ejercicio13;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio13_2 {

    public static <T> List<String> saludarGrupo(T[] tabla,
                                                Saludo<T> generarSaludo ){
        List<String> listaResultados = new ArrayList<>();

        for (T elemento : tabla){
            String saludoGenerado =  generarSaludo.generar(elemento);
            listaResultados.add(saludoGenerado);
        }
        return listaResultados;
    }
}
