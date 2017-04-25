
package poyecto.poo;

import java.util.logging.Logger;


public class Arbitro {
    
    String nombre;
    int edad;
    String nacionalidad;
    int numeroPartidos;

    public Arbitro(String nombre, int edad, String nacionalidad, int numeroPartidos) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.numeroPartidos = numeroPartidos;
    }

    public void pitarPartido(){
        
    }
    
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public int getNumeroPartidos() {
        return numeroPartidos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setNumeroPartidos(int numeroPartidos) {
        this.numeroPartidos = numeroPartidos;
    }
    
    
    
}
