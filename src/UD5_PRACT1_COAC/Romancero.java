package UD5_PRACT1_COAC;

public class Romancero extends Agrupacion {
    String tematicaCartelon;

    public Romancero(String nombre, String autor, String autor_musica, String autor_letras, String TipoDisfraz, int puntosObtenidos, int numeroMiembros, String tematicaCartelon) {
        super(nombre, autor, autor_musica, autor_letras, TipoDisfraz);
        this.tematicaCartelon = tematicaCartelon;
    }
}
