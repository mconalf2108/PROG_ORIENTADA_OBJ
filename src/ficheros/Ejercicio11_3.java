package ficheros;

import java.io.*;
import java.util.Scanner;

public class Ejercicio11_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero entero ");
            int num = sc.nextInt();
        System.out.println("Dame "+num+ " de tipo double");

        double tabla [] = new double[num];
        for (int i = 0; i < tabla.length; i++) {
            System.out.println("numero " + (i+1)+ ":");
                double numero = sc.nextDouble();
                tabla[i] = num;
        }
        try {
            FileOutputStream fos = new FileOutputStream("Tabladoubles.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (int i = 0; i < tabla.length; i++) {
                    oos.writeDouble(tabla[i]);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: No se ha podido encontrar el archivo 'notas.dat'.");
        } catch (IOException e) {
            System.out.println("Error de lectura/escritura en el fichero: " + e.getMessage());
        }
    }
}
