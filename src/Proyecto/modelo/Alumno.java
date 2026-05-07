package Proyecto.modelo;

public class Alumno {
    private int id;
    private String nombre;
    private String email;
    private int isMayorEdad;
    private int idCurso;
    private String nombreCurso;

    public Alumno(int id, String nombre, String email, int isMayorEdad, int idCurso, String nombreCurso) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.isMayorEdad = isMayorEdad;
        this.idCurso = idCurso;
        this.nombreCurso = nombreCurso;
    }

    // Getters
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getEmail() { return email; }
    public int getIsMayorEdad() { return isMayorEdad; }
    public int getIdCurso() { return idCurso; }
    public String getNombreCurso() { return nombreCurso; }

    public String getMayorEdadTexto() {
        return (isMayorEdad == 1) ? "Si" : "No";
    }
}