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
    Integrante temporal[] = new Integrante[lista.length];

    public void insertar_integrante(Integrante i) {
        for (int i1 = 0; i1 < this.lista.length; i1++) {
            this.temporal = Arrays.copyOf(this.lista, this.lista.length + 1);
            this.temporal[i1] = i;
            this.lista = this.temporal;
        }
    }
    public boolean eliminar_integrante(Integrante i){
        boolean exito = false;
        int indice=0;
        int pos =0;
        while(!exito){
            if(i.equals(lista[indice])){
                exito=true;
                pos = indice;
            }indice++;
        }
        Integrante temporal[] = new Integrante[lista.length-1];
        System.arraycopy(this.lista,0,temporal,0,pos);
        System.arraycopy(this.lista,pos,temporal,pos+1,this.lista.length-1-pos);
        lista = temporal;
        return exito;
    }

}

