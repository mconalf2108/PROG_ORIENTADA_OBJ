package ficheros;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio11_7 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("numeros.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            Scanner sc = new Scanner(System.in);
            int num = 0;
            int i = 0;
            int [] lista = new int[0];
            while (num !=-1){
                System.out.println("Introduce un numero");
                num = sc.nextInt();
                lista= Arrays.copyOf(lista,lista.length+1);
                lista[i] = num;
                i++;

            }
            oos.writeObject(lista);
            oos.close();
            FileInputStream fis = new FileInputStream("numeros.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            int nuevaLista[] = (int[]) ois.readObject();
            System.out.println(Arrays.toString(nuevaLista));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        
    }
}
