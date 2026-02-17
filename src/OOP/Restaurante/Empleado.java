package OOP.Restaurante;
import java.time.LocalDate;

public class Empleado {
    private static int contadorIds=1;
    private String nombre;
    private Cargo cargo;
    private int id;
    private LocalDate fecha_contratacion=LocalDate.now();


    public Empleado(String nombre, Cargo cargo) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.id = contadorIds;
        contadorIds++;
    }

    public String getNombre() {
        return nombre;
    }

    public Cargo getCargo() {
        return this.cargo;
    }
    public int getId() {
        return id;
    }

    public static int getContadorIds() {
        return contadorIds-1;
    }
    public void mostrarInformacion(){
        System.out.println("nombre = " + nombre);
        System.out.println("cargo = " + cargo);
        System.out.println("id = " + id);
        System.out.println("fecha_contratacion = " + fecha_contratacion);

    }
}
