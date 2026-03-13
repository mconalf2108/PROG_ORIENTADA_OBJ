package UD5_PRACT_Electrodomésticos;

public class Electrodomestico {

    protected int precioBase;
    protected String color;
    protected int peso;
    protected consumoEnergetico consumo;

    public Electrodomestico(int precioBase, String color, int peso, consumoEnergetico consumo) {
        this.precioBase = precioBase;
        this.color = color;
        this.peso = peso;
        this.consumo = consumo;
    }

    // 2. Constructor por defecto
    public Electrodomestico() {
        this(100, "blanco", 5, consumoEnergetico.F);
    }

    public Electrodomestico(double precioBase, int peso) {
        this((int) precioBase, "blanco", peso, consumoEnergetico.F);
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public int getPeso() {
        return peso;
    }

    public consumoEnergetico getConsumo() {
        return consumo;
    }
    public int getPrecioFinal(){
        int res=0;
        switch (this.consumo){
            case A -> this.precioBase+=100;
            case B -> this.precioBase+=80;
            case C -> this.precioBase+=60;
            case D -> this.precioBase+=50;
            case E -> this.precioBase+=30;
            case F -> this.precioBase+=10;
        }
        if (this.peso >= 0 && this.peso <= 29) {
            this.precioBase += 10;
        } else if (this.peso >= 30 && this.peso <= 49) {
            this.precioBase += 60;
        } else if (this.peso >= 50 && this.peso <= 79) {
            this.precioBase += 80;
        } else if (this.peso >= 80) {
            this.precioBase += 100;
        }
         return this.precioBase;
    }
    @Override
    public String toString() {
        return "Electrodomestico {" +
                "precioBase = " + precioBase + "€" +
                ", color = '" + color + '\'' +
                ", peso = " + peso + "kg" +
                ", consumo = " + consumo +
                ", PRECIO FINAL = " + getPrecioFinal() + "€" +
                '}';
    }
}
