package EXAMEN_AÑO_PASADO;

public class PostIt extends Mensaje{
    public PostIt(String contenido, String destinatario) {
        super(contenido, destinatario);
    }

    @Override
    public boolean validarDestinatario() {
        return true;
    }
}
