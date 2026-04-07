package ExamenUD5_Ejercicio2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LecturaBinario {
    public static void main(String[] args) {
        try {
            String linea ="";
            System.out.println("Iniciando lectura Binario");
            FileInputStream fis = new FileInputStream("ficheroBinario.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);

            while(true){
                System.out.println(linea);
                linea = ois.readUTF();
            }




        } catch (FileNotFoundException e) {
            System.out.println("Error en el archivo");
        } catch (IOException e) {
            System.out.println("Error en el archivo" +e.getMessage());
        }

    }
}
