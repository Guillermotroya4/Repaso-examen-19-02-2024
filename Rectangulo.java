public class Rectangulo {
    private double altura;
    private double base;
    private double AreaRectangulo;

    public Rectangulo(double base, double altura){
        this.altura=altura;
        this.base=base;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getAltura() {
        return altura;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getBase() {
        return base;
    }
    public void setAreaRectangulo(double areaRectangulo) {
        AreaRectangulo = areaRectangulo;
    }
    public double getAreaRectangulo() {
        return AreaRectangulo;
    }

    public void area(){
        AreaRectangulo = base * altura;
    }

}
