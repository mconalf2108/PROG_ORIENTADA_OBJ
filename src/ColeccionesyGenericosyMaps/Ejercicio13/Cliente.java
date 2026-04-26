package ColeccionesyGenericosyMaps.Ejercicio13;

public class Cliente {
    private String nombre;
    private int edad;
    public Cliente(String nombre, int edad) {
        this.nombre = nombre;
    }

    public Cliente(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
}
