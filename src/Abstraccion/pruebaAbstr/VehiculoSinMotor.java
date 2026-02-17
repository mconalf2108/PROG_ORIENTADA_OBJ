package Abstraccion.pruebaAbstr;

public abstract class  VehiculoSinMotor extends Vehiculo {
    @Override
    public void arrancar(){
        System.out.println("Los vehiculos sin motor no necesitan ser arrancados");
    }
}
