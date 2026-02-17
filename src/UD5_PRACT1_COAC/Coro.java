package UD5_PRACT1_COAC;

public class Coro extends AgrupacionOficial{
    int bandurrias;
    int guitarras;

    public Coro(String nombre, String autor, String autor_musica, String autor_letras, String TipoDisfraz, int puntosObtenidos, int bandurrias, int guitarras) {
        super(nombre, autor, autor_musica, autor_letras, TipoDisfraz, puntosObtenidos);
        this.bandurrias = bandurrias;
        this.guitarras = guitarras;
    }
}
