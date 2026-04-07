package ExamenUD5_Ejercicio2;

import java.io.*;

public class ApartadoA{
    public static void main(String[] args) {




    }
    void ordenarPalabras(String nomFichero){
        try {
            String lineas = "";
            String lineasEscritas = "";
            int contador = 0;
            FileReader fr = new FileReader(nomFichero);
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter("nuevoArchivo.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            lineas = br.readLine();
            while (lineas != null) {
                System.out.println("ordenando alfaticamente");
                bw.write(lineasEscritas);
                bw.newLine();

            }
        } catch (FileNotFoundException e) {
            System.out.println("No existe el archivo");
        } catch (IOException e) {
            System.out.println("Error en el archivo");
        }
    }

}
