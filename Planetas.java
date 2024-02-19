class Planetas extends Astros {
    String nombre;
    double distanciaAlSol;
    double periodoTranslacion;
    boolean tieneSatelites;

    public Planetas(String nombre, double radioEcuatorial, double rotacionSobreEje, double masa,
            double temperaturaMedia, double gravedad,
            double distanciaAlSol, double periodoTranslacion, boolean tieneSatelites) {
        super(nombre,radioEcuatorial, rotacionSobreEje, masa, temperaturaMedia, gravedad);
        this.nombre = nombre;
        this.distanciaAlSol = distanciaAlSol;
        this.periodoTranslacion = periodoTranslacion;
        this.tieneSatelites = tieneSatelites;
    }
    public String getNombre(){
        return nombre;
    }

    public void muestra() {
        System.out.println("Nombre del planeta: " + nombre);
        super.muestra();
        System.out.println("Distancia al Sol: " + distanciaAlSol);
        System.out.println("Periodo de traslación alrededor del Sol: " + periodoTranslacion);
        if (tieneSatelites) {
            System.out.println("Tiene satélites: Sí");
        } else {
            System.out.println("Tiene satélites: No");
        }
    }
}