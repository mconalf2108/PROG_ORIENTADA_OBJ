package Ficheros;

import java.io.FileReader;
import java.io.IOException;

public class Ejercicio10_2 {
    public static void main(String[] args) {

        try {
            FileReader lector = new FileReader("Main.java");
            int caracter = lector.read();

            while(caracter!= -1){
                System.out.println((char) caracter);
                caracter = lector.read();
            }
            lector.close();

        }catch (IOException exception) {
            System.out.println("Error: No se ha podido leer el archivo.");
        }
    }
}
