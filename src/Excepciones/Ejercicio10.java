package Excepciones;

import java.util.Scanner;

public class Ejercicio10 {
    public static Integer leerEntero() {
        Scanner sc = new Scanner(System.in);
        Integer numeroFinal = null;
        boolean exito = false;

        while (!exito) {
            try {
                System.out.println("Por favor, introduce un numero entero");
                String textoIntroducido = sc.nextLine();

                numeroFinal = Integer.parseInt(textoIntroducido);
                exito = true;

            } catch (NumberFormatException e) {
                System.out.println("ERROR : No has introducido el formato correcto");
                System.out.println("Vamos a volver a intentarlo");
            }

        } return numeroFinal;
    }


}
