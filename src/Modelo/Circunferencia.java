package Modelo;

public class Circunferencia extends Figura {

    private double radio;
    private double diametro;

    public Circunferencia() {

    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public String mostrarReporte() {
        String salida = "";
        salida = "Atributos, radio y perimetro de la circunferencia";
        return salida;
    }

}
