package ColeccionesyGenericosyMaps;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        System.out.println("Introduce numeros enteros (-1 para salir)");
        int num = sc.nextInt();
        while(num != -1){
            lista.add(num);
            num = sc.nextInt();

        }
        System.out.println("Coleccion inicial: "+lista);
        sc.close();
        System.out.println("Numeros pares:");
        for ( Integer i : lista ){
           if(i%2==0){
               System.out.println(i);
           }

        }
        System.out.println("Eliminando numeros los cuales son multiplos de 3");
        System.out.println("Eliminando múltiplos de 3 (Con Iterador)...");

// 1. Creamos el iterador enganchado a nuestra lista
        Iterator<Integer> it = lista.iterator();

// 2. El iterador pregunta: "¿Hay un siguiente elemento en la lista?"
        while (it.hasNext()) {
            Integer numero = it.next();
            // 4. Comprobamos si es múltiplo de 3
            if (numero % 3 == 0) {
                it.remove();
            }
        }

        System.out.println("Colección final: " + lista);
    }
}
