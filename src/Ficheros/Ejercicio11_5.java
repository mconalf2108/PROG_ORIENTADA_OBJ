package Ficheros;

import java.io.*;

public class Ejercicio11_5 {
    public static void main(String[] args) {
        // Metemos la tabla
        try {
            FileOutputStream fos = new FileOutputStream("datos.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            int [] mitabla = {1,2,3,4,5,6,7,8,9};
            oos.writeObject(mitabla);

            // Sacamos la tabla
            FileInputStream fis = new FileInputStream("datos.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            int []tablaExtraida = (int[]) ois.readObject();

            oos.close();
            ois.close();

        } catch (FileNotFoundException e) {
            System.out.println("Carpeta no encontrada");
        } catch (ClassNotFoundException e) {
            System.out.println("ERROR clase no encontrada");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
