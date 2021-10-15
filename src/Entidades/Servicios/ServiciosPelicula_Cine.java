package Entidades.Servicios;

import Entidades.Pelicula;
import java.util.ArrayList;

public class ServiciosPelicula_Cine {

    private ArrayList<Pelicula> cartelera = new ArrayList();
    
    public void setCartelera(ArrayList<Pelicula> a){
        cartelera = a;
    }
    
    public ArrayList<Pelicula> getCartelera(){
        return cartelera;
    }
    
    public void mostrarPeliculasTodas(){
        for(Pelicula p : cartelera){
            System.out.println("Titulo: "+p.getTitulo());
            System.out.println("--------------------------------------");
        }
    }
    
    public void mostrarPelDurMay1H(){
        System.out.println("Peliculas con duracion mayor a 1 hora:");
        for(Pelicula p : cartelera){
            if(p.getDuracion() > 1){
                System.out.println(p.getTitulo());
            }
        }
    }
    
    
    
}
