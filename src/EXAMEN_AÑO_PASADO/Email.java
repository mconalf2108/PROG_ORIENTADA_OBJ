package EXAMEN_AÑO_PASADO;

public class Email extends Mensaje implements Enviable{
    private String asunto;
    public Email(String contenido, String destinatario, String asunto) {
        super(contenido, destinatario);
        this.asunto = asunto;
    }

    @Override
    public boolean validarDestinatario() {
        boolean res;
        int posicionArroba = getDestinatario().indexOf("@");
        if (getDestinatario() != null && getDestinatario().isEmpty() && posicionArroba < getDestinatario().length()-1) {
            res = true;
        } else {
            res = false;
        }
        return res;
    }

    public String getAsunto() {
        return asunto;
    }

    @Override
    public void enviar() {
        this.enviado = true;
    }
}
