package OOP.ExamenUD5_Ejercicio1;

public class Juez extends Participante {
    protected int numJuez;

    public Juez(String nombre, String nif, int edad, String nacionalidad, int numJuez) {
        super(nombre, nif, edad, nacionalidad);
        this.numJuez = numJuez;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("El numero de juez es: " + numJuez);
        System.out.println("Sus datos son: ");
        System.out.println("Nombre: " + getNombre());
        System.out.println("NIF: " + getNif());
        System.out.println("Nacionalidad: " + getNacionalidad());
        System.out.println("Edad: " + getEdad());
    }
}
