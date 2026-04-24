package EJERCICIOS_EXAMEN;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio4 {
    static void main(String[] args) {

        String frase = "Hola chavales que pasa hola que estoy al lado de casa".toLowerCase();


        Map <String,Integer> contadorPalabras = new HashMap<>();

        for (String palabra : frase.split(" ")) {
            if (contadorPalabras.containsKey(palabra)) {
                int vecesQueHaSalido = contadorPalabras.get(palabra);
                contadorPalabras.put(palabra, vecesQueHaSalido + 1);
            } else {
                contadorPalabras.put(palabra, 1);
            }
        } System.out.println(contadorPalabras);
    }
}
