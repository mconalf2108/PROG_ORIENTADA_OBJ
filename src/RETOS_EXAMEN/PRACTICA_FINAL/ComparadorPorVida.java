package RETOS_EXAMEN.PRACTICA_FINAL;

import java.util.Comparator;

public class ComparadorPorVida  implements Comparator<NaveEspacial> {
    @Override
    public int compare(NaveEspacial o1, NaveEspacial o2) {
        NaveEspacial este = (NaveEspacial) o1;
        NaveEspacial otro = (NaveEspacial) o2;
        return Integer.compare(este.getPuntosEstructura(), otro.getPuntosEstructura());
    }


}
