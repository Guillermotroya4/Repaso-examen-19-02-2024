public class prueba {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //probar clases cálculo áreas figuras geométricas        
        Cuadrado cuadrado = new Cuadrado(10);
        cuadrado.area();
        System.out.println("Área del cuadrado: " + 
                cuadrado.getAreaCuadrado());
        
        Circulo circulo = new Circulo(4000);
        circulo.area();
        System.out.println("Área del círculo: " + 
                circulo.getAreaRadio());
        
        Rectangulo rectangulo = new Rectangulo(10, 70);
        rectangulo.area();
        System.out.println("Área del rectángulo: " + 
                rectangulo.getAreaRectangulo());

        Triangulo triangulo = new Triangulo(9, 15);
        triangulo.area();
        System.out.println("Área del triángulo: " + 
                triangulo.getAreaTriangulo());
                
        
    }    
}
