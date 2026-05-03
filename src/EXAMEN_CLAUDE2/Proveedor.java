package EXAMEN_CLAUDE2;

public class Proveedor {
    private String codigo;
    private String nombre;
    private String contacto;

    public Proveedor(String codigo, String nombre, String contacto) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.contacto = contacto;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContacto() {
        return contacto;
    }

    @Override
    public String toString() {
        return codigo + " - " + nombre + " (Contacto: " + contacto + ")";
    }
}