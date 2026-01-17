package ejercicios_arrays_practicar;

import java.util.Arrays;
import java.util.Random;

public class actv_rslt_5_1 {
    public static void main(String[] args) {

        // 1. Crear la tabla (array) de longitud 10
        int[] tabla = new int[10];

        // Variable para acumular la suma
        int suma = 0;

        // Objeto para generar números aleatorios
        Random random = new Random();

        // 2. Recorrer la tabla para rellenarla

        for (int i = 0; i < tabla.length; i++) {
            // nextInt(100) genera de 0 a 99. Le sumamos 1 para que sea de 1 a 100.
            tabla[i] = random.nextInt(100) + 1;

            // Vamos sumando el valor actual a nuestra variable acumuladora
            suma += tabla[i];
        }

        // 3. Mostrar los resultados en la consola
        System.out.println("--- Resultados ---");
        // Arrays.toString nos ayuda a imprimir la tabla de forma legible
        System.out.println("Números generados: " + Arrays.toString(tabla));
        System.out.println("La suma total es: " + suma);
    }
}