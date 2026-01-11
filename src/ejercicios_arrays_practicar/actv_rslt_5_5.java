package ejercicios_arrays_practicar;
import java.util.Random;
import java.util.Arrays;
public class actv_rslt_5_5 {
    public static void main(String[] args) {
        Random random = new Random();
        int rellenar [];
        rellenar = rellenaPares(8,44);
        System.out.println(Arrays.toString(rellenar));
    }
    public static int  [] rellenaPares(int longitud, int fin){
        Random random = new Random();

        int pares [] = new int[longitud];
        int i = 0;
        while (i < pares.length) {
            // Generamos directamente desde 2 hasta el fin
            // Nota: 'fin - 1' si quieres incluir el valor de fin, o ajusta según necesites
            int numAleatorio = random.nextInt(fin - 2) + 2;

            if (numAleatorio % 2 == 0) { // Solo verificamos si es par
                pares[i] = numAleatorio;
                i++;
            }
        }
        Arrays.sort(pares);
        return pares;
    }



}
