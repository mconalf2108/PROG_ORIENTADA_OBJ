package Ejercicio11;
import java.util.Arrays;
public class Lista {
    Integer tabla [];

    public Lista(Integer[] tabla) {
        this.tabla = new Integer[0];
    }
    public Integer getElementosInsertados(){
    return this.tabla.length;
    }
    public void insertarAlFinal(Integer num){

         (this.tabla[tabla.length] - 1)= num ;

    }
}
