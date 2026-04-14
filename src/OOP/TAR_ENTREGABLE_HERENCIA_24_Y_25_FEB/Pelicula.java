package OOP.TAR_ENTREGABLE_HERENCIA_24_Y_25_FEB;

public class Pelicula extends Multimedia{
    private String director;
    private int duracion;
    private String productora;
    private String pais;

    public Pelicula(String titulo, int anio, String director, int duracion, String productora, String pais) {
        super(titulo, anio); // ¡El padre se encarga del ID, el título y el año!
        this.director = director;
        this.duracion = duracion;
        this.productora = productora;
        this.pais = pais;
    }

    public String getDirector() {
        return director;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getProductora() {
        return productora;
    }

    public String getPais() {
        return pais;
    }
}
