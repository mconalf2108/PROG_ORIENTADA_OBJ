package Colecciones;

import java.util.*;

public class Ejercicio12_10 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            int aleatorio = (int)(Math.random() * 10) + 1;
            lista.add(aleatorio);
        }
        System.out.println("Lista principal: " + lista);

        Set<Integer> sinRepetir = new HashSet<>(lista);
        Set<Integer> conRepetidos = new HashSet<>();
        Set<Integer> numerosUnicos = new HashSet<>();

        for (Integer numero : lista) {
            if(Collections.frequency(lista, numero) > 1){
               conRepetidos.add(numero);
            }else if(Collections.frequency(lista, numero) == 1){
                numerosUnicos.add(numero);
            }
        }
        System.out.println("Con repetidos: " + conRepetidos);
        System.out.println("Sin repetidos: " + sinRepetir);
        System.out.println("lista con numeros únicos: " + numerosUnicos);
    }
}
