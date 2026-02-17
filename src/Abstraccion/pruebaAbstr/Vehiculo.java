package Abstraccion.pruebaAbstr;

public abstract class Vehiculo {
    String marca;
    String modelo;
    public void arrancar(){
        System.out.println("El vehiculo esta arrancado");
    }
    public abstract void matricular();
    public abstract void conducir();
}
