package OOP.RETOS_EXAMEN;

import java.io.*;
import java.util.Scanner;

public class Reto1Facil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            FileOutputStream fos = new FileOutputStream("notas.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            String nombre = "";
            double nota;
            int alumnos = 0;
            int contadorNota = 0;
            double notaAcumulada = 0;
            while(!nombre.equals("FIN")){

                System.out.println("Dame nombres de alumnos(FIN para terminar):");
                nombre = sc.next();
                if(nombre.equals("FIN")){
                    break;
                }
                oos.writeUTF(nombre);

                System.out.println("Su nota");
                nota = sc.nextDouble();
                oos.writeDouble(nota);

            }
            oos.close();
            sc.close();
                FileInputStream fis = new FileInputStream("notas.dat");
                ObjectInputStream ois = new ObjectInputStream(fis);
               try {
                   while (true){
                       nombre = ois.readUTF();
                       notaAcumulada += ois.readDouble();
                       alumnos++;
                   }

               }catch (EOFException e){
                   System.out.println("El programa ha terminado");
                   System.out.println("la nota media es de "+ (notaAcumulada/alumnos));
                   ois.close();
               }



        } catch (FileNotFoundException e) {
            System.out.println("Error: No se ha podido encontrar el archivo 'notas.dat'.");
        } catch (IOException e) {
            System.out.println("Error de lectura/escritura en el fichero: " + e.getMessage());
        }

    }
}
