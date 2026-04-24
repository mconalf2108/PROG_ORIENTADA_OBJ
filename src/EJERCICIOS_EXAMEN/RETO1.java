package EJERCICIOS_EXAMEN;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RETO1 {
    public static void main(String[] args) {
        // El diamante <> de la derecha es buena práctica dejarlo vacío
        Map<String, String> traductor = new HashMap<>();
        traductor.put("car", "coche");
        traductor.put("dog", "perro");
        traductor.put("hello", "hola");
        traductor.put("pencil", "lapiz");
        traductor.put("key", "llave");

        // 1. Preparamos el Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime una palabra en inglés para traducir:");
        String palabraBuscada = sc.nextLine();

        // 2. Comprobamos si la palabra que ha escrito el usuario existe en el Map
        if (traductor.containsKey(palabraBuscada)) {
            // Si existe, la sacamos y la mostramos
            System.out.println("Traducción: " + traductor.get(palabraBuscada));
        } else {
            // Si no existe, avisamos
            System.out.println("No existe el valor en el diccionario.");
        }
    }
}