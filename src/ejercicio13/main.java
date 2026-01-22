package ejercicio13;
import java.util.Arrays;
import Ejercicio11.Lista;
public class main {
    public static void main(String[] args) {
        Pila array = new Pila();
        array.apilar(5);
        array.apilar(6);
        array.apilar(7);
        array.apilar(8);
        array.desapilar();
        array.desapilar();
        array.mostrarPila();
    }

}
