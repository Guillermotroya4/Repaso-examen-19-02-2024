public class Circulo {
    private double radio;
    private double areaRadio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setAreaRadio(double areaRadio) {
        this.areaRadio = areaRadio;
    }

    public double getAreaRadio() {
        return areaRadio;
    }

    public void area() {
        areaRadio = Math.PI * radio * radio;
    }
   

}