package OOP.RETOS_EXAMEN.PRACTICA_FINAL;

import java.util.Arrays;

public class GestorFlota {
    public static void main(String[] args) {
        NaveEspacial[] flota = new NaveEspacial[4];
        flota[0] = new CruceroBatalla("CRU-Vanguardia", 450.5);
        flota[1] = new NaveExploracion("EXP-Sombra", 890.0);
        flota[2] = new CargueroPesado("CAR-Mula", 120.0, 5000);
        flota[3] = new CargueroPesado("CAR-Leviatan", 100.0, 10000);
        ((CargueroPesado) flota[2]).setCargaActual(5000);  // Este estará al máximo (necesitará mantenimiento)
        ((CargueroPesado) flota[3]).setCargaActual(4000);
        ((NaveExploracion) flota[1]).setModoSigilo(true);

        for (NaveEspacial naveEspacial : flota) {
            naveEspacial.activarHabilidad();
            naveEspacial.recibirDano(600);
        }
            for (int i = 0; i < flota.length; i++) {
                if (flota[i] instanceof Mantenible) {
                    Mantenible naveRota = (Mantenible) flota[i];
                    // 3. Comprobamos y reparamos
                    if (naveRota.necesitaMantenimiento()) {
                        naveRota.reparar(300);
                    }
                }
            }
        Arrays.sort(flota,new ComparadorPorVida());
        System.out.println("Ordenando por vida... ");
        for (NaveEspacial naveEspacial : flota) {
            System.out.println(naveEspacial);
        }
    }
}
