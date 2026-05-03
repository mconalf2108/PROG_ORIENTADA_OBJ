package EXAMEN_CLAUDE2;

import java.util.List;

public class Producto {
    private int id;
    private String nombre;
    private String categoria;
    private double precio;
    private int stock;
    private List<String> etiquetas; // se rellena en el Ejercicio 2e

    public Producto(int id, String nombre, String categoria,
                    double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.stock = stock;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public List<String> getEtiquetas() {
        return etiquetas;
    }

    // Setter para etiquetas (necesario en Ejercicio 2e)
    public void setEtiquetas(List<String> etiquetas) {
        this.etiquetas = etiquetas;
    }

    @Override
    public String toString() {
        return nombre + " [" + categoria + "] - " + precio + " EUR";
    }
}

