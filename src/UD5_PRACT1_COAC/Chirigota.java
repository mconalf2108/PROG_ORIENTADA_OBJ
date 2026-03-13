package UD5_PRACT1_COAC;

public class Chirigota extends AgrupacionOficial{
    int numeroCouples;
    public Chirigota(String nombre, String autor, String autor_musica, String autor_letras, String TipoDisfraz, int puntosObtenidos, int numeroCuples) {
        super(nombre, autor, autor_musica, autor_letras, TipoDisfraz, puntosObtenidos);
        this.numeroCouples = numeroCuples;
    }
    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentación de la Chirigota con nombre " + this.nombre);
    }

    @Override
    public void hacer_tipo() {
        System.out.println("La Chirigota " + this.nombre + " va de " + this.TipoDisfraz);
    }

    @Override
    public void caminito_del_falla() {

    }
}
