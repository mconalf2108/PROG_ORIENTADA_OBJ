package EXAMEN_AÑO_PASADO;

public class WhatsAPP extends Mensaje implements Enviable{
    public WhatsAPP(String contenido, String destinatario) {
        super(contenido, destinatario);
    }

    @Override
    public boolean validarDestinatario() {
        char [] digitos= {'1','2','3','4','5','6','7','8','9','0'};
        boolean esValido = false;
        int digitosValidos = 0;
        if(getDestinatario().length() == 9){
            for (int i = 0; i < this.getDestinatario().length(); i++) {
                for (int j = 0; j < digitos.length; j++) {
                    if(getDestinatario().charAt(i) == digitos[j]){
                        digitosValidos++;
                    }
                }
            }
            if(digitosValidos == 9){
                esValido = true;
            }
            else {
                esValido = false;
            }
        }
        return esValido;
    }

    @Override
    public void enviar() {
        this.enviado = true;
    }
}
