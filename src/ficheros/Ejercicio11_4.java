package ficheros;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio11_4 {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("datos.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);


            int[] tabla = new int [10];

            for (int i = 0; i < tabla.length; i++) {
                tabla[i] = ois.readInt();
            }
            ois.close();
            System.out.println("Los datos recuperados son ");
            System.out.println(Arrays.toString(tabla));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
