
package poyecto.poo;


public class Equipo {
    
    String nombre;
    Jugador jugador;
    Entrenador entrenador;
    Tecnico tecnico;
    Medico medico;
    Patrocinador patrocinador;
    Estadio estadio;
    Torneo torneo;

    public Equipo(String nombre, Jugador jugador, Entrenador entrenador, Tecnico tecnico, Medico medico, Patrocinador patrocinador, Estadio estadio, Torneo torneo) {
        this.nombre = nombre;
        this.jugador = jugador;
        this.entrenador = entrenador;
        this.tecnico = tecnico;
        this.medico = medico;
        this.patrocinador = patrocinador;
        this.estadio = estadio;
        this.torneo = torneo;
    }
    
    public void jugarPartido(){
        
    }
  
    public void concentrarse(){
        
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public Medico getMedico() {
        return medico;
    }

    public Patrocinador getPatrocinador() {
        return patrocinador;
    }

    public Estadio getEstadio() {
        return estadio;
    }

    public Torneo getTorneo() {
        return torneo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public void setPatrocinador(Patrocinador patrocinador) {
        this.patrocinador = patrocinador;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }

    public void setTorneo(Torneo torneo) {
        this.torneo = torneo;
    }
  
    
    
}