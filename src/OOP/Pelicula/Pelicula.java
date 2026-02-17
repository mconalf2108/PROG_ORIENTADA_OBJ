package OOP.Pelicula;
public class Pelicula {
    private String titulo;
    private int lanzamiento;
    private String genero;
    private String director;
    public static final String productora = "WARNER";//FINAL ya que NO se puede modificar


    // hacemos dos constructores ya que el director puede ser opcional

    public Pelicula(String titulo, int lanzamiento, String genero, String director) {
        setTitulo(titulo);
        this.genero = genero;
        setLanzamiento(lanzamiento);
        this.director = director;
    }
    public Pelicula(String titulo, int lanzamiento, String genero) {
        this(titulo,lanzamiento,genero,"");
    }


    public void addGenero(String genero){
        if(!this.genero.toUpperCase().contains(genero.toUpperCase())) {
            this.genero = this.genero + " / " + genero;
        }
    }
    public String getTitulo() {
        return titulo;
    }
    public String getDirector() {
        return director;
    }
    public int getLanzamiento() {
        return lanzamiento;
    }
    public String getGenero() {
        return genero;
    }
    public  void setLanzamiento(int lanzamiento) {
        if(lanzamiento<1900) {
            this.lanzamiento = 1900;
        }else{
            this.lanzamiento = lanzamiento;
        }
    }
    public void setTitulo(String titulo) {
        if(30<titulo.length()){
            titulo = titulo.substring(0,30);//usamos esta función para cortar la frase hasta el caracter 30
            this.titulo = titulo;
        }else{
            this.titulo = titulo;
        }
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

}
