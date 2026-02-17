package Abstraccion.EJERCICIO_4y5;

public class Piano extends Instrumento{

    @Override
    public void interpretar() {
        System.out.println("Interpretando en el piano");
        for (Nota nota : melodia) {
            System.out.println(nota + " ");
        }
        System.out.println(" ");
    }
}
