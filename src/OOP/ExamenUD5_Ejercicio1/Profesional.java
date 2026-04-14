package OOP.ExamenUD5_Ejercicio1;

public class Profesional extends Corredor {
    String nombreEquipo;
    String numLicencia;

    public Profesional(String nombre, String nif, int edad, String nacionalidad, int dorsal, Categoria categoria, String nombreEquipo, String numLicencia) {
        super(nombre, nif, edad, nacionalidad, dorsal, categoria);
        this.nombreEquipo = nombreEquipo;
        this.numLicencia = numLicencia;
    }

    @Override
    public void registrarMarca(int minutos) {
        tiempo = minutos;
    }

    public void comunicarMarcaFederacion(int minutos) {
        System.out.println("Enviando marca a la base de datos...");
        System.out.println("El corredor " + getNombre() + " con el dorsal " + getDorsal() + " ha comunicado un tiempo de " + getTiempo() + " minutos");
    }

    @Override
    public String toString() {
        return "Profesional{" +
                "nombreEquipo='" + nombreEquipo + '\'' +
                ", dorsal=" + dorsal +
                ", tiempo=" + tiempo +
                '}';
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public String getNumLicencia() {
        return numLicencia;
    }

}

