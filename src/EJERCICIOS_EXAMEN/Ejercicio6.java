package EJERCICIOS_EXAMEN;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio6 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> tiendaVideojuegos = new HashMap<>();
        tiendaVideojuegos.put("Carlos duti", 1);
        tiendaVideojuegos.put("Roquet li", 2);
        tiendaVideojuegos.put("de las ofa", 3);
        tiendaVideojuegos.put("fifa 20", 4);
        tiendaVideojuegos.put("fornai ", 5);

        System.out.println("--CAMION DE REPARTO EN CAMINO---");
        System.out.println("Cual es el juego que has traido?");
        String juego = sc.nextLine();
        System.out.println("Cuanto stock tienes?");
        Integer stock = sc.nextInt();
        if (tiendaVideojuegos.containsKey(juego)) {
            System.out.println("Este juego ya existe, por lo que le sumamos el stock");
            int stockAntiguo = tiendaVideojuegos.get(juego);
            tiendaVideojuegos.put(juego, stockAntiguo + stock);
        }else{
            System.out.println("Introduciendo nuevo juego...");
            tiendaVideojuegos.put(juego, stock);

        }
    }
}
