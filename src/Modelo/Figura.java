package Modelo;

public abstract class Figura implements IFigura {

    private String nombre;
    private int numeroLados;
    private double anguloCentral;

    public Figura() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroLados() {
        return numeroLados;
    }

    public void setNumeroLados(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public double getAnguloCentral() {
        return anguloCentral;
    }

    public void setAnguloCentral(double anguloCentral) {
        this.anguloCentral = anguloCentral;
    }

    @Override
    public abstract double calcularPerimetro();

    @Override
    public abstract double calcularArea();

    @Override
    public abstract String mostrarReporte();

}
