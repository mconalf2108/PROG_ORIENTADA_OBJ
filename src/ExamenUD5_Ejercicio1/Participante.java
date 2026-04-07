package ExamenUD5_Ejercicio1;

public abstract class Participante {
    private String nombre, nif, nacionalidad;
    private int edad;

    public Participante(String nombre, String nif,  int edad,String nacionalidad) {
        this.nombre = nombre;
        this.nif = nif;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
    }
    public abstract void  mostrarDetalles();

    public String getNombre() {
        return nombre;
    }

    public String getNif() {
        return nif;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public int getEdad() {
        return edad;
    }
}
