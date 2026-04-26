import java.util.stream.IntStream;

public class Ejercicio13_9 {
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
    System.out.println("Primos de mayor a menor");
    numerosAleatorios.stream()
            .filter(n -> Ejercicio13_9.esPrimo(n))
            .sorted()
            .forEach(n -> System.out.println(n+ " "));
    System.out.println("Primos de menor a mayor");
    numerosAleatorios.stream()
            .filter(n -> Ejercicio13_9.esPrimo(n))
            .sorted(Comparator.reverseOrder())
            .forEach(n -> System.out.println(n+ " "));
    System.out.println("Primos entre 200 y 800");
    numerosAleatorios.stream()
            .filter(n -> Ejercicio13_9.esPrimo(n))
            .filter(n -> n>=200 && n<800)
            .forEach(n-> System.out.println(n+" "));
}