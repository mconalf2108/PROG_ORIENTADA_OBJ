package UD5_PRACT1_COAC;

public class Cuarteto extends AgrupacionOficial{
    int numeroMiembros;
    public Cuarteto(String nombre, String autor, String autor_musica, String autor_letras, String TipoDisfraz, int puntosObtenidos, int numeroMiembros) {
        super(nombre, autor, autor_musica, autor_letras, TipoDisfraz, puntosObtenidos);
        this.numeroMiembros = numeroMiembros;
    }
}
