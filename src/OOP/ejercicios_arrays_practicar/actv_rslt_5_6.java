package OOP.ejercicios_arrays_practicar;

public class actv_rslt_5_6 {
    public static void main(String[] args) {
        int []   apuesta = new int [] {1, 2, 3, 4, 5, 6};
        int []  ganadora= new int [] {6, 5, 4, 6, 7, 7};
        int aciertos = cantidadAciertos(apuesta, ganadora);
        System.out.println("aciertos = " + aciertos);
    }
    public static int cantidadAciertos (int [] apuesta, int [] ganadora){

        int aciertos=0;
        for (int i = 0; i < apuesta.length; i++) {
            for (int j = 0; j < ganadora.length; j++) {
                if(apuesta[i] == ganadora[j]){
                    aciertos++;
                    break;
                }
            }
        }
        return aciertos;
    }
}
