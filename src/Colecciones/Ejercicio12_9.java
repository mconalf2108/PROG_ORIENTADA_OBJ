package Colecciones;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio12_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       ArrayList<Integer> lista = new ArrayList<>();
       int num = 0;
       while(!(num <0)){
           System.out.println("Introduzca un numero positivo (negativo para salir)");
            num =  sc.nextInt();
            if(num >= 0){
                lista.add(num);
            }
       }
       for (int i = 0; i < lista.size(); i++){
           int valorActual = lista.get(i);
           if( valorActual % 2 == 0){
               System.out.println(i * 100);
           }
       }
    }
}
