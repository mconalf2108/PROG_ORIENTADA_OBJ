package Persona;

public class Persona {
    String nombre ;
    private double edad;
    private String DNI;
    private final String sexo = "hombre";
    private double peso;
    private double altura;

    public Persona(String nombre, double edad, String DNI,double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.peso = peso;
        this.altura = altura;
    }
    public Persona() {
        this.nombre ="" ;
        this.edad = 0;
        this.DNI = "";
        this.peso = 0;
        this.altura = 0;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }
    public double calcularIMC(){
        double formula;
        double res = -2;
        formula = (this.peso / this.altura*this.altura);
        if(formula<20){
            res = -1;
        }
        if(formula>=20 && formula<=25){
            res= 0;
        }
        if(formula>25){
            res = 1;
        }
        return res;
    }

    public String getNombre() {
        return nombre;
    }

    public double getEdad() {
        return edad;
    }

    public String getDNI() {
        return DNI;
    }
    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}