package OOP.Ejercicio1;

public class CuentaCorriente {
    String DNI;
    public String nombreTitular;
    private double saldo;
    static String nombreBanco;
    public Gestor gestor;
    //EJERCICIO 3
    public  String getnombreBanco(){
        return nombreBanco;
    }
    public void setNombreBanco(String nombreBanco ){
        CuentaCorriente.nombreBanco = nombreBanco;
    }
    public CuentaCorriente(String DNI, String nombreTitular){
        this.DNI = DNI;
        this.nombreTitular = nombreTitular;
        this.saldo = 0;
    }
    //EJERCICIO 2
    public CuentaCorriente(String DNI, double saldo){
        this.DNI = DNI;
        this.nombreTitular = ""; //se pone cadena vacia para evitar el null exception
        this.saldo = 200;
       // this("500304304w","",200);tambien se puede hacer con el otro this.
    }
    public CuentaCorriente(String DNI, String nombreTitular, int saldo){
        this.DNI = DNI;
        this.nombreTitular = nombreTitular;
        this.saldo = 0;
        // Aqui hemos sobrecargado los constructores con datos diferentes. )
    }

    void retirarDinero( double saldoRetirado){
        this.saldo-=saldoRetirado;
        if(this.saldo<saldoRetirado){
            System.out.println("saldo insuficiente: su saldo es de "+this.saldo);
        }
        System.out.println(this.saldo);
    }

    void ingresarDinero(double ingreso){
        this.saldo+=ingreso;
        System.out.println("Operacion completada!:su saldo es de "+this.saldo);
    }

    void mostrarInformacion(){
        System.out.println("Banco" + CuentaCorriente.nombreBanco);
        System.out.println("su saldo es de"+this.saldo);
        System.out.println("su DNI es" + this.DNI);
        System.out.println("su saldo es de " + this.saldo);
    }
    // EJERCICIO 4
    //si quisieramos qu enada mas crear la cuenta bancaria se asignara un gestor,
    //lo tendriamos que poner donde definimos la función de cuentaCorriente
    //pero como solo queremos asignarlo cuando sea necesario, ponemos un SET.
    public void setGestor(Gestor gestor) {
        this.gestor = gestor;
    }
}
