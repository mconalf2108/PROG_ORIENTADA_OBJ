package ColeccionesyGenericosyMaps;

import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            int aleatorio = (int)(Math.random() * 10) + 1;
            lista.add(aleatorio);
        }
        ArrayList<Integer> lista2 = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            // 1. Sacamos el número actual de la lista original
            int numeroActual = lista.get(i);
            if (!lista2.contains(numeroActual)) {
                lista2.add(numeroActual);
            }
        }
    }
}
