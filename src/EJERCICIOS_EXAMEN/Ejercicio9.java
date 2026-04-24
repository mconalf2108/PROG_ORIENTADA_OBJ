package EJERCICIOS_EXAMEN;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio9 {
    public static void main(String[] args) {
        Map<String, Integer> amigos = new HashMap<>();

        // 2. Añadimos a nuestros 3 amigos
        amigos.put("Carlos", 25);
        amigos.put("Lucia", 28);
        amigos.put("Miguel", 22);

        amigos.forEach((nombre, edad) ->
                System.out.println("Mi amigo " + nombre + " tiene " + edad + " años")
        );
    }
}
