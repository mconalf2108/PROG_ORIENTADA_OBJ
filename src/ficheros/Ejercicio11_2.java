package ficheros;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Ejercicio11_2 {
    public static void main(String[] args){
        try {
            FileOutputStream fos = new FileOutputStream("cancionPirata.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            String estrofa = "Con diez cañones por banda,\n" +
                    "viento en popa a toda vela,\n" +
                    "no corta el mar, sino vuela\n" +
                    "un velero bergantín.";

            oos.writeUTF(estrofa);
            oos.close();

        } catch (IOException e) {
            System.out.println("Error el documento no puede ser descifrado"+ e.getMessage());
        }
    }
}
