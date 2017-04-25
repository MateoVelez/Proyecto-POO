
package poyecto.poo;


public class Patrocinador {
    
    String nombre;
    String tipoPatrocine;

    public Patrocinador(String nombre, String tipoPatrocine) {
        this.nombre = nombre;
        this.tipoPatrocine = tipoPatrocine;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoPatrocine() {
        return tipoPatrocine;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipoPatrocine(String tipoPatrocine) {
        this.tipoPatrocine = tipoPatrocine;
    }
    
    
    
}
