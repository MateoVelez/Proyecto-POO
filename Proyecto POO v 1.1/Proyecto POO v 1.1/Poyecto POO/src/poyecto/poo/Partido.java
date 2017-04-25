
package poyecto.poo;

import java.util.Date;


public class Partido {
    
    Date fecha;
    Equipo equipo;
    Arbitro arbitro;
    Estadio estadio;

    public Partido(Date fecha, Equipo equipo, Arbitro arbitro, Estadio estadio) {
        this.fecha = fecha;
        this.equipo = equipo;
        this.arbitro = arbitro;
        this.estadio = estadio;
    }

    public void marcador(int numGoles){
    
    }
    
    
    public Date getFecha() {
        return fecha;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public Arbitro getArbitro() {
        return arbitro;
    }

    public Estadio getEstadio() {
        return estadio;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public void setArbitro(Arbitro arbitro) {
        this.arbitro = arbitro;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }
    
    
    
}
