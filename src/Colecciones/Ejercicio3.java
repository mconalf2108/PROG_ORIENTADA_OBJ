package Colecciones;

import java.util.ArrayList;

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            int aleatorio = (int)(Math.random() * 10) + 1;
            lista.add(aleatorio);
        }
        System.out.println("La lista antes de eliminar es : " + lista);
        ArrayList<Integer> lista2 = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            int numeroActual = lista.get(i);
            if (!lista2.get(i).equals(numeroActual)) {
                lista2.add(numeroActual);
            }
            System.out.println("La lista despues de eliminar es : " + lista2);
        }
    }
}
