package Colecciones;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Ejercicio4 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            int aleatorio = (int)(Math.random() * 10) + 1;
            lista.add(aleatorio);
        }
        //Volcamos el arrayList en un array normal
        Integer [] tabla = lista.toArray(new Integer[0]);

        // 1. La ordenamos de MENOR a MAYOR
        Arrays.sort(tabla);

ç        ArrayList<Integer> listaMenorMayor = new ArrayList<>(Arrays.asList(tabla));
        System.out.println("Ordenada de menor a mayor: " + listaMenorMayor);


// 3. La ordenamos de MAYOR a MENOR
        Arrays.sort(tabla, Collections.reverseOrder());

// 4. Volvemos a recrear la colección con la tabla invertida
        ArrayList<Integer> listaMayorMenor = new ArrayList<>(Arrays.asList(tabla));
        System.out.println("Ordenada de mayor a menor: " + listaMayorMenor);
    }
}
