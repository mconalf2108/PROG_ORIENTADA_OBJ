package Abstraccion.pruebaAbstr;

public class PruebaAbstractas {
    public static void main(String[] args) {
        //Vehiculo v = new VehiculoSinMotor();
        //VehiculoConMotor  vcm = new VehiculoConMotor();
        //  v.arrancar();
        System.out.println("vehiculo es de la clase " );
        // no se pueden crear objetos de la clase vehiculo
        //Se pueden tener metodos no abstractos en una clase abstracta, pero en una clase normal
        // no puedes tener metodos abstractos
        Coche c = new Coche();
    }
}
