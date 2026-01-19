package Ejercicio8;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bombilla b1Salon = new Bombilla();
        Bombilla b2Cocina = new Bombilla();

        boolean saberEstadoBombilla;
        b1Salon.encenderBombilla();
        Bombilla.activarGeneral();
        b1Salon.estaLuciendo();
        b1Salon.saberEstado();
    }
}
