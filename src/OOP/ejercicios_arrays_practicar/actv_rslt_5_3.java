package OOP.ejercicios_arrays_practicar;
import java.util.Arrays;
import java.util.Scanner;

public class actv_rslt_5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantos numeros desea introducir?");
            int cantidad = sc.nextInt();
            int tabla[] = new int[cantidad];
        for (int i = tabla.length - 1; i >= 0; i--) {
            System.out.println("Escriba los numeros");
               int num = sc.nextInt();
               tabla[i] = num;
        }
        System.out.println(Arrays.toString(tabla));

    }
}
