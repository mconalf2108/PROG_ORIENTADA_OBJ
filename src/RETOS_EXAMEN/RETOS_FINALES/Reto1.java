package RETOS_EXAMEN.RETOS_FINALES;

import java.io.*;

public class Reto1 {
    public static void main(String[] args) {
        try {
            String lineas="";
            String lineasEscritas;
            int contador = 0;
            // LEER
            FileReader fr = new FileReader("server.log");
            BufferedReader br = new BufferedReader(fr);

            // ESCRIBIR
            FileWriter fw = new FileWriter("criticos.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            lineas = br.readLine();
            while (lineas != null) {

                if (lineas.contains("ERROR")) {
                    lineasEscritas = lineas.replace("[ERROR]","").toUpperCase();
                    bw.write(lineasEscritas);
                    bw.newLine();
                    contador++;
                }
                lineas = br.readLine();
            }

            bw.newLine(); // Dejamos un espacio
            bw.write("TOTAL DE ERRORES REGISTRADOS: " + contador);

            br.close();
            bw.close();
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no ha sido encontrado"+ e.getMessage());
        } catch (IOException e) {
            System.out.println("Error de lectura/escritura en el fichero: " + e.getMessage());
        }

    }
}
