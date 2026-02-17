package UD5_PRACT1_COAC;

public class Integrante {
    private int numero_participante;
    private String nombre;
    private int edad;
    private String localidad;

    public Integrante(int numero_participante, String nombre, int edad, String localidad) {
        this.numero_participante = numero_participante;
        this.nombre = nombre;
        this.edad = edad;
        this.localidad = localidad;
    }

    public int getNumero_participante() {
        return numero_participante;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getLocalidad() {
        return localidad;
    }
}
