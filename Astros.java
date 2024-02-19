abstract class Astros {
    private double radioEcuatorial, gravedad, rotacionSobreEje, masa, temperaturaMedia;
    private String nombre;

    public Astros(String nombre, double radioEcuatorial, double rotacionSobreEje, double masa, double temperaturaMedia,
            double gravedad) {
        this.nombre = nombre;
        this.radioEcuatorial = radioEcuatorial;
        this.rotacionSobreEje = rotacionSobreEje;
        this.masa = masa;
        this.temperaturaMedia = temperaturaMedia;
        this.gravedad = gravedad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPlaneta() {
        return nombre;
    }

    public void muestra() {
        System.out.println("Radio Ecuatorial: " + radioEcuatorial);
        System.out.println("Rotación sobre su eje: " + rotacionSobreEje);
        System.out.println("Masa: " + masa);
        System.out.println("Temperatura Media: " + temperaturaMedia);
        System.out.println("Gravedad: " + gravedad);
    }
}