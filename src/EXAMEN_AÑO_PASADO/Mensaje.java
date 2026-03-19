package EXAMEN_AÑO_PASADO;

public abstract class Mensaje {
     String contenido,destinatario;
    boolean enviado;

    public Mensaje(String contenido, String destinatario) {
        this.contenido = contenido;
        this.destinatario = destinatario;
    }
    public abstract boolean validarDestinatario();+

    public String getContenido() {
        return contenido;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public boolean isEnviado() {
        return enviado;
    }
}
