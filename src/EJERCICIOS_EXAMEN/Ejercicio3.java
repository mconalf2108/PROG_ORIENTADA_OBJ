package EJERCICIOS_EXAMEN;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("google.com");
        lista.add("youtube.com");
        lista.add("twitch.tv");

        System.out.println("----PANTALLA DE INICIO----");
        System.out.println("Estas en " + lista.get(lista.size() - 1));
        System.out.println("PULSA 1 para retroceder");
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();

        if (opcion == 1) {
            lista.remove(lista.size() - 1);
            System.out.println("Has retrocedido, ahora estas en " + lista.get(lista.size() - 1));
        } else {
            System.out.println("Botón incorrecto.");
        }
    }
}