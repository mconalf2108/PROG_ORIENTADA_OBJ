package UD5_PRACT1_COAC;

public class Comparsa extends AgrupacionOficial {
    String empresaAtrezzo;
    public Comparsa(String nombre, String autor, String autor_musica, String autor_letras, String TipoDisfraz, int puntosObtenidos, String empresaAtrezzo) {
        super(nombre, autor, autor_musica, autor_letras, TipoDisfraz, puntosObtenidos);
        this.empresaAtrezzo = empresaAtrezzo;
    }


}
