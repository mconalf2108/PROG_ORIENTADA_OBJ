import java.util.Comparator;
import java.util.List;
import java.util.Random;

public static class Ejercicio13_10 {
    public static boolean esPrimo(Integer n){
        if (n < 2) {
            return false;
        }
        return IntStream.range(2,n)
                .noneMatch(divisor -> n % divisor == 0);

    }
}

public static void main(String[] args) {
    List<Integer> numerosAleatorios = new Random()
            .ints(100, 0, 1000)
            .boxed() // Transforma los int primitivos a Integer
            .toList();

    List<Integer> listaDePrimos = numerosAleatorios.stream()
            .filter(n -> Ejercicio13_10.esPrimo(n))
            .sorted()
            .toList();
    System.out.println("Lista de primos: " + listaDePrimos);
    // Hacemos lo mismo, pero le decimos al final que cree un Array nuevo de Integers
    Integer[] tablaDePrimos = numerosAleatorios.stream()
            .filter(n -> Ejercicio13_10.esPrimo(n))
            .sorted()
            .toArray(Integer[]::new); // Terminal: "Conviértelo a una tabla nueva de Integer"

// Para imprimir Arrays clásicos enteros de golpe usamos Arrays.toString()
    System.out.println("Tabla de primos: " + java.util.Arrays.toString(tablaDePrimos));
}