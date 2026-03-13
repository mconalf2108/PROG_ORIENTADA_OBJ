package PRACTICA_COMPARADORES;

public class Vehiculo implements Comparable {
    private String marca;
    private String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Getters para que las subclases puedan acceder
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }

    public int compareTo(Object o) {
        Vehiculo otro = (Vehiculo) o;
        int resultadoMarca = this.marca.compareTo(otro.marca);
        if (resultadoMarca != 0) {
            return resultadoMarca;
        }
        return this.modelo.compareTo(otro.modelo);
    }

    public String toString() {
        return "Marca: " + marca + ", Modelo: " + modelo;
    }
}
