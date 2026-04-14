package OOP.PRACTICA_MINECRAFT;

public class Minecraft {
    Materiales[] inventario = new Materiales[10];


    public void anadirMaterial(Materiales nuevoMaterial) {
        for (Materiales inventario : this.inventario) {
            if (inventario == null ) {
                inventario = nuevoMaterial;
                System.out.println("Añadido correctamente");
            }else {
                System.out.println("Error, el inventario esta lleno");
            }
        }
    }
    public void borrarMaterialSinMasa(){
        int elementosAMover = 0;
        for (int i = 0; i < inventario.length; i++) {
            if(this.inventario[i] != null && this.inventario[i].getMasa() <= 0){
                elementosAMover =  this.inventario.length - 1 - i;
            }
            if(elementosAMover > 0){
                System.arraycopy(this.inventario,i + 1 ,this.inventario,i,elementosAMover);
            }

        }

    }

}
