package Restaurante;
import java.util.Arrays;
public class Restaurante {
    private String nombreRest;
    private Plato [] listaPlatos = new Plato[0];
    private Empleado [] listaEmpleados = new Empleado[0];

    public void añadirPlato(Plato platoNuevo){

        this.listaPlatos = Arrays.copyOf(  this.listaPlatos,   this.listaPlatos.length +1);
        this.listaPlatos[listaPlatos.length-1] = platoNuevo;
    }
    public void añadirEmpleado(Empleado empleado ){
        this.listaEmpleados = Arrays.copyOf(  this.listaEmpleados,this.listaEmpleados.length+1);
        this.listaEmpleados[listaEmpleados.length-1] = empleado ;


    }
    public boolean  eliminarEmpleado(Empleado numIdentifacion){
        boolean isEliminado=false;
        int indiceEncontrado=-1;
        Empleado [] temporal = new Empleado[listaEmpleados.length-1];
        for (int i = 0; i < listaEmpleados.length; i++) {
           if( listaEmpleados[i] == numIdentifacion){
              indiceEncontrado = i;
           }
           if(indiceEncontrado == -1){
               isEliminado = false;
           }
        }


        return false;
    }
    public void mostrarListaPlatos(){

    }

    public void mostrarListaEmpleados(){

    }
}
