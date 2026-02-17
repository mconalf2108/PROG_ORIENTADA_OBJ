package UD5_PRACT1_COAC;

public abstract class Agrupacion {
    String nombre;
    String autor;
    String autor_musica;
    String autor_letras;
    String TipoDisfraz;

    public Agrupacion(String nombre, String autor, String autor_musica, String autor_letras,String TipoDisfraz) {
        this.nombre = nombre;
        this.autor = autor;
        this.autor_musica = autor_musica;
        this.autor_letras = autor_letras;
        this.TipoDisfraz= TipoDisfraz;
    }
    public void cantar_la_presentacion(){
        System.out.println("Cantando la presentacion de "+this.nombre);
    }
}
