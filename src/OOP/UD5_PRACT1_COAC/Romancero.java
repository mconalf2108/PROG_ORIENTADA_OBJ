package OOP.UD5_PRACT1_COAC;

public class Romancero extends Agrupacion {
    String tematicaCartelon;

    public Romancero(String nombre, String autor, String autor_musica, String autor_letras, String TipoDisfraz, int puntosObtenidos, int numeroMiembros, String tematicaCartelon) {
        super(nombre, autor, autor_musica, autor_letras, TipoDisfraz);
        this.tematicaCartelon = tematicaCartelon;
    }
    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentación de la Chirigota con nombre " + this.nombre);
    }

    @Override
    public void hacer_tipo() {
        System.out.println("El" + this.nombre + " va de " + this.TipoDisfraz);
    }

}
