package Interfaces;

public class Futbolista implements Comparable {
    private String dni;
    private String nombre;
    private int edad;
    private int numGoles;

    public Futbolista(String dni, String nombre, int edad, int numGoles) {
         this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.numGoles = numGoles;
    }

    @Override
    public String toString() {
        return "DNI: " + dni + " | Nombre: " + nombre + " | Edad: " + edad;
    }
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int compareTo(Object o) {
        Futbolista f2 = (Futbolista) o;
        return this.dni.compareTo(f2.dni);
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getNumGoles() {
        return numGoles;
    }
}
