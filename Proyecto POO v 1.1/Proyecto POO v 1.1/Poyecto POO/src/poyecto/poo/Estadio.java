
package poyecto.poo;


public class Estadio {
    
    String nombre;
    int capacidad;
    Ciudad ciudad;

    public Estadio(String nombre, int capacidad, Ciudad ciudad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
    
    
    
}