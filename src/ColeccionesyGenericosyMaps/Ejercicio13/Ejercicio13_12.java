package ColeccionesyGenericosyMaps.Ejercicio13;

import java.util.List;
import java.util.Random;

public class Ejercicio13_12 {
    static void main(String[] args) {
        List<Integer> numerosAleatorios = new Random()
                .ints(40, -20, 20)
                .boxed() // Transforma los int primitivos a Integer
                .toList();
        long cantidadPositivos = numerosAleatorios.stream()
                .filter(n -> n > 0)
                .distinct() // <-- El eliminador de duplicados
                .count();   // <-- La operación final que devuelve un número

        System.out.println("Número de elementos positivos: " + cantidadPositivos);

        long cantidadNegativos = numerosAleatorios.stream()
                .filter(n -> n < 0)
                .distinct()
                .count();

        System.out.println("Número de elementos negativos: " + cantidadNegativos);

        long cantidadRango = numerosAleatorios.stream()
                .filter(n -> n >= -10 && n <= 10)
                .count();

        System.out.println("Número de elementos entre -10 y 10: " + cantidadRango);
    }
}

