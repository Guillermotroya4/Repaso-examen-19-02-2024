public class Cuadrado {
 private double lado;
 private double areaCuadrado;
 
 
 public Cuadrado(double lado){
    this.lado=lado;
 }

 public void setLado(double lado) {
     this.lado = lado;
 }

 public double getLado() {
     return lado;
 }

 public void setAreaCuadrado(double areaCuadrado) {
     this.areaCuadrado = areaCuadrado;
 }

 public double getAreaCuadrado() {
     return areaCuadrado;
 }

 public void area(){
    areaCuadrado = lado *lado;
 }


}
