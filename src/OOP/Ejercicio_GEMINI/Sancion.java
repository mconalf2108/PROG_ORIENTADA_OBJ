package OOP.Ejercicio_GEMINI;

public class Sancion {
    private int sancionID;
    private static int contadorIDS = 100;
    private String matricula;
    private int importeGravedad;

    public Sancion(String matricula, Gravedad gravedad) {
        setMatricula(matricula);
        setImporteGravedad(gravedad);
        this.sancionID = contadorIDS;
        contadorIDS++;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        matricula = matricula.toUpperCase().trim();
        if (matricula.length() < 4) {
            this.matricula = "DESCONOCIDA";
        } else {
            this.matricula = matricula;
        }
    }

    public int getSancionID() {
        return sancionID;
    }

    public int getImporteGravedad() {
        return importeGravedad;
    }

    public void setImporteGravedad(Gravedad gravedad) {
        if (gravedad == Gravedad.GRAVE) {
            this.importeGravedad = 100;
        }
        if (gravedad == Gravedad.LEVE) {
            this.importeGravedad = 50;
        }
        if (gravedad == Gravedad.MUY_GRAVE) {
            this.importeGravedad = 200;
        }    }
}

