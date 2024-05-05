package Proyecto;
public class Aeropuerto {
    private String nombre;
    private String ciudad;
    private String pais;
    private Compañia listaCompañias[]= new Compañia[10];
    private int numCompañia;

    public Aeropuerto(String nombre, String ciudad, String pais, int numCompañia) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        this.numCompañia = 0;
    }
    
    public Aeropuerto(String nombre, String ciudad, String pais, Compañia c[]) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        this.numCompañia = 0;
    }
    
    public void insertarCompañia (Compañia compañia){
        listaCompañias[numCompañia]= compañia;
        numCompañia++;
    }
    
    
}
