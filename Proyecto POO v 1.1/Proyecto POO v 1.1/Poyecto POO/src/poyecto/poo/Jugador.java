
package poyecto.poo;


public class Jugador {
    
    String nombre;
    int edad;
    int peso;
    double altura;
    String nacionalidad;
    String posicion;

    public Jugador(String nombre, int edad, int peso, double altura, String nacionalidad, String posicion) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.nacionalidad = nacionalidad;
        this.posicion = posicion;
    }

    public void entrenar(){
        
    }
    
    public void marcarGol(){
        
    }
    
    public void defender(){
        
    }
    
    public void atacar(){
        
    }
    
    public void atajar(){
        
    }
    
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    
    
}