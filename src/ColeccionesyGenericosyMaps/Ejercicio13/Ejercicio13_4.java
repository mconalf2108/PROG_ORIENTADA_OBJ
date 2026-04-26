package ColeccionesyGenericosyMaps.Ejercicio13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Ejercicio13_4 {
    public static <T> List<T> filtrarTabla(T [] tablaD, Predicate<T> predicado) {
        List<T> resultado = new ArrayList<>();
        for (T elemento : tablaD) {
            if (predicado.test(elemento)) {
                resultado.add(elemento);
            }
        }
        return resultado;
    }
    public static void main(String[] args) {
        Integer[] numeros =new Integer [100];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i+1;
        }
        Predicate<Integer> condicionMultiplode3 = numero -> numero % 3 == 0;
        List<Integer> tablaFiltrada = filtrarTabla(numeros , condicionMultiplode3);
        System.out.println("Los multiplos de 3 son "+ tablaFiltrada);

    }
}
