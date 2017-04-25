
package poyecto.poo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Index {
    
   public static void main(String[] args){
       
       
       List<Jugador> listJugadores = new ArrayList<>();
       List<Entrenador> listEntrenadores = new ArrayList<>();
       List<Tecnico> listTecnicos = new ArrayList<>();
       List<Medico> listMedicos = new ArrayList<>();
       List<Patrocinador> listPatrocinadores = new ArrayList<>();
       List<Ciudad> listCiudades = new ArrayList<>();
       List<Categoria> listCategorias = new ArrayList<>();
       List<Arbitro> listArbitros = new ArrayList<>();
       List<Estadio> listEstadios = new ArrayList<>();
       List<Equipo> listEquipos = new ArrayList<>();
              
       Torneo t1=new Torneo("UEFA Champions league","Europa","La orejona");
       
       listJugadores.add(new Jugador("Cristiano Ronaldo",30,79,1.90,"Portugues","Delantero"));
       listEntrenadores.add(new Entrenador("Jorge de Astillon",39,"Español"));
       listTecnicos.add(new Tecnico("Carlos Ancelotti",43,"Italiano"));
       listMedicos.add(new Medico("Carlo Sorein",51,"Serbio"));
       listPatrocinadores.add(new Patrocinador("Fly Emirates","Transporte"));
       listCiudades.add(new Ciudad("Madrid","España"));
       listCategorias.add(new Categoria("Porfesional"));
       listArbitros.add(new Arbitro("Robert White",45,"Americano",165));
       
       listEstadios.add(new Estadio("Santiago Bernabei",88954,listCiudades.get(0)));
       
       listEquipos.add(new Equipo("Real Madrid",listJugadores.get(0),listEntrenadores.get(0),listTecnicos.get(0),listMedicos.get(0),listPatrocinadores.get(0), listEstadios.get(0),t1));
       
                         
       Liga l=new Liga("Liga Española","España","Primera",listEquipos.get(0),listCategorias.get(0));
       Partido partido=new Partido(new Date(2017,05,20),listEquipos.get(0),listArbitros.get(0),listEstadios.get(0));
       
       
   }
    
}