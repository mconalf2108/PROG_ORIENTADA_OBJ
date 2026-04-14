package Ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio10_3 {
    public static void main(String[] args) {
        try{
            FileReader lectorBasico = new FileReader("C:\\Users\\1daw-mconalf2108\\Documents\\Prueba_Clase.sql");
            BufferedReader bufer = new BufferedReader(lectorBasico);
            String linea = bufer.readLine();

            while(linea != null){
                System.out.println(linea);
                linea = bufer.readLine();
            }
            bufer.close();
        } catch (IOException e) {
            System.out.println("Error : No se ha podido leer el archivo");
        }
    }
}
