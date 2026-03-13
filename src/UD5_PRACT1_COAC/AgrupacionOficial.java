package UD5_PRACT1_COAC;

import java.util.Arrays;
import java.util.Iterator;

public abstract class AgrupacionOficial extends Agrupacion {
    int puntosObtenidos;

    public AgrupacionOficial(String nombre, String autor, String autor_musica, String autor_letras, String TipoDisfraz, int puntosObtenidos) {
        super(nombre, autor, autor_musica, autor_letras, TipoDisfraz);
        this.puntosObtenidos = puntosObtenidos;
    }

    Integrante lista[] = new Integrante[0];

    public void insertar_integrante(Integrante i) {
        this.lista = Arrays.copyOf(this.lista, this.lista.length + 1);
        this.lista[this.lista.length - 1] = i;
    }
    public boolean eliminar_integrante(Integrante i){
        boolean exito = false;
        int indice=0;
        while(!exito && indice< lista.length){
            if(this.lista[indice].equals(i)){
                Integrante[] temporal = new Integrante[this.lista.length - 1];
                System.arraycopy(this.lista,0,temporal,0,indice);
                System.arraycopy(this.lista,indice+1,temporal,indice,this.lista.length-1);
                lista = temporal;
                exito=true;
            }indice++;
        }
        return exito;
    }
    public abstract void caminito_del_falla();

}

