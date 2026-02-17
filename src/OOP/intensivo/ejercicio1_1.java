package OOP.intensivo;
import java.util.Scanner;

  /**      String s1 = "Hola";
        String s2 = new String("Hola"); // Fuerza nueva memoria

        // TRAMPA: Esto compara direcciones de memoria
        if (s1 == s2) System.out.println("Mal: Usaste ==");

        // CORRECTO: Esto compara el contenido
        if (s1.equals(s2)) System.out.println("Bien: Usaste equals");

        // MODIFICACIÓN
        texto = texto.toUpperCase(); // Ahora sí
        System.out.println(texto); // "JAVA" **/
  public class ejercicio1_1 {
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          boolean esCorrecto = false;
          while (!esCorrecto ) {
              System.out.println("Introduzca tu gmail por teclado");
              String gmail = sc.next();

              if ( (gmail.toLowerCase().endsWith(".com") || gmail.toLowerCase().endsWith(".es")) && gmail.contains("@") && !gmail.contains(" ") ) {
                      System.out.println("el dominio es correcto");
                      esCorrecto=true;
                  } else {
                      System.out.println("el dominio es incorrecto");
                  }
          }
      }
}