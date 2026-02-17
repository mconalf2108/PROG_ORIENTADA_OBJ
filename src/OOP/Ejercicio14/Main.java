package OOP.Ejercicio14;
import java.util.Arrays;
public class Main {
   Integer tabla[] = {1,2,3,4,5,6,7,8,9,10};

    public Main(Integer[] tabla) {
        this.tabla = tabla;
    }

    public void insertarAlFinal(int nuevo){
        Integer [] temporal = Arrays.copyOf(tabla,tabla.length+1);
          temporal[temporal.length -1] = nuevo;
         this.tabla = temporal;
    }
    public void mostrarPorConsola (){
        System.out.println(Arrays.toString(tabla));
    }
}
