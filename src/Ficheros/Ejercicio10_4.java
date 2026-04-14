package Ficheros;

//import javax.management.loading.MLetContent;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Ejercicio10_4 {
    public static void main(String[] args) {

        try{
            FileReader leerNumeros = new FileReader("NumerosReales.txt");
            Scanner sc = new Scanner(leerNumeros);

            double sumaTotal = 0;
            int contadorNum = 0;

            while (sc.hasNextDouble()){
                double numeroActual = sc.nextDouble();
                sumaTotal += numeroActual;
                contadorNum++;
            }
            sc.close();

            double mediaSuma = sumaTotal/contadorNum;
            System.out.println(mediaSuma);

        } catch (FileNotFoundException e) {
            System.out.println("Algo va mal, el archivo no existe");
        }
    }
}
