package ejercicio13;

import Ejercicio11.Lista;

public class Pila{
     private Lista miListaInterna;

    public  Pila() {
    this.miListaInterna  =new Lista();
    }
    public void apilar(Integer num ) {
        miListaInterna.insertarAlFinal(num);
    }
    public void desapilar(){
        if ((miListaInterna.getElementosInsertados()>0)) {
            miListaInterna.eliminarNumeroPorIndice(miListaInterna.getElementosInsertados() - 1);
        }
    }
    public void mostrarPila() {
        this.miListaInterna.mostrarElementos();
    }
}
