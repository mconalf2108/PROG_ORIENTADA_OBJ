package Ficheros;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.*;

public class Ejercicio11_1 {
    public static void main(String[] args) {
        int[] miTabla = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        try {
            FileOutputStream fos = new FileOutputStream("datos.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            for (int i = 0; i < miTabla.length; i++) {
                oos.writeInt(miTabla[i]);
            }
            oos.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error, el documento no ha sido encontrado " +e.getMessage());
        } catch (IOException e) {
            System.out.println("Error el documento no puede ser descifrado"+ e.getMessage());
        }

    }


}
