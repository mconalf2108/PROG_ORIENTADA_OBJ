package UD5_PRACT1_COAC;

public class Chirigota extends AgrupacionOficial{
    int numeroCouples;
    public Chirigota(String nombre, String autor, String autor_musica, String autor_letras, String TipoDisfraz, int puntosObtenidos, int numeroCuples) {
        super(nombre, autor, autor_musica, autor_letras, TipoDisfraz, puntosObtenidos);
        this.numeroCouples = numeroCuples;
    }
}
