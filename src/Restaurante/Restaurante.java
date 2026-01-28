package Restaurante;
import java.util.Arrays;
public class Restaurante {
    private static String nombreCadena = "CADENA MAURO";
    private Plato [] listaPlatos = new Plato[0];
    private Empleado [] listaEmpleados = new Empleado[0];

    public Restaurante(String nombreCadena) {
        nombreCadena = this.nombreCadena;
    }

    public void añadirPlato(Plato platoNuevo) {
        boolean encontrado = false;
        int i = 0;
        while (i < this.listaPlatos.length && !encontrado) {
            if (this.listaPlatos[i].getNombre().equalsIgnoreCase(platoNuevo.getNombre())) {
                encontrado = true;
            }
            i++;
        }
        if (!encontrado) {
            this.listaPlatos = Arrays.copyOf(this.listaPlatos, this.listaPlatos.length + 1);
            this.listaPlatos[this.listaPlatos.length - 1] = platoNuevo;
        }
    }

    public void añadirEmpleado(Empleado empleado ){
            this.listaEmpleados = Arrays.copyOf(this.listaEmpleados, this.listaEmpleados.length + 1);
            this.listaEmpleados[listaEmpleados.length - 1] = empleado;


    }
    public boolean  eliminarEmpleado(int numIdentifacion){
        boolean isEliminado=false;
        int indiceEncontrado=-1;
        Empleado [] temporal = new Empleado[this.listaEmpleados.length-1];

        for (int i = 0; i < this.listaEmpleados.length; i++) {
           if( this.listaEmpleados[i].getId() == numIdentifacion){
              indiceEncontrado = i;
              isEliminado= true;
           }
           if(isEliminado){
               System.arraycopy(this.listaEmpleados,0,temporal,0,indiceEncontrado);
               System.arraycopy(this.listaEmpleados,indiceEncontrado+1,temporal,indiceEncontrado,temporal.length-indiceEncontrado);
               this.listaEmpleados = temporal;
           }
        }
        return isEliminado;
    }
    public void mostrarListaPlatos(){
        for (int i = 0; i < listaPlatos.length; i++) {
            listaPlatos[i].mostrarInformacion();
        }
    }

    public void mostrarListaEmpleados(){
        for (int i = 0; i < listaEmpleados.length; i++) {
             listaEmpleados[i].mostrarInformacion();
        }
    }
    public void mostrarStockPlatos(){
        int sumaTotal = 0;
        for (int i = 0; i < listaPlatos.length; i++) {
            sumaTotal  += listaPlatos[i].getCantidad();
        }
        System.out.println("En el restaurante hay " + sumaTotal + " unidades de comida en total.");

    }

}
