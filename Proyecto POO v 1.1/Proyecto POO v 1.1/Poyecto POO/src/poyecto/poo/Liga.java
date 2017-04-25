
package poyecto.poo;


public class Liga {
    
    String nombre;
    String pais;
    String division;
    Equipo equipo;
    Categoria categoria;

    public Liga(String nombre, String pais, String division, Equipo equipo, Categoria categoria) {
        this.nombre = nombre;
        this.pais = pais;
        this.division = division;
        this.equipo = equipo;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }

    public String getDivision() {
        return division;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    

    
}