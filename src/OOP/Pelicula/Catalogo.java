package OOP.Pelicula;

import java.util.Arrays;
public class Catalogo {
    Pelicula[] arrayPelis;

    public Catalogo(Pelicula[] arrayPelis) {
        this.arrayPelis = arrayPelis;
    }
    public boolean agregarPelicula(Pelicula p ){
        int i = 0;
        boolean encontrado = false;
        boolean insertado = false;

        while (i<arrayPelis.length && !encontrado){
            if (this.arrayPelis[i].getTitulo().equalsIgnoreCase(p.getTitulo())) {
                encontrado = true;
            }i++;
        }
        if(!encontrado){
            this.arrayPelis = Arrays.copyOf(this.arrayPelis, this.arrayPelis.length + 1);
            this.arrayPelis[arrayPelis.length -1] = p;
            insertado = true;
        }

        return insertado;
    }
    public void listarPeliculas(){
        for (int i = 0; i < this.arrayPelis.length; i++) {
            System.out.println("   PELICULA #"+(i+1));
            System.out.println("Titulo: "+this.arrayPelis[i].getTitulo() );
            System.out.println("Director: " +this.arrayPelis[i].getDirector() );
            System.out.println("Año: " + this.arrayPelis[i].getLanzamiento());
            System.out.println("Genero " + this.arrayPelis[i].getGenero());
        }

    }
    Pelicula [] buscarPeliculas(String cadenaAlBuscar, String campo) {
        Pelicula [] resultado = new Pelicula[0];
        String cadenaAlBuscarMayus = cadenaAlBuscar.toUpperCase();
        for (int i = 0; i < arrayPelis.length; i++) {
            boolean encontrado = false;

            if(campo.equals("DIR") && this.arrayPelis[i].getDirector().toUpperCase().contains(cadenaAlBuscarMayus)){
                encontrado = true;
                System.out.println("Pelicula" +this.arrayPelis[i].getTitulo());

            } else if(campo.equals("TIT") && this.arrayPelis[i].getTitulo().toUpperCase().contains(cadenaAlBuscarMayus)) {
                encontrado = true;

            }else if (campo.equals("GEN") && this.arrayPelis[i].getGenero().equalsIgnoreCase(cadenaAlBuscarMayus)){
                encontrado = true;
            }
            if( encontrado){
                resultado = Arrays.copyOf(resultado, resultado.length + 1);
                resultado[resultado.length-1] = this.arrayPelis[i];
            }
        }

        return resultado;
    }
}