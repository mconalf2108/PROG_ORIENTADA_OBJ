package OOP.ExamenUD5_Ejercicio1;

public class Voluntario extends Participante {
    int numKilometro;
    String funcion;

    public Voluntario(String nombre, String nif, int edad, String nacionalidad, int numKilometro, String funcion) {
        super(nombre, nif, edad, nacionalidad);
        this.numKilometro = numKilometro;
        this.funcion = funcion;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("NIF: " + getNif());
        System.out.println("Nacionalidad: " + getNacionalidad());
        System.out.println("Edad: " + getEdad());
        System.out.println("Numero del Kilometro: " + numKilometro);
        System.out.println("Funcion: " + funcion);
    }
}
