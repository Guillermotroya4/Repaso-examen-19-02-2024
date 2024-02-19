class Satelites extends Astros {
    String nombre;
    double distanciaAlPlaneta;
    double periodoTranslacion;
    String planetaPertenece;

    public Satelites(String nombre, double radioEcuatorial, double rotacionSobreEje, double masa,
            double temperaturaMedia, double gravedad,
            double distanciaAlPlaneta, double periodoTranslacion, String planetaPertenece) {
        super(planetaPertenece, radioEcuatorial, rotacionSobreEje, masa, temperaturaMedia, gravedad);
        this.nombre = nombre;
        this.distanciaAlPlaneta = distanciaAlPlaneta;
        this.periodoTranslacion = periodoTranslacion;
        this.planetaPertenece = planetaPertenece;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void muestra() {
        System.out.println("Nombre del satélite: " + nombre);
        super.muestra();
        System.out.println("Distancia al planeta: " + distanciaAlPlaneta);
        System.out.println("Periodo de traslación alrededor del planeta: " + periodoTranslacion);
        System.out.println("Planeta al que pertenece: " + planetaPertenece);
    }
}