
package poyecto.poo;


public class Torneo {
    
    String nombre;
    String continente;
    String premio;

    public Torneo(String nombre, String continente, String premio) {
        this.nombre = nombre;
        this.continente = continente;
        this.premio = premio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContinente() {
        return continente;
    }

    public String getPremio() {
        return premio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public void setPremio(String premio) {
        this.premio = premio;
    }
    
    
    
    
}
