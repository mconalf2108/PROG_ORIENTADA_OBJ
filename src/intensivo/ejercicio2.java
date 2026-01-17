package intensivo;

public class ejercicio2 {
    public static void main(String[] args) {
        double [] temp = {3.5, 21.3, 22.3, 23.4 ,24.3, 25.4 ,22.7 ,34.1 ,36, 35, 36};

        double sumaTotal=0;
        for (int i = 0; i < temp.length; i++) {
            sumaTotal+=temp[i];
        }
        double media=sumaTotal/12;
        double mesCaluroso=media;
        System.out.println("media = " + media);

        for (int i = 0; i < temp.length; i++) {
            if(mesCaluroso<temp[i]){
                System.out.println("los meses mas caluroso que la media han " +
                        "sido "+ (i+1) + " con " + temp[i] + " grados");
            }

        }

    }
}
