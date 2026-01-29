package Ejercicio_GEMINI;

import java.util.Arrays;

public class Radar {
    Sancion [] sanciones;
    public void añadirSancion(Sancion nuevaSancion){
        this.sanciones = new Sancion[0];
        this.sanciones = Arrays.copyOf(this.sanciones,this.sanciones.length+1);
        for (int i = 0; i < this.sanciones.length; i++) {
            this.sanciones[this.sanciones.length -1] = nuevaSancion;
        }
    }
    public Sancion []  buscarPorMatricula(String matricula) {
        Sancion [] temporal= new Sancion[0];
        for (int i = 0; i < this.sanciones.length; i++) {
            if(this.sanciones[i].getMatricula().equalsIgnoreCase(matricula.trim())){
                temporal = Arrays.copyOf(temporal, temporal.length +1);
                temporal[temporal.length-1] = this.sanciones[i];
            }
        }
        return temporal;
    }
    public  boolean anularSancion(int ID){
         boolean isAnulada = false;
         int i=0;
        while (i<this.sanciones.length && !isAnulada){
            if(this.sanciones[i].getSancionID() == ID){
                Sancion temporal[] = new Sancion[this.sanciones.length-1];
                System.arraycopy(this.sanciones,0,temporal,0, i);
                System.arraycopy(this.sanciones,i+1,temporal,i, this.sanciones.length-1-i);
                 isAnulada = true;
            }i++;
        }
        return  isAnulada;
    }
    public void informeRecaudacion(){
        int totalSanciones = this.sanciones.length;
        int sumaTotal = 0;
        for (int i = 0; i < this.sanciones.length; i++) {
            sumaTotal += this.sanciones[i].getImporteGravedad();
        }
        System.out.println("El total de sanciones son: "+totalSanciones);
        System.out.println("La recaudacion ha sido de "+ sumaTotal);
    }
}

