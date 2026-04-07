package examen_recuperacion;

public class Ejercicio2_MainAlquiler {
    public static void main(String[] args) {
        int [][] bloque = new int[5][5];

        System.out.println(calcularVecinosBloque(bloque));
    }










    public static int calcularVecinosBloque(int [][] bloque){
        int contadorVecinos = 0;
        for (int i = 0; i < bloque.length; i++){
            for (int j = 0; j < bloque[i].length; j++){
                contadorVecinos ++;
            }
        }
        System.out.println("Los vecinos que hay son : ");
        return contadorVecinos;
    }

    public static boolean comprobarDisponibilidad(int[][] bloque, int planta, int num_piso) {
        boolean disponibilidad = false;
        for (int i = 0; i < bloque.length; i++) {
            for (int j = 0; j < bloque[i].length; j++) {
                if ((bloque[i][j] == planta && bloque[i][j] == num_piso)) {
                    if (bloque[i][j] == 0) {
                        disponibilidad = true;
                    }
                }
            }
        }
        return disponibilidad;
    }
    public static int [] obtenerPisosLibresPorPlanta(int[][] bloque, int planta, int num_piso) {
        int [] pisosLibres = new int [planta];
        for (int i = 0; i < planta; i++) {
            pisosLibres[i] = bloque[i][num_piso];
        }
        return pisosLibres;
    }
    public static void imprimirPisosLibresPorPlanta(int [] libres){
        for (int i = 0; i < libres.length; i++) {
            System.out.print("Planta "+i+" "+ libres[i] + "libres");
        }
        System.out.println();
    }
    public static boolean alquilarPiso(int[][] bloque, int planta, int num_piso, int numPersonas) {
        boolean alquilado = false;
        for (int i = 0; i < bloque.length; i++) {
            for (int j = 0; j < bloque[i].length; j++) {
                if (bloque[i][j] == num_piso ) {
                    numPersonas++;
                    alquilado = true;
                }
            }
        }
        return alquilado;
    }


}
