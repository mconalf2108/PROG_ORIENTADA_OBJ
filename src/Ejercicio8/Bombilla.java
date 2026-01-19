package Ejercicio8;

public class Bombilla {
    private boolean bombilla;
    static boolean interruptorGeneral; // on / of
    private boolean interruptorParticular ;

    public void encenderBombilla() {
        this.interruptorParticular = true;
    }

    public void apagarBombilla () {
        this.interruptorParticular =false;
    }
    public static void activarGeneral() {
        interruptorGeneral = true;
    }

    public static void desactivarGeneral() {
        interruptorGeneral = false;
    }
    public boolean estaLuciendo() {
        // Solo luce si su interruptor está ON Y el general está ON
        return this.interruptorParticular && interruptorGeneral;
    }

    public void saberEstado(){
        if (estaLuciendo()) {
            System.out.println("La bombilla está ENCENDIDA.");
        } else {
            System.out.println("La bombilla está APAGADA.");
        if (!interruptorGeneral) {
            System.out.println("(Porque el interruptor general está cortado)");
        } else
            if (!interruptorParticular) {
                System.out.println("(Porque el interruptor particular está apagado)");
            }
        }




    }


}
