package OOP.TAR_ENTREGABLE_HERENCIA_24_Y_25_FEB;

public class Libro extends Multimedia {
    String autor;
    String editorial;
    String identificador;
    int numPaginas;

    public Libro(String titulo, int anio,String autor, String editorial, String identificador, int numPaginas) {
        super(titulo,anio);
        this.autor = autor;
        this.editorial = editorial;
        this.identificador = identificador;
        this.numPaginas = numPaginas;
    }
}
