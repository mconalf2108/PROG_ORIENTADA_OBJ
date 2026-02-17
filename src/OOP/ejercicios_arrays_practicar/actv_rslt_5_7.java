package OOP.ejercicios_arrays_practicar;

public class actv_rslt_5_7 {
    public static void main(String[] args) {
        int misNumeros [] = {1, 2, 3, 4, 1, 2, 3, 4};
        misNumeros= sinRepetidos(misNumeros);
    }
    public static int[] sinRepetidos(int[] t) {
            // 1. Creamos un array temporal del mismo tamaño (por si no hubiera repetidos)
            int[] temporal = new int[t.length];
            int contadorUnicos = 0;

            // 2. Recorremos el array original
            for (int i = 0; i < t.length; i++) {
                int numeroActual = t[i];
                boolean existe = false;

                // 3. Comprobamos si este número YA lo hemos guardado en 'temporal'
                for (int j = 0; j < contadorUnicos; j++) {
                    if (temporal[j] == numeroActual) {
                        existe = true;
                        break; // Ya está, no hace falta seguir buscando
                    }
                }

                // 4. Si NO existe, lo guardamos y aumentamos el contador
                if (!existe) {
                    temporal[contadorUnicos] = numeroActual;
                    contadorUnicos++;
                }
            }

            // 5. Ahora que sabemos la cantidad exacta (contadorUnicos),
            // creamos el array final ajustado y copiamos los datos.
            int[] resultadoFinal = new int[contadorUnicos];
            for (int i = 0; i < contadorUnicos; i++) {
                resultadoFinal[i] = temporal[i];
            }

            return resultadoFinal;
        }
    }