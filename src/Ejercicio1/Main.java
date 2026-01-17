package Ejercicio1;
public class Main {
    public static void main(String[] args) {
        CuentaCorriente c1 = new CuentaCorriente("55376232Y","Mauro");
        CuentaCorriente c2 = new CuentaCorriente("55346234E",0);
        CuentaCorriente completa= new CuentaCorriente("22233344E","Kiriku",8);

        //pruebas C1
        c1.ingresarDinero(200);
        System.out.println(c1.DNI);
        c1.retirarDinero(100);
        c1.mostrarInformacion();

        //pruebas C2
        System.out.println(c2.DNI);

        //pruebas C3
        System.out.println(completa.DNI);
    }
}