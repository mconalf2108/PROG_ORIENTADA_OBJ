package Agenda;
import  java.util.Arrays;
public class Agenda {
    Contacto listaContactos [] ;

    public Agenda(Contacto[] listaContactos) {
        this.listaContactos = new Contacto[0];
    }
    public void anadirContacto(Contacto nuevoContacto){
        this.listaContactos[0] = nuevoContacto;



    }
}
