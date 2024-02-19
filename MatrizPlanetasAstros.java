public class MatrizPlanetasAstros {

        public static void main(String[] args) {
            // Definir los nombres de los planetas y astros
            String[] nombres = {"Mercurio", "Venus", "Tierra", "Marte", "Júpiter", "Saturno", "Urano", "Neptuno", "Plutón"};
            
            // Crear una matriz para almacenar información sobre la relación entre los planetas y astros
            int[][] matriz = new int[nombres.length][nombres.length];
            
            // Rellenar la matriz con valores (aquí puedes poner la información relevante)
            // Por ejemplo, puedes poner la distancia entre los planetas o cualquier otra información que desees
            // En este ejemplo, se llena la matriz con valores aleatorios entre 1 y 10
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    if (i != j) { // No se necesita calcular la relación de un planeta o astro consigo mismo
                        matriz[i][j] = (int) (Math.random() * 10) + 1; // Valor aleatorio entre 1 y 10
                    } else {
                        matriz[i][j] = 0; // La distancia de un planeta o astro consigo mismo es 0
                    }
                }
            }
            
            // Mostrar la matriz
            System.out.print("  ");
            for (String nombre : nombres) {
                System.out.print(nombre + " ");
            }
            System.out.println();
            
            for (int i = 0; i < matriz.length; i++) {
                System.out.print(nombres[i] + " ");
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
       

