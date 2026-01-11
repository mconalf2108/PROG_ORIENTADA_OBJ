package ejercicios_arrays_practicar;
import java.util.Arrays;
import java.util.Scanner;
public class actv_rslt_5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float tabla[] = new float [5];
        for (int i = 0; i <5 ; i++) {
            System.out.println("Introduzca 5 numeros por teclado");
                float num = sc.nextFloat();
                tabla[i]= num;
        }
        System.out.println("Los numeros por orden introducido son: " + Arrays.toString(tabla));

    }
}
