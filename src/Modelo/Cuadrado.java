package Modelo;

public class Cuadrado extends Figura{

    private double lado;
    private double diagonal;
    private double apotema;

    public Cuadrado() {

    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
        diagonal = lado * Math.sqrt(2);
        apotema = lado / 2;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
        lado = diagonal / Math.sqrt(2);
        apotema = diagonal / (2 * Math.sqrt(2));
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
        lado = 2 * apotema;
        diagonal = 2 * Math.sqrt(2) * apotema;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public String mostrarReporte() {
        String salida = "";
        return "Importe compleo de los datos, area y perimetro de un cuadrado";
    }

}
