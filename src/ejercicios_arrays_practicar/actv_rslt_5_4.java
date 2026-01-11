package ejercicios_arrays_practicar;

public class actv_rslt_5_4 {
    public static void main(String[] args) {
        int[] misNumeros = {1, 2, 3, 4, 5};
        int resultado = maximo(misNumeros);
        System.out.println("resultado = " + resultado);
    }

    public static int maximo(int t[]) {
        int max = t[0];
        for (int i = 0; i < t.length; i++) {
            if (t[i] > max) {
                max = t[i];
            }
        }

        return max;
    }
}

