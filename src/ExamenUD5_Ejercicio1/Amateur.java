package ExamenUD5_Ejercicio1;

public class Amateur extends Corredor {
    public Amateur(String nombre, String nif, int edad, String nacionalidad,int dorsal, Categoria categoria) {
        super(nombre, nif, edad, nacionalidad,dorsal, categoria);
    }

    @Override
    public void registrarMarca(int minutos) {
        tiempo = minutos;
    }
}
