package OOP.ejercicios_arrays_practicar;

public class Entregable_Ej1 {
    public static void main(String[] args) {

    }
    public int[] filtraCon7(int x[]){
        int y [] = x;
        int contadorSietes=0;                                   
        for (int i = 0; i < y.length; i++) {
            y[i] = y[i] % 10;
            if(y[i]==7){
                contadorSietes++;
            }
         
        }
        for (int i = 0; i < y.length; i++) {
            
        }
        return null;
    }

}
