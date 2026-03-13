package UD5_PRACT_Electrodomésticos;

public class Lavadora extends Electrodomestico{
    int carga;
    public Lavadora() {
       this.carga=5;
    }

    public Lavadora(int precioBase, int peso) {
        super(precioBase, peso);
    }

    public Lavadora(int precioBase, String color, int peso, consumoEnergetico consumo, int carga) {
        super(precioBase, color, peso, consumo);
        this.carga = carga;
    }
    public int getPrecioFinal(){
        if(this.carga>30){
            this.precioBase+=50;
        }
        return this.precioBase;
    }
    @Override
    public String toString() {
    return "dawd";
    }

}
