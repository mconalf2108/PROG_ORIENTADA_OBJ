package OOP.Pelicula;

public class main {
    public static void main(String[] args) {
        Pelicula[] pelicula = new Pelicula[0];
        Catalogo miCatalogo = new Catalogo(pelicula);
        Pelicula p1 = new Pelicula("Titanic", 1997, "Drama", "James Cameron");
        Pelicula p2 = new Pelicula("Inception", 2010, "Sci-Fi", "Christopher Nolan");
        miCatalogo.agregarPelicula(p1);
        miCatalogo.buscarPeliculas("Titanic ", "TIT");
        System.out.println("La pelicula encontrada es "+ p1.getTitulo());
    }
}
