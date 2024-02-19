public class SistemaSolar {
  static Astros[] listaAstros = {
    new Planetas("Mercurio", 58, 88, false, 2440, 1408, 330, 167, 3),
    new Planetas("Venus", 108, 225, false, 6052, 5832, 487, 464, 8),
    new Planetas("Tierra", 150, 365, true, 6371, 24, 5972, 15, 9),
    new Planetas("Marte", 228, 687, true, 3390, 25, 642, -65, 3),
    new Planetas("Júpiter", 778, 4331, true, 69911, 10, 1898000, -145, 24),
    new Planetas("Saturno", 1429, 10747, true, 58232, 11, 568300, -175, 10),
    new Planetas("Urano", 2871, 30589, true, 25362, 17, 86810, -195, 8),
    new Planetas("Neptuno", 4495, 59800, true, 24622, 16, 102400, -200, 11),
    new Satelites("Luna", 384, 27, "Tierra", 1737, 655, 735, -53, 1),
    new Satelites("Fobos", 9, 1, "Marte", 11, 7, 0, -40, 0),
    new Satelites("Deimos", 23, 1, "Marte", 6, 30, 0, -40, 0),
    new Satelites("Ganímedes", 1070, 7, "Júpiter", 2634, 171, 148, -163, 1),
    new Satelites("Titán", 1222, 16, "Saturno", 2575, 382, 1345, -179, 1),
    new Satelites("Miranda", 129, 2, "Urano", 236, 141, 1, -187, 0),
    new Satelites("Tritón", 3548, 6, "Neptuno", 1353, -141, 214, -235, 0)
  };

  public static void main(String[] args) {
    int opcion;
    do {
        System.out.println("\n MENU");
        System.out.println("1.  Lista de planetas");
        System.out.println("2.  Lista de satelites");
        System.out.println("3.  Buscar astro (planeta o satelite)");
        System.out.println("4.  Satelites de un planeta");
        opcion = Integer.parseInt(System.console().readLine("Elige una opcion: "));
        System.out.println();

        switch (opcion) {
            case 1:
                listadoPlanetas(listaAstros);
                break;
            case 2:
                listadoSatelites(listaAstros);
                break;
            case 3:
                buscarAstro(listaAstros);
                break;
            case 4:
                satelitesDePlanetas(listaAstros);
                break;
            default:
                break;
        }
        
    } while (opcion != 5);
  }

  public static void listadoPlanetas(Astros[] astros){
    for (int i = 0; i < astros.length; i++) {
        if (astros[i] instanceof Planetas) {
            System.out.println(astros[i].getNombre());
        }
    }
  }

  public static void listadoSatelites(Astros[] astros){
    for (int i = 0; i < astros.length; i++) {
        if (astros[i] instanceof Satelites) {
            System.out.println(astros[i].getNombre());
        }
    }
  }

  public static void buscarAstro(Astros[]astros){
    String busqueda = System.console().readLine("Astro a buscar (coloca las tildes si las tiene): ").toLowerCase();
  
    System.out.println();
    for (int i = 0; i < astros.length; i++) {
        if (astros[i] != null && astros[i].getNombre().toLowerCase().contains(busqueda)) {
            astros[i].muestra();
        } 
    }
}

public static void satelitesDePlanetas(Astros[] astros){
    String planetaBuscado = System.console().readLine("Introduce el nombre del planeta: ");
    boolean encontrado = false;
    System.out.println();

    for (int i = 0; i < astros.length; i++) {
        if(listaAstros[i] instanceof Satelites){
            System.out.println("Satelite " +listaAstros[i].getNombre() + " Pertenece a planeta ---> " + listaAstros[i].getPlanetaPertenece());
        
        }
    }
    if (!encontrado) {
        System.out.println(planetaBuscado + " no pertenece a ningun planeta.");
    }

}


  
}

