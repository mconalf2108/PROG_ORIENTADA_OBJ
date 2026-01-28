package Restaurante;
import java.sql.SQLOutput;
import java.util.Arrays;
public class Plato {
    private String nombre;
    private double precio;     // Nuevo
    private Categoria categoria;  // Nuevo (o usa un enum)
    private int cantidad;
    private int contadorPlatos = 1;// Nuevo

    public Plato(String nombre, double precio, Categoria categoria, int cantidad) {
        setNombre(nombre);
        setCantidad(cantidad);
        setCategoria(categoria);
        setPrecio(precio);
        contadorPlatos++;
    }

    public String getNombre() {
        return nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {

        return precio;
    }

    public int getContadorPlatos() {
        return contadorPlatos-1;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        if(precio>=0.1 && precio<=999.99) {
            this.precio = precio;
        }
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setCantidad(int cantidad) {
        if(cantidad>=1 && cantidad<=1000) {
            this.cantidad = cantidad;
        }
    }
    public void mostrarInformacion(){
        System.out.println( "nombre"+this.nombre );
        System.out.println("precio = " + this.precio);
        System.out.println("cantidad = " + this.cantidad);
        System.out.println("categoria = " + this.categoria);
    }
}