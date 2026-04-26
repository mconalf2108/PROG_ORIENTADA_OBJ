package ColeccionesyGenericosyMaps.Ejercicio13;

import java.util.Arrays;
import java.util.function.Function;

public class Ejercicio13_15 {
    public static <T, V> V[] transformar(T[] original, V[] transf, Function<T, V> func) {
        for(int i = 0; i < original.length; i++){
            transf[i] =  func.apply(original[i]);
        }
        return transf;
    }
    public static void main(String[] args) {
        Integer [] numeros = new Integer[]{4,9,16,25,36};
        Double [] raices = new Double[numeros.length];
        Function<Integer, Double> calcularRaiz = num -> Math.sqrt(num);
        Double [] resultado = transformar(numeros, raices, calcularRaiz);


        System.out.println("Las raices son "+ Arrays.toString(resultado));
    }
}
