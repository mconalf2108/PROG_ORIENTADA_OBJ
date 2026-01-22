package Ejercicio11;
import java.util.Arrays;
public class Lista {
    private Integer tabla [];



    public Lista() {
        this.tabla = new Integer[0];
    }
    public Integer getElementosInsertados(){
        return tabla.length;
    }
    public Integer getElementoPorIndice(int indice){
        return this.tabla[indice];
    }
    public Integer buscarNumero(int num){
        boolean encontrado=false;
        int i=0;
        while (i<tabla.length && !encontrado){
             if(this.tabla[i]==num){
                 encontrado=true;
             }else{
                 i++;
             }

        }
        if (encontrado) {
            return i;
        } else {
            return -1;
        }

    }

    public void insertarAlFinal(Integer num){

       Integer [] temporal=Arrays.copyOf(tabla, tabla.length+1) ;
        temporal[tabla.length] = num;
         this.tabla = temporal;
    }
    public void insertarAlPrincipio(Integer num){
        Integer [] temporal = new Integer[tabla.length+1];
        System.arraycopy(this.tabla,0,temporal,1,this.tabla.length);
        //this tabla.length al final lo que hace es evitar el error de espacio en el array, ya que empezamos
        // por uno y la cantidad es del anterior array;
        temporal[0] = num;
        this.tabla = temporal;
        }
    public void insertarNumeroPorIndice(int indice, int num){
        if (indice>=0 && indice<=tabla.length) {
            Integer[] temporal = new Integer[tabla.length + 1];
            /**for (int i = 0; i < indice; i++) {
             temporal[i] = this.tabla[i];
             }esto está bien hecho, pero no hacia falta, podemos hacer esto:**/
            System.arraycopy(this.tabla, 0, temporal, 0,indice);


            System.arraycopy(this.tabla, indice, temporal, indice + 1, (this.tabla.length - indice));
            temporal[indice] = num;
            this.tabla = temporal;
        }
    }
    public void eliminarNumeroPorIndice(int indice) {
        if (indice >= 0 && indice < tabla.length) {
            Integer[] temporal = new Integer[tabla.length - 1];
            /**for (int i = 0; i < indice; i++) {
             temporal[i] = this.tabla[i];
             }esto está bien hecho, pero no hacia falta, podemos hacer esto:**/
            System.arraycopy(this.tabla, 0, temporal, 0,indice);
            System.arraycopy(this.tabla, indice +1, temporal, indice, (tabla.length - indice-1));
            this.tabla = temporal;
        }
    }
    public void mostrarElementos() {
        System.out.println(Arrays.toString(this.tabla));
    }
    public void añadirLista(Integer [] nuevaLista){
        Integer [] listaAñadida = new Integer[nuevaLista.length + tabla.length];
        System.arraycopy(this.tabla,0,listaAñadida,0,this.tabla.length);
        System.arraycopy(nuevaLista,0,listaAñadida,tabla.length,nuevaLista.length);
        this.tabla = listaAñadida;
    }
}
