package OOP.ej_recreo;
import java.time.LocalTime;

public class Recreo {
    public static void main(String[] args) {
        LocalTime horaDelRecreo= LocalTime.of(11,30,0);

        LocalTime ahora = LocalTime.now();

        int diferenciaSegundos = horaDelRecreo.toSecondOfDay() - ahora.toSecondOfDay();

        int horas = diferenciaSegundos/ 3600;
        int minutos = (diferenciaSegundos%3600) / 60;
        int segundos = diferenciaSegundos%60;

        System.out.println("quedan para el recreo " + horas + "horas " + minutos+ " minutos " + segundos +" segundos");


    }
}
