package EJERCICIOS_EXAMEN;

import java.util.ArrayList;

public class Ejercicio7 {
    static void main(String[] args) {
        ArrayList <String> lista =  new ArrayList<>();
        lista.add("madrid");
        lista.add("sevilla");
        lista.add("barcelona");
        lista.forEach(ciudad -> System.out.println("Destino" + ciudad));
    }
}
