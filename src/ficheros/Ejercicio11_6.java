package ficheros;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ejercicio11_6 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("cancionPirata.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            String cancion = ois.readUTF();
            System.out.println(cancion);


        ois.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
