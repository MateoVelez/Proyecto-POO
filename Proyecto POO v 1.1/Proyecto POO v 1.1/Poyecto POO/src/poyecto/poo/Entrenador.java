
package poyecto.poo;


public class Entrenador {
    
    String nombre;
    int edad;
    String nacionalidad;

    public Entrenador(String nombre, int edad, String nacionalidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
    }

    public void entrenarEquipo(){
    
    }
    
    public void calentamiento(){
        
    }
    
    public void recuperar(){
        
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
    
    
}
