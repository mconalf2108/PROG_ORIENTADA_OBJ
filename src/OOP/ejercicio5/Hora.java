package OOP.ejercicio5;
public class Hora {
    private int horas;
    private int minutos;
    private int segundos;

    public Hora(int horas,int minutos, int segundos){
       setHoras(horas);
       setMinutos(minutos);
       setSegundos(segundos);

     }
    public  int getHoras(){
        return this.horas;
    }
    public void setHoras(int horas ){
        if(horas>=0 && horas<24) {
            this.horas = horas;
        }else{
            System.out.println("error, la hora no debe ser mayor a 24");
        }
    }
    public  int getMinutos(){
        return this.minutos;
    }
    public void setMinutos(int minutos){
        if(minutos >= 0 && minutos<60) {
            this.minutos = minutos;
        }else{
            System.out.println("error, los minutos deben ser menor a 60");
        }
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        if(segundos>=0 &&segundos<60) {
            this.segundos = segundos;
        }else{
            System.out.println("los segundos deben ser menores a 60");
        }

    }

    public Hora(int horas) {
        this.horas = horas;
    }

    public void sumarUnSegundo(){
        segundos = segundos++;
        if(segundos>59){
            segundos = 0;
            minutos++;
        }
        if(minutos>59){
            segundos = 0;
            minutos = 0;
            horas++;
        }
        if(horas>23){
            horas = 0;
            minutos = 0;
            segundos = 0;
        }
        System.out.println(horas + " : " + minutos +  " : " + segundos);
    }

}
