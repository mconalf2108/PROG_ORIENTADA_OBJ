package Colecciones;
import java.util.ArrayList;
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
    }
}
