package Ejercicios_GEMINI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Videojuego {
    private String titulo;
    private double precio;
    private int ventas;
    private boolean esMultijugador;

    public Videojuego(String titulo, double precio, int ventas, boolean esMultijugador) {
        this.titulo = titulo;
        this.precio = precio;
        this.ventas = ventas;
        this.esMultijugador = esMultijugador;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public int getVentas() {
        return ventas;
    }

    public boolean isEsMultijugador() {
        return esMultijugador;
    }
     public static <T,R> List<R> filtrarYTransformar(T[] tabla, Predicate<T> predicate, Function<T,R> function){
        List<R> res= new ArrayList<>();
        if(predicate.test(tabla[0])){
            res =  Arrays.asList(function.apply(tabla[0]));
        }
        return res;
     }

    @Override
    public String toString() {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                '}';
    }
}
