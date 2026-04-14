package OOP.RETOS_EXAMEN.Reto4;

public class Main {
    public static void main(String[] args) {
        Lavadora lavadora1 = new Lavadora();
        Lavadora lavadora2 = new Lavadora();
        Electrodomestico e1 = new Electrodomestico();

        Electrodomestico array [] = {lavadora1,lavadora2,e1};
        for (int i = 0; i < array.length; i++) {
            array[i].encender();
            if(array[i] instanceof Lavadora){
                ((Lavadora) array[i]).centrifugar();
            }


        }
    }
}
