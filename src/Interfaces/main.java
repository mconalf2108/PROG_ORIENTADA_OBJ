package Interfaces;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        Futbolista f1 = new Futbolista("55376231Z","Mauro",18,7);
        Futbolista f2 = new Futbolista("44444444","Juan",17,6);
        Futbolista f3 = new Futbolista("33333333","Alvaro",16,5);
        Futbolista f4 = new Futbolista("22222222","Cali",15,4);
        Futbolista f5 = new Futbolista("11111111","Enucao",20,8);

        Futbolista lista [] = {f1,f2,f3,f4,f5};

        Arrays.sort(lista);

        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i].toString());
        }


        Arrays.sort(lista,new ComparadorEdad());
    }
}
