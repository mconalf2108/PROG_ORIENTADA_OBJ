package ejercicio5;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la hora inicial:");
        System.out.print("Hora: ");
        int h = sc.nextInt();
        System.out.print("Minutos: ");
        int m = sc.nextInt();
        System.out.print("Segundos: ");
        int s = sc.nextInt();

        Hora momento = new Hora(h, m, s);

        System.out.println("¿Cuántos segundos quieres sumar?");
        int n = sc.nextInt();

        System.out.println("Hora inicial: " + momento.getHoras() + ":" + momento.getMinutos() + ":" + momento.getSegundos());
        for (int i = 0; i < n; i++) {
            momento.sumarUnSegundo();
        }
    }
}
